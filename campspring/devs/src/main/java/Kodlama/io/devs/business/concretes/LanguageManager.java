package Kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.devs.business.abstracts.LanguageService;
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
		
		for (Language lang : languageRepository.getAll()) {
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
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public Language getWithId(int id) {
		
		return languageRepository.getWithId(id);
	}

	@Override
	public void add(Language language) throws Exception {
		if (isThere(language)) {
			throw new Exception("Language name already exist.");
		}
		
		if (isEmpty(language)) {
			throw new Exception("Language name is empty or not valid.");
		}
		
		languageRepository.add(language);
	}

	@Override
	public void update(int id, Language language) throws Exception {
		if (languageRepository.getWithId(id) == null) {
			throw new Exception("Language id is not valid.");
		}
		
		if (isThere(language)) {
			throw new Exception("Language name already exist.");
		}
		
		if (isEmpty(language)) {
			throw new Exception("Language name is empty or not valid.");
		}
		
		languageRepository.update(id, language);
	}

	@Override
	public void delete(int id, Language language) throws Exception {
		languageRepository.delete(id, language);
	}
	
}
