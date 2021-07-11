package com.example.فضول;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public  static int Spalch_screen =3000;
    Animation top,buttom;

    ImageView Image,imageView1,imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        top= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        buttom= AnimationUtils.loadAnimation(this,R.anim.bottum_anim);
        Image=findViewById(R.id.moon);
        Image=findViewById(R.id.islamiattt);

        imageView1=findViewById(R.id.islamiattt);
        imageView2=findViewById(R.id.tariq);
Image.setAnimation(buttom);
imageView1.setAnimation(top);
imageView2.setAnimation(buttom);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                                          startActivity(intent);
                                          finish();


                                      }

                                  }
                ,Spalch_screen

        );


    }

}
