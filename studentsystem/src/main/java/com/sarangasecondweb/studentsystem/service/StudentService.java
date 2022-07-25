package com.sarangasecondweb.studentsystem.service;

import com.sarangasecondweb.studentsystem.model.Student;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
