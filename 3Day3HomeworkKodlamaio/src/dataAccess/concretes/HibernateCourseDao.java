package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("kurs hibernate kullanılarak kaydedildi: " + course.getCourseName());
		
	}

}
