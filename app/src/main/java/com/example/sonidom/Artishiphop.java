package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Artishiphop extends AppCompatActivity {

    ImageButton artista1, artista2, artista3, artista4, artista5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artishiphop);

        //artistas
        artista1= findViewById(R.id.artista1hiphop);
        artista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista1();
            }
        });
        artista2= findViewById(R.id.artista2hiphop);
        artista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista2();
            }
        });
        artista3= findViewById(R.id.artista3hiphop);
        artista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista3();
            }
        });
        artista4= findViewById(R.id.artista4hiphop);
        artista4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista4();
            }
        });
        artista5= findViewById(R.id.artista5hiphop);
        artista5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista5();
            }
        });
    }



    //llamarartistas
    private void Llamarartista1(){
        Intent intent = new Intent(this,Artis1hp.class);
        startActivity(intent);
    }
    private void Llamarartista2(){
        Intent intent = new Intent(this,Artis2hp.class);
        startActivity(intent);
    }
    private void Llamarartista3(){
        Intent intent = new Intent(this,Artis3hp.class);
        startActivity(intent);
    }
    private void Llamarartista4(){
        Intent intent = new Intent(this,Artis4hp.class);
        startActivity(intent);
    }
    private void Llamarartista5(){
        Intent intent = new Intent(this,Artis5hp.class);
        startActivity(intent);
    }


}