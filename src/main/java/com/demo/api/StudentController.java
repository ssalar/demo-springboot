/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.api;

import com.demo.models.Student;
import com.demo.service.StudentService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        service.deleteStudent(id);
    }
    
    @GetMapping(path = "{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return service.selectStudentById(id)
                .orElse(null);
    }
    @PutMapping (path = "{id}") 
    public int updateStudentById (@PathVariable ("id") int id, @RequestBody Student student) {
    	return service.updateStudentById(id, student);
    	
    }
    
    
}
