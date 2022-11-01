package Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	
	Language getWithId(int id);
	
	void add(Language language) throws Exception;
	void update(int id, Language language) throws Exception;
	void delete(int id, Language language) throws Exception;
}
