package com.example.androidpractica;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;

import java.text.MessageFormat;
import java.time.LocalDate;

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
                new EventDto(1,"Electric Castle","Muzica","Festival","Castel",R.drawable.electriccastle, LocalDate.now(),LocalDate.now()),
                new EventDto(2,"Untold","Muzica","Festival","Castel",R.drawable.untold,LocalDate.now(),LocalDate.now()),
                new EventDto(3,"TIF","Festival de filme","Vizionare filme","Piata unirii",R.drawable.tiff,LocalDate.now(),LocalDate.now()),
                new EventDto(4,"Meci de fotbal","Fotbal","Event sportiv","Home arena",R.drawable.clujarena,LocalDate.now(),LocalDate.now()),
                new EventDto(5,"Festival de vin","Wine festival","De alcoolici","Piata Mihai Viteazul", R.drawable.wine,LocalDate.now(),LocalDate.now()),
                /* new EventDto(1,"Electric Castle","Muzica","Festival","Castel"R.drawable.electriccastle),
                 new EventDto(1,"Electric Castle","Muzica","Festival","Castel"R.drawable.electriccastle),*/
        };

        EventAdapter eventAdapter = new EventAdapter(eventDtos,MainActivity.this);
        recyclerView.setAdapter(eventAdapter);







       /* });*/




    };
}

