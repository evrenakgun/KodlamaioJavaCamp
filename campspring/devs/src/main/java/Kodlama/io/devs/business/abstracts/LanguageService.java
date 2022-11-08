package Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.devs.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.devs.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.devs.business.responses.languageResponses.GetWithIdLanguageResponse;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	
	GetWithIdLanguageResponse getWithId(int id);
	
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void update(int id, UpdateLanguageRequest updateLanguageRequest) throws Exception;
	void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;
}
