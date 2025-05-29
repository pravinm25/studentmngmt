package com.ssmclg.studentmgmt.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value="Student")
@Builder
@AllArgsConstructor
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private int age;
    private String dept;

}
