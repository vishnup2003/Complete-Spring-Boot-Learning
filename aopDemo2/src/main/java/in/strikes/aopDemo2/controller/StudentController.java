package in.strikes.aopDemo2.controller;

import in.strikes.aopDemo2.dto.Student;
import in.strikes.aopDemo2.service.StudentService;
import in.strikes.aopDemo2.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;

@RestController
@RequestMapping("api/students")
public class StudentController {

    public StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student s= studentService.createStudent(student);
        return ResponseEntity.ok(s);
    }


    @GetMapping
    public ResponseEntity<String> getStudent(){
        String s="All Student Data";
        return ResponseEntity.ok(studentService.getStudent(s));
    }
}
