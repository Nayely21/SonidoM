package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Artisbachata extends AppCompatActivity {

    ImageButton artista1, artista2, artista3, artista4, artista5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artisbachata);
        //artistas
        artista1= findViewById(R.id.artista1bachata);
        artista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista1();
            }
        });
        artista2= findViewById(R.id.artista2bachata);
        artista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista2();
            }
        });
        artista3= findViewById(R.id.artista3bachata);
        artista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista3();
            }
        });
        artista4= findViewById(R.id.artista4bachata);
        artista4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista4();
            }
        });
        artista5= findViewById(R.id.artista5bachata);
        artista5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Llamarartista5();
            }
        });
    }



    //llamarartistas
    private void Llamarartista1(){
        Intent intent = new Intent(this,Artis1b.class);
        startActivity(intent);
    }
    private void Llamarartista2(){
        Intent intent = new Intent(this,Artis2b.class);
        startActivity(intent);
    }
    private void Llamarartista3(){
        Intent intent = new Intent(this,Artis3b.class);
        startActivity(intent);
    }
    private void Llamarartista4(){
        Intent intent = new Intent(this,Artis4b.class);
        startActivity(intent);
    }
    private void Llamarartista5(){
        Intent intent = new Intent(this,Artis5b.class);
        startActivity(intent);
    }


}