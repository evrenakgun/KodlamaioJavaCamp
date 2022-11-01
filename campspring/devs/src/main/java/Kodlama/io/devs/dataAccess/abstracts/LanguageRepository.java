package Kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	
	Language getWithId(int id);
	
	void add(Language language);
	void update(int id, Language language);
	void delete(int id, Language language);
}
