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

     @GetMapping("students/query")
    public Student StudentGetRequest(@RequestParam int id,
                                     @RequestParam String firstName,
                                     @RequestParam String lastName){
        return new Student(lastName,firstName,id);
     }

     @PostMapping("student/create")
     @ResponseStatus(HttpStatus.CREATED)
     public Student createStudent(@RequestBody Student student){
         System.out.println(student.getId());
         System.out.println(student.getFirstName());
         System.out.println(student.getLastName());
         return student;
     }

     @PutMapping("student/{id}/update")
     public Student updateStudent(@RequestBody Student student,@PathVariable("id") int studentID){
         System.out.println(student.getFirstName());
         System.out.println(student.getLastName());
         return student;
     }
}
