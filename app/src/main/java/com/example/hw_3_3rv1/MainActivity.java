package com.example.hw_3_3rv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv_fighters);


        ArrayList<Fighter> fighters = new ArrayList<Fighter>();
        fighters.add(new Fighter(R.drawable.bones, "Jon Jones"));
        fighters.add(new Fighter(R.drawable.conor, "Conor McGregor"));
        fighters.add(new Fighter(R.drawable.getji, "Justin Gaethje"));
        fighters.add(new Fighter(R.drawable.pourier, "Dustin Poirier"));
        fighters.add(new Fighter(R.drawable.oliveira, "Charles Oliveira"));
        fighters.add(new Fighter(R.drawable.toni, "Tony Ferguson"));
        fighters.add(new Fighter(R.drawable.mokaev, "Muhammad Mokaev"));
        fighters.add(new Fighter(R.drawable.irji, "Jiri Prochazka"));
        fighters.add(new Fighter(R.drawable.alex, "Alex pereira"));
        fighters.add(new Fighter(R.drawable.leon, "Leon Edwards"));
        fighters.add(new Fighter(R.drawable.ades, "Israel Adesanya"));
        fighters.add(new Fighter(R.drawable.nomad, "Shavkhat Rahmonov"));
        fighters.add(new Fighter(R.drawable.ic_chen, "Michael Chandler"));
        fighters.add(new Fighter(R.drawable.sugar, "Sean O'Malley"));
        fighters.add(new Fighter(R.drawable.ic_volkanovski, "Alexander Volkanovski"));
        fighters.add(new Fighter(R.drawable.ic_petr, "Petr Yan"));
        fighters.add(new Fighter(R.drawable.ic_max, "Max Holloway"));
        fighters.add(new Fighter(R.drawable.ic_ortega, "Brian ortega"));



        FighterAdapter adapter = new FighterAdapter(fighters);
        rv.setAdapter(adapter);
    }

    }
