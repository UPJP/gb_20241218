package com.codingbox.test.web.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.codingbox.test.web.student.Student;

@Repository
public class StudentRepository {

	private static final Map<Long, Student> store=new HashMap<>();
	private static long sequence = 0L;
	
	public Student save(Student student) {
		student.setId(++sequence);
		store.put(student.getId(), student);
		return student;
	}
	
	public Student findById(Long id) {
		return store.get(id);
	}
	
	public List<Student> findAll(){
		return new ArrayList<Student>(store.values());
	}
	
	public void update(Long studentId, Student upateParam) {
		// item을 먼저 찾는다
		Student findStudent = findById(studentId);
		findStudent.setName(upateParam.getName());
		findStudent.setAge(upateParam.getAge());
		findStudent.setSubjectnum(upateParam.getSubjectnum());
		findStudent.setPhone(upateParam.getPhone());
		findStudent.setAddress(upateParam.getAddress());
	}
}
