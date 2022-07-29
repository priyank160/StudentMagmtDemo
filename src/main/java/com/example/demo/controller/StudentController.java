package com.example.demo.controller;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student20IT160;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    ArrayList<Student20IT160> student = new ArrayList<Student20IT160>(
            Arrays.asList(
                    new Student20IT160(1, "Parth"),
                    new Student20IT160(2, "xyz"),
                    new Student20IT160(3, "pqr"),
                    new Student20IT160(4, "abc")
            )
    );
    // Add student POST
    @PostMapping("/")
    public String addStudent(@RequestBody Student20IT160 student){
    studentRepository.save(student);
    return "student added";
    }
    // Update student PUT
    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id){
        return "Student updated successfully";
    }

    // view student GET
    @GetMapping("/student/{id}")
    public Student20IT160 getStudent(@PathVariable int id){
        for(int i=0; i<student.size();i++){
            Student20IT160 studObj = student.get(i);
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
