package ru.tuba.fullstacklissons.service;

import ru.tuba.fullstacklissons.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();

}
