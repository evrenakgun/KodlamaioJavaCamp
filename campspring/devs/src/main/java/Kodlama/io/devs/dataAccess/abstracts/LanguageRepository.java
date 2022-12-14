package Kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.devs.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{
	
}
