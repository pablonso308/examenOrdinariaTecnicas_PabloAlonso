package org.example;

public class Employee {
    private String employeeId;
    private String name;
    private AcademicRecord academicRecord;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.academicRecord = new AcademicRecord();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public AcademicRecord getAcademicRecord() {
        return academicRecord;
    }
}
