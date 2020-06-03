package com.goldyrev.gcloud.entityRepository;

import com.goldyrev.gcloud.entities.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentDTO, Long> {
    List<StudentDTO> findAllByStudentGroupCode(String studentGroupCode);
    //here u can add personal methods
}
