package br.com.gabriel.crudtest.service;

import br.com.gabriel.crudtest.Repository.StudentRepository;
import br.com.gabriel.crudtest.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getAllStudentsById(Long studentId){

        return studentRepository.findById(studentId);
    }

    public void addNewStudent(Student newStudent){
        studentRepository.save(newStudent);
    }

    public void deleteStudent(Student deleteStudent){
        studentRepository.delete(deleteStudent);
    }

    public void updateStudent(Student updateStudent){
        studentRepository.save(updateStudent);
    }


}
