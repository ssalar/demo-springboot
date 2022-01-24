/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.models;

import java.util.List;

/**
 *
 * @author ssalar
 */
public class Course {
    private int id;
    private int courseName;
    private List<Student> courseStudents;

    public Course(int id, int courseName, List<Student> courseStudents) {
        this.id = id;
        this.courseName = courseName;
        this.courseStudents = courseStudents;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public List<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }
    
    
}











