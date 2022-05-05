package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //botones de generos
    Button hiphop;
    Button salsa;
    Button regueton;
    Button electro;
    Button bachata;

    //botones de artistas
    Button artistahiphopp;
    Button artistasalsa;
    Button artistaregueton;
    Button artistaelectro;
    Button artistabachata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HIPHOP
        hiphop= findViewById(R.id.btnHiphop);
        hiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarHiphop();
            }
        });
        artistahiphopp= findViewById(R.id.artistahiphop);
        artistahiphopp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarArtistahiphop();
            }
        });


        //SALSA
        salsa= findViewById(R.id.btnSalsa);
        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSalsa();
            }
        });
        artistasalsa= findViewById(R.id.artistasalsa);
        artistasalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarArtistasalsa();
            }
        });

        //REGUETON
        regueton= findViewById(R.id.btnRegueton);
        regueton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarRegueton();
            }
        });
        artistaregueton= findViewById(R.id.artistaregueton);
        artistaregueton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarArtistaregueton();
            }
        });

        //ELECTRO
        electro= findViewById(R.id.btnElectro);
        electro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarElectro();
            }
        });
        artistaelectro= findViewById(R.id.artistaelectro);
        artistaelectro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarArtistaelectro();
            }
        });

        //BACHATA
        bachata= findViewById(R.id.btnBachata);
        bachata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarBachata();
            }
        });
        artistabachata= findViewById(R.id.artistabachata);
        artistabachata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarArtistabachata();
            }
        });

    }


    //LLHIPHOP
    private void LlamarHiphop(){
        Intent intent = new Intent(MainActivity.this,Hiphop.class);
        startActivity(intent);
    }
    private void LlamarArtistahiphop(){
        Intent intent = new Intent(MainActivity.this,Artishiphop.class);
        startActivity(intent);
    }

    //LLSALSA
    private void LlamarSalsa(){
        Intent intent = new Intent(MainActivity.this,Salsas.class);
        startActivity(intent);
    }
    private void LlamarArtistasalsa(){
        Intent intent = new Intent(MainActivity.this,Artissalsa.class);
        startActivity(intent);
    }


    //LLREGUETON
    private void LlamarRegueton(){
        Intent intent = new Intent(MainActivity.this,Regueton.class);
        startActivity(intent);
    }
    private void LlamarArtistaregueton(){
        Intent intent = new Intent(MainActivity.this,Artisregueton.class);
        startActivity(intent);
    }

    //LLELECTRO
    private void LlamarElectro(){
        Intent intent = new Intent(MainActivity.this,Electro.class);
        startActivity(intent);
    }
    private void LlamarArtistaelectro(){
        Intent intent = new Intent(MainActivity.this,Artiselectro.class);
        startActivity(intent);
    }

    //LLBACHATA
    private void LlamarBachata(){
        Intent intent = new Intent(MainActivity.this,Bachata.class);
        startActivity(intent);
    }
    private void LlamarArtistabachata(){
        Intent intent = new Intent(MainActivity.this,Artisbachata.class);
        startActivity(intent);
    }


}