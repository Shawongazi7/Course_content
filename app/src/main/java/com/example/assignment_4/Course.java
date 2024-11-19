package com.example.assignment_4;

import java.util.List;

public class Course {
    private String title;
    private String code;
    private double credit;
    private String section;
    private String description; // Added description field
    private List<Module> modules; // This will hold module names

    public Course(String title, String code, double credit, String section, String description, List<Module> modules) {
        this.title = title;
        this.code = code;
        this.credit = credit;
        this.section = section;
        this.description = description; // Initialize description
        this.modules = modules;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public double getCredit() {
        return credit;
    }

    public String getSection() {
        return section;
    }

    public String getDescription() {
        return description; // Getter for description
    }

    public List<Module> getModules() {
        return modules;
    }
}


