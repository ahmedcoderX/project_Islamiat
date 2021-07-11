package com.example.فضول;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    Button button, button1, button2;
    Animation top, buttom;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        button = findViewById(R.id.goToscreen);
        imageView = findViewById(R.id.rassol);
        button2 = findViewById(R.id.مسبحة);
        button1 = findViewById(R.id.ادعية);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, ScreenStand.class);
                startActivity(intent);

            }
        });

        top = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        buttom = AnimationUtils.loadAnimation(this, R.anim.bottum_anim);

        imageView.setAnimation(buttom);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, adia.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, misbaha.class);
                startActivity(i);
            }
        });


    }
}




