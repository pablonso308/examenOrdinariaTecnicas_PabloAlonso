package org.example;
public class SubjectRecord {
    private Subject subject;
    private double grade;

    public SubjectRecord(Subject subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }
}
