package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Studenten mit Builder erstellen
        Student s1 = Student.builder()
                .id(1)
                .name("Lena")
                .address("Köln")
                .grade(1.7)
                .build();

        Student s2 = Student.builder()
                .id(2)
                .name("Jonas")
                .address("München")
                .grade(2.3)
                .build();

        // Student mit "with" aktualisieren
        Student s1With = s1.withGrade(1.3);

        // Lehrer erstellen
        Teacher t1 = Teacher.builder()
                .id(101)
                .name("Frau Dr. Maier")
                .subject("Physik")
                .build();

        // Kurs erstellen
        Course course = Course.builder()
                .id(2001)
                .name("Physik I")
                .teacher(t1)
                .students(List.of(s1With, s2))
                .build();

        // Kurs mit geändertem Namen
        Course renamedCourse = course.withName("Physik Grundlagen");

        Teacher reName = t1.withName("Herr Dr. Maier");
        System.out.println(reName);

        // 🔎 Ausgabe
        System.out.println("Original Student: " + s1);
        System.out.println("WithStudent: " + s1With);
        System.out.println("Original Course: " + course);
        System.out.println("WithCourse: " + renamedCourse);
    }

}
