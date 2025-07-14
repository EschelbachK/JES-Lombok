package org.example;

import lombok.*;

import java.util.List;

// Data, generiert automatisch: Getter, Setter, equals, hashCode, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
