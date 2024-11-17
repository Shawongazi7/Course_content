package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ModuleExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<Course> courseList;
    private HashMap<String, List<String>> moduleDataChild;

    public ModuleExpandableListAdapter(Context context, List<Course> courseList, HashMap<String, List<String>> moduleDataChild) {
        this.context = context;
        this.courseList = courseList;
        this.moduleDataChild = moduleDataChild;
    }

    @Override
    public int getGroupCount() {
        return courseList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return moduleDataChild.get(courseList.get(groupPosition).getTitle()).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return courseList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return moduleDataChild.get(courseList.get(groupPosition).getTitle()).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_group_module, parent, false);
        }

        TextView moduleTitle = convertView.findViewById(R.id.moduleTitle);
        moduleTitle.setText(courseList.get(groupPosition).getTitle());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_topic, parent, false);
        }

        TextView topicTitle = convertView.findViewById(R.id.topicTitle);
        topicTitle.setText((String) getChild(groupPosition, childPosition));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}