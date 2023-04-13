package com.example.exampleappworklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TaskListAdapter extends ArrayAdapter<Task> {

    private Context mContext;
    private int mResource;

    public TaskListAdapter(Context context, int resource, List<Task> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(mResource, parent, false);
        }

        Task task = getItem(position);

        TextView titleTextView = view.findViewById(R.id.task_title);
        TextView descriptionTextView = view.findViewById(R.id.task_description);

        titleTextView.setText(task.getTitle());
        descriptionTextView.setText(task.getDescription());

        return view;
    }
}

