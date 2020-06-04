package com.goldyrev.gcloud.controllers;

import com.goldyrev.gcloud.entities.StudentDTO;
import com.goldyrev.gcloud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<String> healthcheck() {
        return ResponseEntity.ok("");
    }

    @GetMapping("students/all")
    public ResponseEntity<List<StudentDTO>> allStudents(){
        List<StudentDTO> allStudents = studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, OK);
    }

    @GetMapping("students/{id}")
    public ResponseEntity<StudentDTO> studentById(@PathVariable("id") Long id){
        StudentDTO studentById =  studentService.getStudentById(id);
        return new ResponseEntity<>(studentById, OK);
    }

    @GetMapping("student/all/{group}")
    public ResponseEntity<List<StudentDTO>> allByStudentGroupCode(@PathVariable("group") String group){
        List<StudentDTO> allByStudentGroup = studentService.getAllStudentsByGroupId(group);
        return new ResponseEntity<>(allByStudentGroup, OK);
    }

    @DeleteMapping("student/delete/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
       studentService.deleteStudentByPersonalId(id);
    }

    @PostMapping("student/add")
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO){
        return studentService.addStudent(studentDTO);
    }
//    public void addStudent(@RequestParam("studentPersonalId") Long studentPersonalId,
//                                             @RequestParam("studentName") String studentName,
//                                             @RequestParam("studentSecondName") String studentSecondName,
//                                             @RequestParam("studentGroupCode") String studentGroupCode){
//        StudentDTO studentDTO = new StudentDTO(studentPersonalId, studentName, studentSecondName, studentGroupCode);
//        studentService.addStudent(studentDTO);
//    }
}
