package org.example;

import lombok.Builder;
import lombok.ToString;
import lombok.With;

@With
@ToString
@Builder
public class Teacher {
    private final int id;
    private final String name;
    private final String subject;
}
