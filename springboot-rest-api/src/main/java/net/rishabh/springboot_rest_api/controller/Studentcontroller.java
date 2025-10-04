package net.rishabh.springboot_rest_api.controller;

import net.rishabh.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller{

    @GetMapping("student")
     public Student getStudent(){
         Student student = new Student(
                 "Srivastava",
                 "Rishabh",
                 5
         );
         return student;
     }
}
