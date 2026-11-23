package in.strikes.aopDemo.aspect;

import in.strikes.aopDemo.dto.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//public class LoggingAspect {

//    @Before("execution(String in.strikes.aopDemo.service.StudentService.createStudent())")
//    public void logBeforeMethod(JoinPoint joinPoint){
//
//        Object[] arr = joinPoint.getArgs();
//
//        System.out.println("Student is going to be saved");
//
//        boolean allowed=false;
//        if(!allowed){
//            throw new RuntimeException("Method Execution not allowed");
//        }
//    }

//    @AfterReturning(value = "execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))",returning = "result")
//    public void logAfterReturningMethod(Student result){
//       // System.out.println("logAfterReturning Method called");
//        result.setName("Rudra");
//        result.setAge(20);
//        System.out.println("Intercepted createStudent()");
//    }

//    @AfterThrowing(value = "execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))",throwing = "exception")
//    public void logAfterThrowingMethod(Throwable exception){
//        System.out.println("Exception type: "+exception.getClass().getName());
//        System.out.println("Exception message: "+exception.getMessage());
//    }

//    @After(value = "execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))")
//    public void logAfterMethod(){
//        System.out.println("logAfterMethod executed");
//    }

//    @Around(value = "execution(* in.strikes.aopDemo.service.StudentService.createStudent(..))")
//    public Object logAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Starting: "+joinPoint.getSignature().getName());
//        try{
//            Object result = joinPoint.proceed();
//            System.out.println("Execution successful");
//            return result;
//        }
//        catch (Exception e){
//            System.out.println("Execution failed: "+e.getMessage());
//            throw e;
//        }
//        finally {
//            System.out.println("Execution completed");
//        }
//    }
//
//    @Around(value = "execution(* in.strikes.aopDemo.service.StudentService.dummyMethod(..))")
//    public Object logAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object[] arr = joinPoint.getArgs();
//        String originalString=(String) arr[0];
//
//        String modifiedString = originalString.toUpperCase();
//        Object[] modifiedArr={modifiedString};
//
//        String returnType=(String) joinPoint.proceed(modifiedArr);
//        returnType=returnType+" :String Intercepted";
//
//        return returnType;

//        Object return1 = joinPoint.proceed();
//        System.out.println("Intercepted request calling again");
//        Object return2 = joinPoint.proceed();
//
//        return return2;
//    }

//}



//Pointcuts parts

@Component
@Aspect
public class LoggingAspect{

//    @Pointcut("within(in.strikes.aopDemo.service..*) && execution(public * * (..))")
//    public void logPublicServiceMethod(){
//        //empty body
//    }

//    @Before("@within(org.springframework.stereotype.Service)")
//    public void logBeforeMethod(){
//        System.out.println("Method Intercepted");
//    }

//    @Before("args(in.strikes.aopDemo.dto.Student) && within(in.strikes.aopDemo.service..*)")
//    public void logBeforeMethod2(){
//        System.out.println("Method Intercepted");
//    }

//    @Before("@args(jdk.jfr.Timestamp) && within(in.strikes.aopDemo.service..*)")
//    public void logBeforeMethod3(){
//        System.out.println("Method Intercepted");
//    }

    @Before("this(in.strikes.aopDemo.service.StudentService)")
    public void logBeforeMethod4(){
        System.out.println("Method Intercepted");
    }


//    @Before("execution(in.strikes.aopDemo.dto.Student in.strikes.aopDemo.service.StudentService.createStudent(in.strikes.aopDemo.dto.Student))")
//    public void logBeforeMethod2(){
//        System.out.println("Method Intercepted");
//    }
}

