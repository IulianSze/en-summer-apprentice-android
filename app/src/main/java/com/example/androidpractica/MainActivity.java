package com.example.androidpractica;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        EventDto[] eventDtos = new EventDto[]{
                new EventDto(1,"Electric Castle","Muzica","Festival","Castel",R.drawable.electriccastle),
                new EventDto(2,"Untold","Muzica","Festival","Castel",R.drawable.untold),
                new EventDto(3,"TIF","Festival de filme","Vizionare filme","Piata unirii",R.drawable.tiff),
                new EventDto(4,"Meci de fotbal","Fotbal","Event sportiv","Home arena",R.drawable.clujarena),
                new EventDto(5,"Festival de vin","Wine festival","De alcoolici","Piata Mihai Viteazul", R.drawable.wine),
               /* new EventDto(1,"Electric Castle","Muzica","Festival","Castel"R.drawable.electriccastle),
                new EventDto(1,"Electric Castle","Muzica","Festival","Castel"R.drawable.electriccastle),*/
        };

        EventAdapter eventAdapter = new EventAdapter(eventDtos,MainActivity.this);
        recyclerView.setAdapter(eventAdapter);

    }
}
