package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dummyData();

        RecyclerView recyclerView = findViewById(R.id.rclview);
        myAdapter adapter = new myAdapter(this,data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        /*recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
    }


    public void dummyData(){
        data = new ArrayList<String>();
        data.add("Zain Fareed");
        data.add("Najeeb Ahmed");
        data.add("Awais Saeed");
        data.add("Huzaifa Shah");
        data.add("Hammad Bashir");


    }

}