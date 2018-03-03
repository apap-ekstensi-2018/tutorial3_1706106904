package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<>();

	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel stdSelected = null;
		for(StudentModel std : studentList) {
			if(std.getNpm().equals(npm)) {
				stdSelected = std;
				break;
			}
		}
		return stdSelected;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public void deleteStudent(StudentModel student) {
		studentList.remove(student);
	}
	
}
