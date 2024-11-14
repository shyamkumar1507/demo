package com.example.demo;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Student {
    private String name;
    private List<Subject> subjects;
}
