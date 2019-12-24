package ua.lviv.lgs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.JA.Student;

public class StudentDaoImpl implements StudentDao {
	List<Student> students = new ArrayList<>();

	@Override
	public void create(Student student) {
		students.add(student);
	}

	@Override
	public Student readById(int id) {
		return students.get(id);
	}

	@Override
	public List<Student> readAll() {
		return students;
	}

	@Override
	public void update(Student student) {
		students.remove(student.getId());
		students.add(student);
	}

	@Override
	public void delete(int id) {
		students.remove(id);
	}
}