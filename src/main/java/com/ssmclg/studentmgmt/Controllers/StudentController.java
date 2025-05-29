package com.ssmclg.studentmgmt.Controllers;

import com.ssmclg.studentmgmt.DTO.Studentdto;
import com.ssmclg.studentmgmt.Entity.StudentEntity;
import com.ssmclg.studentmgmt.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/app")
    public void add(@RequestBody Studentdto studentdto)
    {
        studentService.add(studentdto);
    }

        @GetMapping("/get/{id}")
        public Studentdto get(@PathVariable String id) {
            return studentService.get(id);
        }

        @PutMapping("/update/{id}")
        public void update(@PathVariable String id, @RequestBody Studentdto studentdto) {
            studentService.updatestudent(id,studentdto);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable String id) {
            studentService.delete(id);
        }

        @GetMapping("/getall")
        public List<StudentEntity> getAll(){
            return studentService.getAll();
        }

    }


