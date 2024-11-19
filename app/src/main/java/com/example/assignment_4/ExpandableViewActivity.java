package com.example.assignment_4;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableViewActivity extends AppCompatActivity {

    private ExpandableListView moduleExpandableListView;
    private ModuleExpandableListAdapter moduleExpandableListAdapter;
    private List<Course> courseList;
    private HashMap<String, List<Module>> moduleDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_view);

        moduleExpandableListView = findViewById(R.id.moduleExpandableListView);
        courseList = new ArrayList<>();
        moduleDataChild = new HashMap<>();

        addCourses();
        moduleExpandableListAdapter = new ModuleExpandableListAdapter(this, courseList, moduleDataChild);
        moduleExpandableListView.setAdapter(moduleExpandableListAdapter);
    }

    private void addCourses() {
//        List<Module> managementModules = new ArrayList<>();
//        managementModules.add(new Module("Module 1: Introduction to Management Principles", "This module covers the basic principles of management, including planning, organizing, leading, and controlling."));
//        managementModules.add(new Module("Module 2: Organizational Behavior", "This module explores how individuals and groups behave within organizations."));
//
//        List<Module> economicsModules = new ArrayList<>();
//        economicsModules.add(new Module("Module 1: Basic Economic Concepts", "An introduction to fundamental economic concepts such as supply and demand."));
//        economicsModules.add(new Module("Module 2: Macroeconomic Indicators", "This module examines key macroeconomic indicators and their implications."));
//
//        List<Module> appDevModules = new ArrayList<>();
//        appDevModules.add(new Module("Module 1: Android Basics", "Learn the basics of Android development, including the Android SDK and development tools."));
//        appDevModules.add(new Module("Module 2: User Interface Design", "This module focuses on designing user-friendly interfaces for mobile applications."));
//
//        List<Module> projectModules = new ArrayList<>();
//        projectModules.add(new Module("Module 1: Project Planning", "Learn how to plan a project effectively, including scope, time, and cost management."));
//        projectModules.add(new Module("Module 2: Project Execution", "This module covers the execution phase of project management, including monitoring and controlling."));
//
//        List<Module> softwareEngModules = new ArrayList<>();
//        softwareEngModules.add(new Module("Module 1: Software Development Life Cycle", "An overview of the software development life cycle and its phases."));
//        softwareEngModules.add(new Module("Module 2: Agile Methodologies", "This module introduces Agile methodologies and their application in software development."));
//
//        List<Module> networksModules = new ArrayList<>();
//        networksModules.add(new Module("Module 1: Network Fundamentals", "Learn the basics of computer networking, including types of networks and protocols."));
//        networksModules.add(new Module("Module 2: Protocols and Standards", "This module covers key networking protocols and standards used in the industry."));
//
//        List<Module> microprocessorModules = new ArrayList<>();
//        microprocessorModules.add(new Module("Module 1: Microprocessor Architecture", "An introduction to the architecture of microprocessors and their components."));
//        microprocessorModules.add(new Module("Module 2: Assembly Language Programming", "Learn the basics of assembly language programming and its applications."));
        List<Module> managementModules = new ArrayList<>();
        managementModules.add(new Module("Module 1: Introduction to Management Principles", "This module covers the basic principles of management, including planning, organizing, leading, and controlling.\nTopics include: Defining management, evolution of management thought, planning processes, organizational structures, leadership styles, and control mechanisms."));
        managementModules.add(new Module("Module 2: Organizational Behavior", "This module explores how individuals and groups behave within organizations.\nTopics Include: Individual differences, perception and attribution, motivation theories, group dynamics, team building, organizational culture, and organizational change."));


        List<Module> economicsModules = new ArrayList<>();
        economicsModules.add(new Module("Module 1: Basic Economic Concepts", "An introduction to fundamental economic concepts such as supply and demand.\nTopics include: Scarcity, opportunity cost, supply and demand curves, market equilibrium, elasticity, and market structures (perfect competition, monopoly, etc.)."));
        economicsModules.add(new Module("Module 2: Macroeconomic Indicators", "This module examines key macroeconomic indicators and their implications.\nTopics include: GDP, inflation, unemployment, interest rates, fiscal policy, monetary policy, and international trade."));

        List<Module> appDevModules = new ArrayList<>();
        appDevModules.add(new Module("Module 1: Android Basics", "Learn the basics of Android development, including the Android SDK and development tools.\nTopics include: Setting up the development environment, Android Studio, creating basic UI elements, Activities and Intents, handling user input, and working with data."));
        appDevModules.add(new Module("Module 2: User Interface Design", "This module focuses on designing user-friendly interfaces for mobile applications.\nTopics include: Principles of UI design, user experience (UX), layout design, Material Design guidelines, user interface elements, and accessibility."));

        List<Module> projectModules = new ArrayList<>();
        projectModules.add(new Module("Module 1: Project Planning", "Learn how to plan a project effectively, including scope, time, and cost management.\nTopics include: Defining project scope, creating a work breakdown structure (WBS), estimating project duration, developing a project schedule, budgeting, and risk management."));
        projectModules.add(new Module("Module 2: Project Execution", "This module covers the execution phase of project management, including monitoring and controlling.\nTopics include: Managing project teams, tracking progress, managing changes, quality control, communication, and project closure."));

        List<Module> softwareEngModules = new ArrayList<>();
        softwareEngModules.add(new Module("Module 1: Software Development Life Cycle", "An overview of the software development life cycle (SDLC) and its phases.\nTopics include: Waterfall model, Agile methodologies, requirements gathering, design, implementation, testing, deployment, and maintenance."));
        softwareEngModules.add(new Module("Module 2: Agile Methodologies", "This module introduces Agile methodologies and their application in software development.\nTopics include: Scrum, Kanban, Lean, Extreme Programming (XP), and the principles of Agile development."));

        List<Module> networksModules = new ArrayList<>();
        networksModules.add(new Module("Module 1: Network Fundamentals", "Learn the basics of computer networking, including types of networks and protocols.\nTopics include: Network topologies (bus, star, ring, mesh), OSI model, TCP/IP model, IP addressing, subnetting, and network devices (routers, switches, hubs)."));
        networksModules.add(new Module("Module 2: Protocols and Standards", "This module covers key networking protocols and standards used in the industry.\nTopics include: TCP, UDP, HTTP, HTTPS, DNS, DHCP, and network security protocols."));

        List<Module> microprocessorModules = new ArrayList<>();
        microprocessorModules.add(new Module("Module 1: Microprocessor Architecture", "An introduction to the architecture of microprocessors and their components.\nTopics include: CPU architecture, registers, memory organization, instruction set architecture (ISA), and bus systems."));
        microprocessorModules.add(new Module("Module 2: Assembly Language Programming", "Learn the basics of assembly language programming and its applications.\nTopics include: Assembly language syntax, instructions, addressing modes, program structure, debugging, and interfacing with hardware."));

        // Adding courses with modules
        courseList.add(new Course("Introduction to Management", "GED-1116", 2, "59 (E)", "Overview of management principles.", managementModules));
        courseList.add(new Course("Macro Economics", "GED-2115", 2, "59 (E)", "Introduction to macroeconomic concepts.", economicsModules));
        courseList.add(new Course("Smartphone Application Development", "CSE-3212", 1.5, "59 (E)", "Fundamentals of developing applications for smartphones.", appDevModules));
        courseList.add(new Course("Project I", "CSE-3240", 2, "59 (E)", "Engagement in project planning and execution.", projectModules));
        courseList.add(new Course("Software Engineering", "CSE-3213", 3, "59 (E)", "Exploration of software development life cycle.", softwareEngModules));
        courseList.add(new Course("Computer Networks", "CSE-3214", 3, "59 (E)", "Introduction to networking concepts and protocols.", networksModules));
        courseList.add(new Course("Microprocessor Design", "CSE-3215", 3, "59 (E)", "Architecture and programming of microprocessors.", microprocessorModules));

        // Populate the moduleDataChild HashMap
        for (Course course : courseList) {
            moduleDataChild.put(course.getTitle(), course.getModules());
        }
    }
}