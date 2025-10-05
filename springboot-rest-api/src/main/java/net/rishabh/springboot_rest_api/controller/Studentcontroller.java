package net.rishabh.springboot_rest_api.controller;

import net.rishabh.springboot_rest_api.bean.Student;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Studentcontroller{

    @GetMapping("student")
     public ResponseEntity<Student> getStudent(){
         Student student = new Student(
                 "Srivastava",
                 "Rishabh",
                 5
         );
         return ResponseEntity.ok(student);
     }

     @GetMapping("/students")
     public ResponseEntity<List<Student>> getStudents(){
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Srivastava","Rishabh",1));
        lst.add(new Student("Srivastava","Ayush",2));
        lst.add(new Student("Srivastava","Tikki",3));
        lst.add(new Student("Singh","Ishu",4));
        return ResponseEntity.ok(lst);
     }

     @GetMapping("students/{id}")
     public Student getStudentPathVariable(@PathVariable("id") int StudentID){
        return new Student("Srivastava","Rishabh",StudentID);
     }

     @GetMapping("students/query")
    public Student StudentGetRequest(@RequestParam int id,
                                     @RequestParam String firstName,
                                     @RequestParam String lastName){
        return new Student(lastName,firstName,id);
     }

     @PostMapping("student/create")
     @ResponseStatus(HttpStatus.CREATED)
     public ResponseEntity<Student> createStudent(@RequestBody Student student){
         System.out.println(student.getId());
         System.out.println(student.getFirstName());
         System.out.println(student.getLastName());
         return new ResponseEntity<>(student,HttpStatus.CREATED);
     }

     @PutMapping("student/{id}/update")
     public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentID){
         System.out.println(student.getFirstName());
         System.out.println(student.getLastName());
         return ResponseEntity.ok(student);
     }

     @DeleteMapping("student/{id}/delete")
     public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentID){
         System.out.println(studentID);
         return ResponseEntity.ok("Student Deleted Successfully 💀");
     }
}
