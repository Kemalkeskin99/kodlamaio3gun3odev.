package business.concretes;

import business.abstracts.CourseService;
import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;

import entities.concretes.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}

	@Override
	public void add(Course course) {
		
	Course[]courses= {
			new Course(1,"kemal keskin","java","java2022",1200),
			new Course(2,"umut aksu","c#","c#2022",1000)
			
	};
	
	for (Course course2 : courses) {
		if( course2.getCourseName()==course.getCourseName() || course.getUnitPrice()<0 || course2.getCategoryName()==course.getCategoryName()) {
			System.out.println("Siteme eklenemedi");
			break;
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.logg();
		}

	}
	}

}
