package org.example;

public class Subject {
    private String subjectId;
    private String name;
    private int credits;

    // Constructor
    public Subject(String subjectId, String name, int credits) {
        this.subjectId = subjectId;
        this.name = name;
        this.credits = credits;
    }


    // Getters
    public String getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
}

