package com.example.recycleviewclase;

import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewclase.adapter.DinosaurioAdapter;
import com.example.recycleviewclase.model.dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
RecyclerView recyclerDino;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerDino = findViewById(R.id.rv);

        List<dinosaurio> dinosaurioList = new ArrayList<>();

        **

        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro",  "", "Verde", R.drawable.dinosaurio));

        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosaurioList);

        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(this));
        recyclerDino.setHasFixedSize(true);
    }
}