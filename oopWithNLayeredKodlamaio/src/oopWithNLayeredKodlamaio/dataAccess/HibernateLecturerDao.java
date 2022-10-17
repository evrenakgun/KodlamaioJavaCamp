package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Lecturer;

public class HibernateLecturerDao implements LecturerDao {

	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Hibernate ile veritabanına eklendi.\n"
							+ "Öğretmen ID: " + lecturer.getId() + "\n"
							+ "Öğretmenin Adı: " + lecturer.getFirstName() + "\n"
							+ "Öğretmenin Soyadı: " + lecturer.getLastName());
	}
	
}
