package com.ssmclg.studentmgmt.Repository;

import com.ssmclg.studentmgmt.Entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntity,Long> {
    StudentEntity findById(String id);
}
