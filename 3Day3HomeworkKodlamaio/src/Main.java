import business.concretes.CourseManager;
import core.abstracts.Logger;
import core.concretes.DatabaseLogger;
import core.concretes.FileLogger;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.JdbcCourseDao;
import entities.concretes.Course;

public class Main {

	public static void main(String[] args) {

		Course course = new Course(1, "kemal keskin", "java", "java2022", 1200);
		Course course2 = new Course(3, "ali keskin", "python", "python2022", 10000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager1.add(course2);

	}

}
