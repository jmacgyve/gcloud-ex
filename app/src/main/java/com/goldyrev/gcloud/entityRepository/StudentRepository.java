package com.goldyrev.gcloud.entityRepository;

import com.goldyrev.gcloud.entities.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentDTO, Long> {
    //here u can add personal methods
    List<StudentDTO> findAllByStudentGroupCode(String studentGroupCode);
    StudentDTO findByStudentPersonalId(Long id);
}
