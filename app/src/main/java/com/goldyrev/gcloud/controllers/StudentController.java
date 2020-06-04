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

    @GetMapping("student/all")
    public ResponseEntity<List<StudentDTO>> allStudents() {
        List<StudentDTO> allStudents = studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, OK);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<List<StudentDTO>> studentById(@PathVariable("id") Long id) {
        List<StudentDTO> student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, OK);
    }

    @GetMapping("student/all/{group}")
    public ResponseEntity<List<StudentDTO>> allByStudentGroupCode(@PathVariable("group") String group) {
        List<StudentDTO> allByStudentGroup = studentService.getAllStudentsByGroupId(group);
        return new ResponseEntity<>(allByStudentGroup, OK);
    }

    @DeleteMapping("student/delete/{id}")
    public ResponseEntity<String>deleteStudentById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(studentService.deleteStudentByPersonalId(id), OK);
    }

    @PostMapping(path = "student/add")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO) {
        return new ResponseEntity<>(studentService.addStudent(studentDTO), OK);
    }
}
