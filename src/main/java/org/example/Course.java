package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Subject> subjects;

    public Course(String courseName) {
        this.courseName = courseName;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
