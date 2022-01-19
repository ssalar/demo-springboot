/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.api;

import com.demo.models.Student;
import com.demo.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ssalar
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    StudentService service;
    
    @Autowired
    public StudentController(StudentService service){
        this.service = service;
    }
    
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }
    
    @GetMapping
    public List<Student> listStudents(){
        return service.listStudents();
    }
    
    
    
    
}
