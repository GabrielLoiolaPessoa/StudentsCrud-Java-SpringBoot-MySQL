package br.com.gabriel.crudtest.controller;

import br.com.gabriel.crudtest.models.Student;
import br.com.gabriel.crudtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/allStudents")
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/findStudent/{id}")
    public Optional<Student> findStudentById(@PathVariable(value = "id")Long studentId){
        return studentService.getAllStudentsById(studentId);
    }

    @PostMapping(value = "/addStudent")
    public void addNewStudent(@RequestBody Student newStudent){
        studentService.addNewStudent(newStudent);
    }

    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewStudent(@RequestBody Student deleteStudent){
        studentService.deleteStudent(deleteStudent);
    }




}
