package Kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "C"));
		languages.add(new Language(5, "Swift"));
		languages.add(new Language(6, "JavaScript"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getWithId(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void update(int id, Language language) {
		Language reworkedLanguage = getWithId(id);
		reworkedLanguage.setName(language.getName());
		
	}

	@Override
	public void delete(int id, Language language) {
		language = getWithId(id);
		languages.remove(language);
		
	}

}
