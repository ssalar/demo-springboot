/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.dao;

import com.demo.models.Student;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author ssalar
 */
public interface StudentDao {
    
    Student addStudent(Student student, int id);
    List<Student> listStudent();
    int deleteStudent (int id);
    
    Optional<Student> selectStudentById(int id);
    
}
