package oopWithNLayeredKodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredKodlamaio.core.logging.BaseLogger;
import oopWithNLayeredKodlamaio.dataAccess.CourseDao;
import oopWithNLayeredKodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private BaseLogger[] loggers;
	
	public CourseManager (CourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	List<String> courseNames = new ArrayList<String>();
	
	public void add(Course course) throws Exception {
		for (String courseName : courseNames) {
			if (courseName == course.getCourseName()) {
				throw new Exception("Bu kurs zaten mevcut.");
			}
		}
		
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs ücreti 0' dan küçük olamaz.");
		}
		
		courseNames.add(course.getCourseName());
		courseDao.add(course);
		
		for (BaseLogger logger: loggers) {
			logger.add(course.getCourseName());
		}
	}
}
