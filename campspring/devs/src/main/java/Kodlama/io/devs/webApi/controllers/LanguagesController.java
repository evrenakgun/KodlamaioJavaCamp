package Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getwithid")
	public Language getWithId(int id) {
		return languageService.getWithId(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Language language) throws Exception {
		languageService.add(language);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Language language) throws Exception {
		languageService.update(id, language);
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable int id, @RequestBody Language language) throws Exception {
		languageService.delete(id, language);
	}
}
