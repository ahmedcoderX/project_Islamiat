package com.example.فضول;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class adia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiaa);
Button button=findViewById(R.id.هداية);
Button button1=findViewById(R.id.الرزق);
Button button2=findViewById(R.id.marid);
Button button3=findViewById(R.id.الميت);
Button button4=findViewById(R.id.المضلوم);
        Button button5=findViewById(R.id.التوبة);
        Button button6=findViewById(R.id.الكرب);
        Button button7=findViewById(R.id.الوالدين);
        Button button8=findViewById(R.id.نبوية);
        Button button9=findViewById(R.id.مسجد);
        Button button10=findViewById(R.id.سفر);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
Intent intent=new Intent(adia.this,hidaiaa.class);
startActivity(intent);


    }
});
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(adia.this,rizk.class);
        startActivity(intent);
    }
});

button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(adia.this,mariid.class);
        startActivity(intent);

    }
});
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(adia.this,mait.class);
        startActivity(intent);


    }
});
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(adia.this,madlom.class);
        startActivity(intent);
    }
});
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,taopa.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,kroup.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,waladin.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,napoia.class);
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,masjed.class);
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View v) {
                Intent intent=new Intent(adia.this,safar.class);
                startActivity(intent);

            }
        });


    }

    }


