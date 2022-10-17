package oopWithNLayeredKodlamaio;

import oopWithNLayeredKodlamaio.business.CategoryManager;
import oopWithNLayeredKodlamaio.business.CourseManager;
import oopWithNLayeredKodlamaio.business.LecturerManager;
import oopWithNLayeredKodlamaio.core.logging.BaseLogger;
import oopWithNLayeredKodlamaio.core.logging.DatabaseLogger;
import oopWithNLayeredKodlamaio.core.logging.FileLogger;
import oopWithNLayeredKodlamaio.core.logging.MailLogger;
import oopWithNLayeredKodlamaio.dataAccess.HibernateCategoryDao;
import oopWithNLayeredKodlamaio.dataAccess.HibernateCourseDao;
import oopWithNLayeredKodlamaio.dataAccess.HibernateLecturerDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcCategoryDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcCourseDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcLecturerDao;
import oopWithNLayeredKodlamaio.entities.Category;
import oopWithNLayeredKodlamaio.entities.Course;
import oopWithNLayeredKodlamaio.entities.Lecturer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Lecturer lecturer = new Lecturer();
		lecturer.setId(1);
		lecturer.setFirstName("Engin");
		lecturer.setLastName("Demiroğ");
		
		Lecturer lecturer2 = new Lecturer();
		lecturer2.setId(2);
		lecturer2.setFirstName("II. Engin");
		lecturer2.setLastName("Demiroğ");
		
		LecturerManager lecturerManager = new LecturerManager(new HibernateLecturerDao(), loggers);
		LecturerManager lecturerManager2 = new LecturerManager(new JdbcLecturerDao(), loggers);
		lecturerManager.add(lecturer);
		System.out.println("----------------------------------------");
		lecturerManager2.add(lecturer2);
		System.out.println("----------------------------------------");
		
		Category category = new Category();
		category.setId(1);
		category.setCategoryName("Yazılım");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		System.out.println("----------------------------------------");
		categoryManager2.add(category);
		System.out.println("----------------------------------------");
		
		Course course = new Course();
		course.setId(1);
		course.setCourseName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course.setCourseLecturer(lecturer.getFirstName() + " " + lecturer.getLastName());
		course.setCoursePrice(0);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		course2.setCourseLecturer(lecturer2.getFirstName() + " " + lecturer2.getLastName());
		course2.setCoursePrice(-50);
		
		Course course3 = new Course();
		course3.setId(2);
		course3.setCourseName("Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)");
		course3.setCourseLecturer(lecturer2.getFirstName() + " " + lecturer2.getLastName());
		course3.setCoursePrice(1000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);
		CourseManager courseManager3 = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		System.out.println("----------------------------------------");
		courseManager2.add(course2);
		System.out.println("----------------------------------------");
		courseManager3.add(course3);
	}

}
