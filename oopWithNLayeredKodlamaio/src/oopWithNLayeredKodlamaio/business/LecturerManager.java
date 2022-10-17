package oopWithNLayeredKodlamaio.business;

import oopWithNLayeredKodlamaio.core.logging.BaseLogger;
import oopWithNLayeredKodlamaio.dataAccess.LecturerDao;
import oopWithNLayeredKodlamaio.entities.Lecturer;

public class LecturerManager {
	private LecturerDao lecturerDao;
	private BaseLogger[] loggers;
	
	public LecturerManager (LecturerDao lecturerDao, BaseLogger[] loggers) {
		this.lecturerDao = lecturerDao;
		this.loggers = loggers;
	}
	
	public void add (Lecturer lecturer) {
		System.out.println("Öğretmen eklendi.");
		lecturerDao.add(lecturer);
		
		for (BaseLogger logger : loggers) {
			logger.add(lecturer.getFirstName() + " " + lecturer.getLastName());
		}
	}
	
}
