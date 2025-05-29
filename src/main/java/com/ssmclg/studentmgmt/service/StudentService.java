package com.ssmclg.studentmgmt.service;

import com.ssmclg.studentmgmt.DTO.Studentdto;
import com.ssmclg.studentmgmt.Entity.StudentEntity;
import com.ssmclg.studentmgmt.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    StudentRepository studentRepository; 
    public void add( Studentdto studentdto) {
        System.out.println("Add Student Details" + studentdto);
        StudentEntity studentEntity=StudentEntity.builder().name(studentdto.getName()).age(studentdto.getAge()).dept(studentdto.getDept()).build();
        studentRepository.save(studentEntity);
    }


    public Studentdto get(String id) {
        StudentEntity studentEntity = studentRepository.findById(id);
        return Studentdto.builder()
                .name(studentEntity.getName())
                .age(studentEntity.getAge())
                .dept(studentEntity.getDept())
                .build();
    }


    public void updatestudent(String id,Studentdto studentdto) {
        StudentEntity studentEntity= studentRepository.findById(id);
                studentEntity.setName(studentdto.getName());
                studentEntity.setAge(studentdto.getAge());
                studentEntity.setDept(studentdto.getDept());
                studentRepository.save(studentEntity);
    }

    public void delete(String id) {
        StudentEntity studentEntity = studentRepository.findById(id);
                studentRepository.delete(studentEntity);
    }

    public List<StudentEntity> getAll() {
        List<StudentEntity> studentEntity= studentRepository.findAll();
            return studentEntity;

    }
}
