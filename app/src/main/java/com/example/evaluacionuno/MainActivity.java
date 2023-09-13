package com.example.evaluacionuno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ImageView reyslime,ojodecutulu,esqueletron;
    private Drawable drawable1,drawable2,drawable3;
    private Button btnVidaSlime, btnVidaOjo, btnVidaEsqueleto;
    private RadioButton rbcelular, rbtablet;

    private Button btnenviar;

    private ProgressBar pb;

    private int cont;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reyslime = findViewById(R.id.reyslime);
        ojodecutulu = findViewById(R.id.ojocutulu);
        esqueletron = findViewById(R.id.esqueletron);

        drawable1 = getResources().getDrawable(R.drawable.reyeslime);
        drawable2 = getResources().getDrawable(R.drawable.oyodecutulu);
        drawable3 = getResources().getDrawable(R.drawable.ekeleto);

        reyslime.setImageDrawable(drawable1);
        ojodecutulu.setImageDrawable(drawable2);
        esqueletron.setImageDrawable(drawable3);

        btnVidaSlime = (Button) findViewById(R.id.btnslime);
        btnVidaOjo = (Button) findViewById(R.id.btnojocutulu);
        btnVidaEsqueleto = (Button) findViewById(R.id.btnesqueletron);

        rbcelular = (RadioButton) findViewById(R.id.rbcelular);
        rbtablet = (RadioButton) findViewById(R.id.rbtablet);

        btnenviar = (Button) findViewById(R.id.btnenviar);
        pb = (ProgressBar) findViewById(R.id.pbenviar);


        btnVidaSlime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, vidaJefes.class);
                startActivity(i);
            }
        });
        btnVidaOjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, vidaJefes.class);
                startActivity(i);
            }
        });
        btnVidaEsqueleto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, vidaJefes.class);
                startActivity(i);
            }
        });
        //llamado de funciones:
        enviar();

    }
    private void enviar(){
        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Timer t = new Timer();
                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        cont++;
                        pb.setProgress(cont);
                        if (cont == 100){
                            t.cancel();
                        }
                    }
                };
                t.schedule(tt,0,100);
            }
        });
    }
}