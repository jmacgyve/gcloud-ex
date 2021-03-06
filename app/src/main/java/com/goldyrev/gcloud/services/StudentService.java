package com.goldyrev.gcloud.services;

import com.goldyrev.gcloud.entities.StudentDTO;
import com.goldyrev.gcloud.entityRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO addStudent(StudentDTO studentDTO){
        return studentRepository.save(studentDTO);
    }

    public String deleteStudentByPersonalId(Long id){
        studentRepository.deleteById(id);
        return "[deleteStudentByPersonalId] Student with personalID " + id + " deleted.";
    }

    public List<StudentDTO> getStudentById(Long id){
        return studentRepository.findByStudentPersonalId(id);
    }

    public List<StudentDTO> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<StudentDTO> getAllStudentsByGroupId(String groupId){
        return studentRepository.findAllByStudentGroupCode(groupId);
    }
}
