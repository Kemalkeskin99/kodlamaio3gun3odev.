package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("kurs jdbc kullanılarak kaydedildi: " + course.getCourseName());
	}

}
