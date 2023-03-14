package controller;

import entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.IStudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentContoller {

    IStudentService service;
    @PostMapping("/RegisterStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student, HttpServletRequest request){
        Student saved =null;
        saved = service.addStudent(student);
        return new ResponseEntity<Student>(saved, HttpStatus.OK);
    }
}
