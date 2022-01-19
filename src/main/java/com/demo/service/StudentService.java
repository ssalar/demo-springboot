/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.models.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ssalar
 */
@Service
public class StudentService {
    
    private final StudentDao studentdao;
    
    @Autowired
    public StudentService(StudentDao studentdao){
        this.studentdao = studentdao;
    }
    
    public Student addStudent(Student student){
        return studentdao.addStudent(student, student.getId());
    }
    
    public List<Student> listStudents(){
        return studentdao.listStudent();
    }
}
