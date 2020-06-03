package com.goldyrev.gcloud.services;

import com.goldyrev.gcloud.entities.StudentDTO;
import com.goldyrev.gcloud.entityRepository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public String addStudent(StudentDTO studentDTO){
        studentRepository.save(studentDTO);
        return "[addStudent] Student " + studentDTO + " added.";
    }

    @Transactional
    public String deleteStudentByPersonalId(Long id){
        studentRepository.deleteById(id);
        return "[deleteStudentByPersonalId] Student with personalID " + id + " deleted.";
    }

    @Transactional
    public StudentDTO getStudentById(Long id){
        return studentRepository.getOne(id);
    }

    @Transactional
    public List<StudentDTO> getAllStudents(){
        return studentRepository.findAll();
    }

    @Transactional
    public List<StudentDTO> getAllStudentsByGroupId(String groupId){
        return studentRepository.findAllByStudentGroupCode(groupId);
    }
}
