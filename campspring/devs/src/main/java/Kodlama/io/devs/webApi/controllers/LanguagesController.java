package Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.devs.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.devs.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.devs.business.responses.languageResponses.GetWithIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getwithid/{id}")
	public GetWithIdLanguageResponse getWithId(int id) {
		return languageService.getWithId(id);
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.add(createLanguageRequest);
	}

	@PutMapping("/update/{id}")
	public void update(int id, UpdateLanguageRequest updateLanguageRequest) throws Exception {
		languageService.update(id, updateLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		languageService.delete(deleteLanguageRequest);
	}
}
