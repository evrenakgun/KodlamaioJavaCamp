package oopWithNLayeredKodlamaio.entities;

public class Course {
	private int id;
	private String courseName;
	private String courseLecturer;
	private double coursePrice;
	
	public Course () {
		
	}
	
	public Course (int id, String courseName, String courseLecturer, double coursePrice) {
		this.id = id;
		this.courseName =courseName;
		this.courseLecturer = courseLecturer;
		this.coursePrice = coursePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseLecturer() {
		return courseLecturer;
	}

	public void setCourseLecturer(String courseLecturer) {
		this.courseLecturer = courseLecturer;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
}
