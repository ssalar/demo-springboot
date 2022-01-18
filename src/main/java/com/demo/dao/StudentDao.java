/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.demo.dao;

import com.demo.models.Student;
import java.util.List;

/**
 *
 * @author ssalar
 */
public interface StudentDao {
    
    Student addStudent(Student student, int id);
    List<Student> listStudent();
    
}
