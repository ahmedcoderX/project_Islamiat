package com.example.فضول;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Set;

public class misbaha extends AppCompatActivity {


    TextView textView, textView1;
           TextView textView2;
    CheckBox checkBox;
    int counter = 0;
    ImageView imageView,imageView2;
    MediaPlayer mediaPlayer = new MediaPlayer();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mispaha);


        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        imageView2 = findViewById(R.id.Button_Image);
        textView = findViewById(R.id.numpermisbaha);
        imageView = findViewById(R.id.restore);
        checkBox = findViewById(R.id.ihtezaz);
        textView2=findViewById(R.id.dawraCounter);




        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(misbaha.this, R.raw.sohan);
                mediaPlayer.start();


                cheked();
                Increment();


            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count0 = counter = 0;
              textView.setText(""+count0);


            }
        });




        //Last Block
    }


    public void Increment() {

        counter++;
        textView.setText("" + counter);
        for (int i = 0; i <= 33; ) {
            i = i + 33;
            if (counter == i) {
                Toast.makeText(this, "تم تسبيح دورة كاملة", Toast.LENGTH_SHORT).show();

            }

            int a = 33;
            if (a == counter) {
                textView2.setText("" + 1);
            }

            int b = 66;
            if (b == counter) {
                textView2.setText("" + 2);
            }

            int c = 99;
            if (c == counter) {
                textView2.setText("" + 3);
            }

            int d = 132;
            if (d == counter) {
                textView2.setText("" + 4);
            }

            int e = 132 + 33;
            if (e == counter) {
                textView2.setText("" + 5);
            }

            int f = 132 + 33 + 33;
            if (f == counter) {
                textView2.setText("" + 5);
            }


        }


    }










   public  void cheked() {
        if(checkBox.isChecked()){
            mediaPlayer.pause();
        }
        else{
            mediaPlayer.start();
        }

        }










}





