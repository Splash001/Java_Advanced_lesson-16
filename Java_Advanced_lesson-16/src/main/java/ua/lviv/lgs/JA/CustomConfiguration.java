package ua.lviv.lgs.JA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(0);
		student.setName("Igor");
		student.setAge(22);

		return student;
	}
}