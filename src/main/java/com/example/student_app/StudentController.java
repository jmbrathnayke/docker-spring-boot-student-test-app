package com.example.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    //get students mapping
    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
       return  repo.findAll(); //return the data for database

    }
    //add student mapping
    @RequestMapping("/addStudent")
    public void addStudent(){

         //add new student
        Student s = new Student();
        s.setName("jack");
        s.setAge(26);

        repo.save(s);
    }

}
