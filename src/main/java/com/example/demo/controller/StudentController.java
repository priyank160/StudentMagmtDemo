package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    ArrayList<Student> student = new ArrayList<Student>(
            Arrays.asList(
                    new Student(1, "Parth"),
                    new Student(2, "xyz"),
                    new Student(3, "pqr"),
                    new Student(4, "abc")
            )
    );
    // Add student POST
    @PostMapping("/")
    public List<Student> addStudent(@RequestBody Student student){
        this.student.add(student);
        return this.student;
    }
    // Update student PUT
    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id){
        return "Student updated successfully";
    }

    // view student GET
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        for(int i=0; i<student.size();i++){
            Student studObj = student.get(i);
            if (studObj.getId() == id ){
                return student.get(i);
            }
        }
        return null;
    }

    // list all the students GET
    @GetMapping("/listStudents")
    public String listStudents(){
        return "Students list";
    }

    // delete student DELETE
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        return "Student delete mapping";
    }

}
