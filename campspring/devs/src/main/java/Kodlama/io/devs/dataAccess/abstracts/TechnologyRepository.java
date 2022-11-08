package Kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.devs.entities.concretes.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
