package Kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.devs.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.devs.business.responses.languageResponses.GetWithIdLanguageResponse;
import Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public boolean isThere(Language language) {
		String languageName = language.getName().trim(); //Eğer kullanıcı dilin başına veya sonuna boşluk eklerse equals metotu düzgün çalışmayacağı için öncelikle boşluklardan kurtulduk.
		
		for (Language lang : languageRepository.findAll()) {
			if (lang.getName().equalsIgnoreCase(languageName)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isEmpty(Language language) {
		String languageName = language.getName().trim(); //Yazılan dilin başına veya sonuna konulmuş boşluklardan kurtulmak için öncelikle böyle bir yol izledik.
		
		if (languageName.isBlank()) {
			return false;
		}
		return true;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> getAllLanguagesResponses = new ArrayList<GetAllLanguagesResponse>();
		
		for (Language language : languages) {
			GetAllLanguagesResponse languageResponse = new GetAllLanguagesResponse();
			languageResponse.setId(language.getId());
			languageResponse.setName(language.getName());
			getAllLanguagesResponses.add(languageResponse);
		}
		return getAllLanguagesResponses;
	}

	@Override
	public GetWithIdLanguageResponse getWithId(int id) {
		Language language = languageRepository.findById(id).get();
		GetWithIdLanguageResponse idResponse = new GetWithIdLanguageResponse();
		idResponse.setName(language.getName());
		return idResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		
		if (isThere(language)) {
			throw new Exception("Language name already exist.");
		}
		
		if (isEmpty(language)) {
			throw new Exception("Language name is empty or not valid.");
		}
		
		languageRepository.save(language);
	}

	@Override
	public void update(int id, UpdateLanguageRequest updateLanguageRequest) throws Exception {
		Language language = languageRepository.findById(id).get();
		language.setName(updateLanguageRequest.getName());
		
		if (isThere(language)) {
			throw new Exception("Language name already exist.");
		}
		
		if (isEmpty(language)) {
			throw new Exception("Language name is empty or not valid.");
		}
		
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		languageRepository.deleteById(deleteLanguageRequest.getId());
		
	}

	
}
