package org.example;
public class Stakeholder {
    private String name;
    private String role;

    public Stakeholder(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
