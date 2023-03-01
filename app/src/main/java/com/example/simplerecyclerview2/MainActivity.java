package com.example.simplerecyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simplerecyclerview2.Adapter.RecyclerViewAdapter;
import com.example.simplerecyclerview2.Model.MyData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyData[] myListData = new MyData[]{
                new MyData("Bike",R.drawable.ic_bike),
                new MyData("Bus",R.drawable.ic_bus),
                new MyData("FireTruck",R.drawable.ic_firetruck),
                new MyData("Plane",R.drawable.ic_plane),
                new MyData("Tractor",R.drawable.ic_tractor),
                new MyData("Bus",R.drawable.ic_bus),
                new MyData("FireTruck",R.drawable.ic_firetruck),
                new MyData("FireTruck",R.drawable.ic_firetruck),
                new MyData("Bus",R.drawable.ic_bus),
                new MyData("Plane",R.drawable.ic_plane),
                new MyData("Plane",R.drawable.ic_plane),
                new MyData("Plane",R.drawable.ic_plane),
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);
    }
}