package com.ssmclg.studentmgmt.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Studentdto {
   int id;
    String name;
    int age;
    String dept;

}
