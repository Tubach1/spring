package ru.tuba.fullstacklissons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tuba.fullstacklissons.model.Student;
import ru.tuba.fullstacklissons.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added";
    }
    @GetMapping("/getAll")
    public List<Student> allStudent(){
        return studentService.getAllStudent();
    }
}
