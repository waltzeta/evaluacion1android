package com.example.evaluacionuno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class vidaJefes extends AppCompatActivity {
    ArrayList<String> vidas;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vida_jefes);
        rv = (RecyclerView) findViewById(R.id.recyclerVidas);
        rv.setLayoutManager(new LinearLayoutManager(this));

        vidas = new ArrayList<String>();
        vidas.add("Rey Slime: 2.000/ 2.800/ 3.570 ");
        vidas.add("Ojo de Cthulhu: 2.800/ 3.640/ 4.641 ");
        vidas.add("Esqueletron: 4.400/ 8.800/ 11.220 ");

        Adapter adapter = new Adapter(vidas);
        rv.setAdapter(adapter);

    }
}