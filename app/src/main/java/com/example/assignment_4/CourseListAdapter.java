package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CourseListAdapter extends BaseAdapter {

    private Context context;
    private List<Course> courseList;

    public CourseListAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public Object getItem(int position) {
        return courseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_course, parent, false);
        }

        TextView courseTitle = convertView.findViewById(R.id.courseTitle);
        TextView courseDescription = convertView.findViewById(R.id.courseDescription);
        TextView courseInstructor = convertView.findViewById(R.id.courseInstructor);

        Course course = courseList.get(position);
        courseTitle.setText(course.getTitle());
        courseDescription.setText(course.getDescription()); // Display the course description
        courseInstructor.setText("Code: " + course.getCode() + ", Credits: " + course.getCredit() + ", Section: " + course.getSection());

        return convertView;
    }
}