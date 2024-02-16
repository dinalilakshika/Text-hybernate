package org.example.entity;


import lombok.*;
import org.example.dto.StudentDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Student extends StudentDto {
    private String id;
    private String name;
    private String address;
}
