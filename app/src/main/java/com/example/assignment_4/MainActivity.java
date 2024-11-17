package com.example.assignment_4;

//import android.os.Bundle;
//import android.widget.ExpandableListView;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class MainActivity extends AppCompatActivity {
//
//    private ListView listView;
//    private ExpandableListView expandableListView;
//    private CustomListAdapter listAdapter;
//    private CustomExpandableListAdapter expandableListAdapter;
//    private List<String> listViewData;
//    private List<String> expandableListDataHeader;
//    private HashMap<String, List<String>> expandableListDataChild;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        listView = findViewById(R.id.listView);
//        expandableListView = findViewById(R.id.expandableListView);
//
//        prepareListViewData();
//        prepareExpandableListData();
//
//        // Set up ListView
//        listAdapter = new CustomListAdapter(this, listViewData);
//        listView.setAdapter(listAdapter);
//
//        // Set up ExpandableListView
//        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListDataHeader, expandableListDataChild);
//        expandableListView.setAdapter(expandableListAdapter);
//    }
//
//    private void prepareListViewData() {
//        listViewData = new ArrayList<>();
//        listViewData.add("List Item 1");
//        listViewData.add(" List Item 2");
//        listViewData.add("List Item 3");
//        listViewData.add("List Item 4");
//    }
//
//    private void prepareExpandableListData() {
//        expandableListDataHeader = new ArrayList<>();
//        expandableListDataChild = new HashMap<>();
//
//        // Adding header data
//        expandableListDataHeader.add("Group 1");
//        expandableListDataHeader.add("Group 2");
//        expandableListDataHeader.add("Group 3");
//
//        // Adding child data
//        List<String> group1 = new ArrayList<>();
//        group1.add("Item 1.1");
//        group1.add("Item 1.2");
//
//        List<String> group2 = new ArrayList<>();
//        group2.add("Item 2.1");
//        group2.add("Item 2.2");
//        group2.add("Item 2.3");
//
//        List<String> group3 = new ArrayList<>();
//        group3.add("Item 3.1");
//
//        expandableListDataChild.put(expandableListDataHeader.get(0), group1);
//        expandableListDataChild.put(expandableListDataHeader.get(1), group2);
//        expandableListDataChild.put(expandableListDataHeader.get(2), group3);
//    }
//}




import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView courseListView;
    private ExpandableListView moduleExpandableListView;
    private CourseListAdapter courseListAdapter;
    private ModuleExpandableListAdapter moduleExpandableListAdapter;
    private List<Course> courseList;
    private HashMap<String, List<String>> moduleDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseListView = findViewById(R.id.courseListView);
        moduleExpandableListView = findViewById(R.id.moduleExpandableListView);

        // Initialize course list
        courseList = new ArrayList<>();
        moduleDataChild = new HashMap<>();

        // Sample data for courses and modules
        addCourses();

        // Set up course list adapter
        courseListAdapter = new CourseListAdapter(this, courseList);
        courseListView.setAdapter(courseListAdapter);

        // Set up module expandable list adapter
        moduleExpandableListAdapter = new ModuleExpandableListAdapter(this, courseList, moduleDataChild);
        moduleExpandableListView.setAdapter(moduleExpandableListAdapter);
    }

    private void addCourses() {
        // Sample modules for each course
        List<String> managementModules = new ArrayList<>();
        managementModules.add("Module 1: Introduction to Management Principles");
        managementModules.add("Module 2: Organizational Behavior");

        List<String> economicsModules = new ArrayList<>();
        economicsModules.add("Module 1: Basic Economic Concepts");
        economicsModules.add("Module 2: Macroeconomic Indicators");

        List<String> appDevModules = new ArrayList<>();
        appDevModules.add("Module 1: Android Basics");
        appDevModules.add("Module 2: User Interface Design");

        List<String> projectModules = new ArrayList<>();
        projectModules.add("Module 1: Project Planning");
        projectModules.add("Module 2: Project Execution");

        List<String> softwareEngModules = new ArrayList<>();
        softwareEngModules.add("Module 1: Software Development Life Cycle");
        softwareEngModules.add("Module 2: Agile Methodologies");

        List<String> networksModules = new ArrayList<>();
        networksModules.add("Module 1: Network Fundamentals");
        networksModules.add("Module 2: Protocols and Standards");

        List<String> microprocessorModules = new ArrayList<>();
        microprocessorModules.add("Module 1: Microprocessor Architecture");
        microprocessorModules.add("Module 2: Assembly Language Programming");

        // Add courses with descriptions
        courseList.add(new Course("Introduction to Management", "GED-1116", 2, "59 (E)",
                "This course provides an overview of management principles and practices, focusing on organizational behavior and decision-making.",
                managementModules));

        courseList.add(new Course("Macro Economics", "GED-2115", 2, "59 (E)",
                "An introduction to macroeconomic concepts including inflation, unemployment, and monetary policy.",
                economicsModules));

        courseList.add(new Course("Smartphone Application Development", "CSE-3212", 1.5, "59 (E)",
                "This course covers the fundamentals of developing applications for smartphones, focusing on Android development and user interface design.",
                appDevModules));

        courseList.add(new Course("Project I", "CSE-3240", 2, "59 (E)",
                "A practical course where students engage in project planning and execution, applying project management principles.",
                projectModules));

        courseList.add(new Course("Software Engineering", "CSE-3213", 3, "59 (E)",
                "This course explores software development methodologies, including Agile and Waterfall, and emphasizes the software development life cycle.",
                softwareEngModules));

        courseList.add(new Course("Computer Networks", "CSE-3231", 3, "59 (E)",
                "An introduction to computer networking concepts, including network architecture, protocols, and security.",
                networksModules));

        courseList.add(new Course("Microprocessor, Assembly Language and Computer Interfacing", "CSE-3201", 3, "59 (E)",
                "This course covers the architecture of microprocessors, assembly language programming, and interfacing techniques.",
                microprocessorModules));
    }
}