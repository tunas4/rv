package com.example.recycleviewclase;

import android.content.Intent;
import android.graphics.Color;
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

        dinosaurioList.add(new dinosaurio("T-rex", "Carnivoro", "El rey de los dinosaurios", Color.parseColor("#172376"), R.drawable.dinosaurio));
        dinosaurioList.add(new dinosaurio("Velociraptor", "Carnivoro", "Ágil cazador", Color.parseColor("#827711"), R.drawable.vel));
        dinosaurioList.add(new dinosaurio("Triceratops", "Herbivoro", "Famoso por sus tres cuernos", Color.parseColor("#823922"), R.drawable.tri));
        dinosaurioList.add(new dinosaurio("Stegosaurus", "Herbivoro", "Defendido por placas dorsales", Color.parseColor("#017633"), R.drawable.ste));
        dinosaurioList.add(new dinosaurio("Brachiosaurus", "Herbivoro", "Gigante de cuello largo", Color.parseColor("#765153"), R.drawable.bra));
        dinosaurioList.add(new dinosaurio("Spinosaurus", "Carnivoro", "Cazador con gran espina dorsal", Color.parseColor("#927615"), R.drawable.spi));
        dinosaurioList.add(new dinosaurio("Ankylosaurus", "Herbivoro", "Blindado con una cola maciza", Color.parseColor("#172376"), R.drawable.ank));
        dinosaurioList.add(new dinosaurio("Pteranodon", "Carnivoro", "Reptil volador", Color.parseColor("#827711"), R.drawable.pte));
        dinosaurioList.add(new dinosaurio("Parasaurolophus", "Herbivoro", "Conocido por su cresta distintiva", Color.parseColor("#823922"), R.drawable.par));
        dinosaurioList.add(new dinosaurio("Allosaurus", "Carnivoro", "Depredador anterior al T-rex", Color.parseColor("#017633"), R.drawable.all));

        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosaurioList);

        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(this));
        recyclerDino.setHasFixedSize(true);
    }
}