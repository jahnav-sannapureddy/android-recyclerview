package com.jahnav.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private RecyclerView sampleRecyclerView;
     private SampleRvAdapter adapter;
     private ArrayList<Sample> sampleArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleRecyclerView = findViewById(R.id.recycler_view);

        // adding data

        sampleArrayList.add(new Sample("Hello"));
        sampleArrayList.add(new Sample("World"));
        sampleArrayList.add(new Sample("One"));
        sampleArrayList.add(new Sample("Two"));
        sampleArrayList.add(new Sample("Three"));
        sampleArrayList.add(new Sample("Four"));
        sampleArrayList.add(new Sample("Five"));
        sampleArrayList.add(new Sample("Six"));
        sampleArrayList.add(new Sample("Seven"));

        adapter = new SampleRvAdapter(sampleArrayList);
        sampleRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        sampleRecyclerView.setAdapter(adapter);


    }
}