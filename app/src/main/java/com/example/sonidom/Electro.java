package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Electro extends AppCompatActivity {

    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion =0;

    MediaPlayer vectormp [] = new MediaPlayer[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro);

        play_pause = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_norepetir);
        iv = (ImageView)findViewById(R.id.imageView);

        vectormp[0]= MediaPlayer.create(this, R.raw.musicae1);
        vectormp[1]= MediaPlayer.create(this, R.raw.musicae2);
        vectormp[2]= MediaPlayer.create(this, R.raw.musicae3);
        vectormp[3]= MediaPlayer.create(this, R.raw.musicae4);
        vectormp[4]= MediaPlayer.create(this, R.raw.musicae5);
    }

    //Metodo para PlayPause
    public void PlayPause(View view){
        if (vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {
            vectormp[posicion].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    //Metodo para botón Stop
    public void Stop (View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0]= MediaPlayer.create(this, R.raw.musicae1);
            vectormp[1]= MediaPlayer.create(this, R.raw.musicae2);
            vectormp[2]= MediaPlayer.create(this, R.raw.musicae3);
            vectormp[3]= MediaPlayer.create(this, R.raw.musicae4);
            vectormp[4]= MediaPlayer.create(this, R.raw.musicae5);

            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portadahp1);
            Toast.makeText(this,"Stop", Toast.LENGTH_SHORT).show();
        }
    }

    //Metodo para repetir una pista
    public void Repetir (View view){
        if (repetir==1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir=2;
        } else {
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir=1;
        }
    }

    //Metodo para saltar a la siguiente cancion
    public void Siguiente(View view){
        if(posicion < vectormp.length -1){
            if (vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if(posicion==0){
                    iv.setImageResource(R.drawable.portadae1);
                }else if (posicion==1){
                    iv.setImageResource(R.drawable.portadae2);
                }else if (posicion==2){
                    iv.setImageResource(R.drawable.portadae3);
                }else if (posicion==3){
                    iv.setImageResource(R.drawable.portadae4);
                }else if (posicion==4){
                    iv.setImageResource(R.drawable.portadae5);
                }

            } else {
                posicion++;

                if(posicion==0){
                    iv.setImageResource(R.drawable.portadae1);
                }else if (posicion==1){
                    iv.setImageResource(R.drawable.portadae2);
                }else if (posicion==2){
                    iv.setImageResource(R.drawable.portadae3);
                }else if (posicion==3){
                    iv.setImageResource(R.drawable.portadae4);
                }else if (posicion==4){
                    iv.setImageResource(R.drawable.portadae5);
                }

            }
        } else {
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }

    //Metodo para regresar a la cancion anterior
    public void Anterior(View view){
        if (posicion >=1){

            if (vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();

                vectormp[0]= MediaPlayer.create(this, R.raw.musicae1);
                vectormp[1]= MediaPlayer.create(this, R.raw.musicae2);
                vectormp[2]= MediaPlayer.create(this, R.raw.musicae3);
                vectormp[3]= MediaPlayer.create(this, R.raw.musicae4);
                vectormp[4]= MediaPlayer.create(this, R.raw.musicae5);

                posicion--;

                if(posicion==0){
                    iv.setImageResource(R.drawable.portadae1);
                }else if (posicion==1){
                    iv.setImageResource(R.drawable.portadae2);
                }else if (posicion==2){
                    iv.setImageResource(R.drawable.portadae3);
                }else if (posicion==3){
                    iv.setImageResource(R.drawable.portadae4);
                }else if (posicion==4){
                    iv.setImageResource(R.drawable.portadae5);
                }
                vectormp[posicion].start();

            }else {
                posicion--;

                if(posicion==0){
                    iv.setImageResource(R.drawable.portadae1);
                }else if (posicion==1){
                    iv.setImageResource(R.drawable.portadae2);
                }else if (posicion==2){
                    iv.setImageResource(R.drawable.portadae3);
                }else if (posicion==3){
                    iv.setImageResource(R.drawable.portadae4);
                }else if (posicion==4){
                    iv.setImageResource(R.drawable.portadae5);
                }
            }

        }else {
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }
    }

}