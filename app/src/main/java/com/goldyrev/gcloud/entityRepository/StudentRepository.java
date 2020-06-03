package com.goldyrev.gcloud.entityRepository;

import com.goldyrev.gcloud.entities.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentDTO, Long> {
    List<StudentDTO> findAllByStudentGroupCode(String studentGroupCode);
    //here u can add personal methods
}
