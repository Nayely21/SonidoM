package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Artiselectro extends AppCompatActivity {

    ImageButton artista1, artista2, artista3, artista4, artista5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artiselectro);

        artista1= findViewById(R.id.artista1electro);
        artista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista1();
            }
        });
        artista2= findViewById(R.id.artista2electro);
        artista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista2();
            }
        });
        artista3= findViewById(R.id.artista3electro);
        artista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista3();
            }
        });
        artista4= findViewById(R.id.artista4electro);
        artista4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista4();
            }
        });
        artista5= findViewById(R.id.artista5electro);
        artista5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista5();
            }
        });
    }



    //llamarartistas
    private void Llamarartista1(){
        Intent intent = new Intent(this,Artis1e.class);
        startActivity(intent);
    }
    private void Llamarartista2(){
        Intent intent = new Intent(this,Artis2e.class);
        startActivity(intent);
    }
    private void Llamarartista3(){
        Intent intent = new Intent(this,Artis3e.class);
        startActivity(intent);
    }
    private void Llamarartista4(){
        Intent intent = new Intent(this,Artis4e.class);
        startActivity(intent);
    }
    private void Llamarartista5(){
        Intent intent = new Intent(this,Artis5e.class);
        startActivity(intent);
    }


}