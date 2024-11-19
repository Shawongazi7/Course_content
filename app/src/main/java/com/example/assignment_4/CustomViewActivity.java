package com.example.assignment_4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomViewActivity extends AppCompatActivity {

    private ListView courseListView;
    private CourseListAdapter courseListAdapter;
    private List<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        courseListView = findViewById(R.id.courseListView);

        // Initialize course list
        courseList = new ArrayList<>();
        addCourses();

        // Set up course list adapter
        courseListAdapter = new CourseListAdapter(this, courseList);
        courseListView.setAdapter(courseListAdapter);
    }

    private void addCourses() {
        // Add courses without modules
        courseList.add(new Course("Introduction to Management", "GED-1116", 2, "59 (E)",
                "This course provides an overview of management principles and practices, focusing on organizational behavior and decision-making.",new ArrayList<>()));

        courseList.add(new Course("Macro Economics", "GED-2115", 2, "59 (E)",
                "An introduction to macroeconomic concepts including inflation, unemployment, and monetary policy.",new ArrayList<>()));

        courseList.add(new Course("Smartphone Application Development", "CSE-3212", 1.5, "59 (E)",
                "This course covers the fundamentals of developing applications for smartphones, focusing on Android development and user interface design.",new ArrayList<>()));

        courseList.add(new Course("Project I", "CSE-3240", 2, "59 (E)",
                "A practical course where students engage in project planning and execution, applying project management principles.",new ArrayList<>()));

        courseList.add(new Course("Software Engineering", "CSE-3213", 3, "59 (E)",
                "This course explores software development methodologies, including Agile and Waterfall, and emphasizes the software development life cycle.",new ArrayList<>()));

        courseList.add(new Course("Computer Networks", "CSE-3231", 3, "59 (E)",
                "An introduction to computer networking concepts, including network architecture, protocols, and security.",new ArrayList<>()));

        courseList.add(new Course("Microprocessor, Assembly Language and Computer Interfacing", "CSE-3201", 3, "59 (E)",
                "This course covers the architecture of microprocessors, assembly language programming, and interfacing techniques.",new ArrayList<>()));
    }
}