package entities.concretes;

import entities.abstracts.Entity;

public class Course implements Entity {

	private int courseId;
	private String teacherName;
	private String categoryName;
	private String courseName;
	private double unitPrice;

	public Course() {

	}

	public Course(int courseId, String teacherName, String categoryName, String courseName, double unitPrice) {
		super();
		this.courseId = courseId;
		this.teacherName = teacherName;
		this.categoryName = categoryName;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
