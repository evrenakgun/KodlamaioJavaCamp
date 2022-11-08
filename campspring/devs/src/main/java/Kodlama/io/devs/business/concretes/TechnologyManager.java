package Kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.devs.business.abstracts.TechnologyService;
import Kodlama.io.devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.devs.business.responses.technologyResponses.GetAllTechnologiesResponse;
import Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.devs.entities.concretes.Language;
import Kodlama.io.devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> getAllTechnologiesResponses = new ArrayList<GetAllTechnologiesResponse>();
		
		for (Technology technology : technologies) {
			GetAllTechnologiesResponse technologyResponse = new GetAllTechnologiesResponse();
			technologyResponse.setTechnologyName(technology.getName());
			technologyResponse.setLanguageName(technology.getLanguage().getName());
			getAllTechnologiesResponses.add(technologyResponse);
		}
		return getAllTechnologiesResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		Language language = languageRepository.findById(createTechnologyRequest.getId()).get();
		technology.setName(createTechnologyRequest.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		Technology technology = technologyRepository.findById(id).get();
		Language language = languageRepository.findById(updateTechnologyRequest.getId()).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
	}

}
