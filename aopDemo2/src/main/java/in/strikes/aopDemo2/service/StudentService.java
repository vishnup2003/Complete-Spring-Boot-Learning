package in.strikes.aopDemo2.service;

import in.strikes.aopDemo2.annotation.TrackExecutionTime;
import in.strikes.aopDemo2.dto.Student;
import jdk.jfr.Timestamp;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

    @TrackExecutionTime(warnAfter = 2000,operation = "Creating New Student")
    public Student createStudent(Student student){
        System.out.println("Student saved");
        //throw new RuntimeException("Some error occured");
        return student;
    }

    @TrackExecutionTime(warnAfter = 1500,operation = "Get Student Data")
    public String getStudent(String s){
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){}
        System.out.println(s);
        return s;
    }

    public int dummyMethod(){
        return 0;
    }
}
