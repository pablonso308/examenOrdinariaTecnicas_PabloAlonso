package org.example;

import java.util.ArrayList;
import java.util.List;

public class AcademicRecord {

    public List<SubjectRecord> subjectRecords;
    private List<String> certificates;

    public AcademicRecord() {
        this.subjectRecords = new ArrayList<>();
        this.certificates = new ArrayList<>();
    }

    public void addSubjectRecord(Subject subject, double grade) {
        subjectRecords.add(new SubjectRecord(subject, grade));
    }

    public void addCertificate(String certificate) {
        certificates.add(certificate);
    }

    public double calculateGPA() {
        double totalGrades = 0.0;
        for (SubjectRecord record : subjectRecords) {
            totalGrades += record.getGrade();
        }
        return subjectRecords.size() > 0 ? totalGrades / subjectRecords.size() : 0.0;
    }

    public List<String> getCertificates() {
        return certificates;
    }
}
