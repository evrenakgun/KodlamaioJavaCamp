package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi.\n"
				+ "Kurs ID: " + course.getId() + "\n"
				+ "Kurs Adı: " + course.getCourseName() + "\n"
				+ "Kursun Öğretmeni: " + course.getCourseLecturer() + "\n"
				+ "Kursun Ücreti: " + course.getCoursePrice());
	}

}
