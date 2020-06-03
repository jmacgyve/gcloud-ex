package com.goldyrev.gcloud.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class StudentDTO {

    public StudentDTO(Long studentPersonalId, String studentName, String studentSecondName, String studentGroupCode) {
        this.studentPersonalId = studentPersonalId;
        this.studentName = studentName;
        this.studentSecondName = studentSecondName;
        this.studentGroupCode = studentGroupCode;
    }


    public Long getStudentPersonalId() {
        return studentPersonalId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSecondName() {
        return studentSecondName;
    }

    public String getStudentGroupCode() {
        return studentGroupCode;
    }

    public void setStudentPersonalId(Long studentPersonalId) {
        this.studentPersonalId = studentPersonalId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSecondName(String studentSecondName) {
        this.studentSecondName = studentSecondName;
    }

    public void setStudentGroupCode(String studentGroupCode) {
        this.studentGroupCode = studentGroupCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentPersonalId;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "student_second_name", nullable = false)
    private String studentSecondName;

    @Column(name = "student_groupid", nullable = false)
    private String studentGroupCode;

    @Override
    public String toString(){
        return "Student {" +
                "id = " + studentPersonalId + " " +
                "Name = " + studentName + " " +
                "Second name = " + studentSecondName + " " +
                "Student Group Code = " + studentGroupCode + " " +
                "}";
    }
}
