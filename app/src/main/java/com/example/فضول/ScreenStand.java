package com.example.فضول;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class ScreenStand extends AppCompatActivity {
    EditText editText;
    Button button, button2, button3, button4;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        editText = findViewById(R.id.today);
        button = findViewById(R.id.monthe);
        button2 = findViewById(R.id.year);
        button3 = findViewById(R.id.years);
        lottieAnimationView = findViewById(R.id.lott);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editText1 = editText.getText().toString();
                if (editText1.matches("")) {
                    Toast.makeText(ScreenStand.this, "الرجاء ادخال عدد ساعات النوم", Toast.LENGTH_SHORT).show();
                    return;
                }
                int myNum = Integer.parseInt(editText.getText().toString());
                int num = myNum * 30;
                int sumsleep1 = num - myNum;
                int avg = sumsleep1 / 24;
                Toast.makeText(ScreenStand.this, "معدل نومك في الشهر هو  " + num + "ساعة اذن انت تقضي وقت  " + avg + "خلال الشهر", Toast.LENGTH_SHORT).show();


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText1 = editText.getText().toString();
                if (editText1.matches("")) {
                    Toast.makeText(ScreenStand.this, "الرجاء ادخال عدد ساعات النوم", Toast.LENGTH_SHORT).show();
                    return;
                }
                int myNum = Integer.parseInt(editText.getText().toString());
                int num1 = myNum * 365;
                int sumsleep = num1 - myNum;
                int numTt1 = sumsleep / 24;
                Toast.makeText(ScreenStand.this, "معدل نومك في السنة هو  " + num1 + "ساعة اذن انت تقضي وقت ي   " + numTt1 + "  يوم خلال السنة ", Toast.LENGTH_SHORT).show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editText1 = editText.getText().toString();
                if (editText1.matches("")) {
                    Toast.makeText(ScreenStand.this, "الرجاء ادخال عدد ساعات النوم", Toast.LENGTH_LONG).show();
                    return;
                }
                int myNum = Integer.parseInt(editText.getText().toString());
                double num1 = myNum * 21900;
                double numTt = num1 / 24;
                double years = numTt / 365;
                Toast.makeText(ScreenStand.this, "معدل نومك في السنة هو  " + num1 + "ساعة اذن انت تقضي وقت    " + numTt + "  يوم خلال السنة " + "انت تعيش" + years + "سنة خلال حياتك باسثناء النوم", Toast.LENGTH_SHORT).show();

            }
        });




    }
        }
