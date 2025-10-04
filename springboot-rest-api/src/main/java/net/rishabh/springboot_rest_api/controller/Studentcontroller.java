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

     @GetMapping("/students")
     public List<Student> getStudents(){
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Srivastava","Rishabh",1));
        lst.add(new Student("Srivastava","Ayush",2));
        lst.add(new Student("Srivastava","Tikki",3));
        lst.add(new Student("Singh","Ishu",4));
        return lst;
     }

      
     @GetMapping("students/{id}")
     public Student getStudentPathVariable(@PathVariable("id") int StudentID){
        return new Student("Srivastava","Rishabh",StudentID);
     }
}
