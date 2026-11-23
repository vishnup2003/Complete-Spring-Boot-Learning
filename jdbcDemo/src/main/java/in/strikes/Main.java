package in.strikes;

import in.strikes.model.Student;
import in.strikes.repository.StudentRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){

        StudentRepository studentRepository=new StudentRepository();

        //studentRepository.createStudent(new Student("Rudra","r@gmail.com",20));

        //studentRepository.updateStudent(new Student("Rishabh Yadav","ry@gmail.com",21),5L);

        //studentRepository.deleteStudent(7L);

        //studentRepository.getStudentById(5L);

        //studentRepository.getStudent();
    }
}


//   jdbc:mysql://localhost:3306/