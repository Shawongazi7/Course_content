package com.example.assignment_4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class CustomListAdapter extends ArrayAdapter<String> {

    private Context context;
    private List<String> items;

    public CustomListAdapter(Context context, List<String> items) {
        super(context, R.layout.list_item, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.listItem);
        textView.setText(items.get(position));

        return convertView;
    }
}