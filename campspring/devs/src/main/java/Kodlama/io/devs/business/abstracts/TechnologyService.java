package Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.devs.business.responses.technologyResponses.GetAllTechnologiesResponse;

public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();
	
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception;
	void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;
}
