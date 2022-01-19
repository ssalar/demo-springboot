/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.dao;

import com.demo.models.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ssalar
 */
@Repository
public class StudentDaoImpl implements StudentDao{
    
    private List<Student> students = new ArrayList<>();
    
    @Override
    public Student addStudent(Student student, int id) {
        students.add(new Student(id, student.getFirstName(), student.getLastName()));
        return student;
    }

    @Override
    public List<Student> listStudent() {
        return students;
    }

    @Override
    public int deleteStudent(int id) {
	for (Student student : students) {
            if (student.getId()== id) {
                students.remove(student);
                    return 1;
		}
	}
	return 0;
    }


    @Override
    public Optional<Student> selectStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }

}
