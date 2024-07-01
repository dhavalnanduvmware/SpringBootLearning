package com.learn.springboot.through_tutorials_rest_api.controller;

import com.learn.springboot.through_tutorials_rest_api.bean.Marks;
import com.learn.springboot.through_tutorials_rest_api.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    // http://localhost:8080/studentdetails
    @GetMapping("/studentdetails")
   public Student getStudentDetails() {
        Student dhaval = new Student(1001, "Dhaval", "Nandu");
        return dhaval;
   }

   // http://localhost:8080/allStudents
   @GetMapping("allStudents")
   public List<Student> getStudents() {
       List<Student> allStudents = createFiveStudentsWithMarks();
       return  allStudents;
   }

    // {id} --> URI Template Variable
   // http://localhost:8080/students/id/1
   @GetMapping("students/{id}")
   public Student getStudentById(@PathVariable int id) {
       List<Student> allStudents = createFiveStudentsWithMarks();
       Student reply = allStudents.stream().filter(student -> id == student.getId()).findFirst().get();
       return reply;
   }

    // {first-name} --> URI Template Variable
    // http://localhost:8080/students/firstname/Dhaval
    @GetMapping("students/firstname/{first-name}")
    public List<Student> getStudentByFirstName(@PathVariable("first-name") String firstName) {
        List<Student> allStudents = createFiveStudentsWithMarks();
        List<Student> matchingfirstNameStudents = allStudents.stream().filter(student -> firstName.equalsIgnoreCase(student.getFirstName())).collect(Collectors.toList());
        return matchingfirstNameStudents;
    }

    // ?lastName=Nandu --> Query Variable
    // http://localhost:8080/students/lastname?lastName=nandu
    @GetMapping("/students/lastname")
    public List<Student> getStudentsByLastName(@RequestParam String lastName) {
        List<Student> allStudents = createFiveStudentsWithMarks();
        List<Student> matchingLastNameStudents = allStudents.stream().filter(student -> lastName.equalsIgnoreCase(student.getLastName())).collect(Collectors.toList());
        return matchingLastNameStudents;
    }

    // http://localhost:8080/student/create
    @PostMapping("/student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }


    private List<Student> createFiveStudentsWithMarks() {
       List<Student> allStudents = new ArrayList<>();
       Student student1 = new Student(1001, "Dhaval", "Nandu");
       Marks eng1 = new Marks("English", 70);
       Marks maths1 = new Marks("Mathematics", 91);
       student1.setEnglishMarks(eng1);
       student1.setMathematicsMarks(maths1);

       Student student2 = new Student(1002, "Shraddha", "Rai");
       Marks eng2 = new Marks("English", 72);
       Marks maths2 = new Marks("Mathematics", 93);
       student2.setEnglishMarks(eng2);
       student2.setMathematicsMarks(maths2);

       Student student3 = new Student(1003, "Sammy", "Rai");
       Marks eng3 = new Marks("English", 74);
       Marks maths3 = new Marks("Mathematics", 95);
       student3.setEnglishMarks(eng3);
       student3.setMathematicsMarks(maths3);

       Student student4 = new Student(1004, "Neha", "Rai");
       Marks eng4 = new Marks("English", 76);
       Marks maths4 = new Marks("Mathematics", 97);
       student4.setEnglishMarks(eng4);
       student4.setMathematicsMarks(maths4);

       Student student5 = new Student(1005, "Baby", "Nandu");
       Marks eng5 = new Marks("English", 78);
       Marks maths5 = new Marks("Mathematics", 99);
       student5.setEnglishMarks(eng5);
       student5.setMathematicsMarks(maths5);

       allStudents.add(student1);
       allStudents.add(student2);
       allStudents.add(student3);
       allStudents.add(student4);
       allStudents.add(student5);

       return allStudents;
   }
}
