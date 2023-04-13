package com.example.exampleappworklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mTaskListView;
    private TaskListAdapter mTaskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTaskListView = findViewById(R.id.task_list);
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Task 1", "Description 1"));
        taskList.add(new Task("Task 2", "Description 2"));
        taskList.add(new Task("Task 3", "Description 3"));
        taskList.add(new Task("Task 4", "Description 4"));
        taskList.add(new Task("Task 5", "Description 5"));
        taskList.add(new Task("Task 6", "Description 6"));

        mTaskListAdapter = new TaskListAdapter(this, R.layout.task_list_item, taskList);
        mTaskListView.setAdapter(mTaskListAdapter);
    }
}