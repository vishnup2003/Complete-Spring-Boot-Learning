package in.strikes.aopDemo.controller;

import in.strikes.aopDemo.dto.Student;
import in.strikes.aopDemo.service.StudentService;
import in.strikes.aopDemo.service.StudentServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;

@RestController
@RequestMapping("api/students")
public class StudentController {

    public StudentServiceInterface studentService;

    public StudentController(StudentServiceInterface studentService){
        this.studentService=studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
       Student s= studentService.createStudent(student);
       return ResponseEntity.ok(s);
    }

//    @GetMapping
//    public ResponseEntity<String> dummyMethod(){
//        String s="vishnu";
//        return ResponseEntity.ok(studentService.dummyMethod(s));
//    }

    @GetMapping
    public ResponseEntity<String> getStudent(){
        String s="All Student Data";
        return ResponseEntity.ok(studentService.getStudent(s));
    }
}
