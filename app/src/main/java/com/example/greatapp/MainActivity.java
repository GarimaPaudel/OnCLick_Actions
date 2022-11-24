package com.example.greatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn ,btn2 , btn3;
private TextView txt;
private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        txt = findViewById(R.id.textView);
        img = findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Clicked About Me", Toast.LENGTH_SHORT).show();
                txt.setText("Name: Garima Paudel \nAdress: RNP. 8, Chitwan\nLearning Android Development\nTech Enthusiast");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked Education", Toast.LENGTH_SHORT).show();
                txt.setText("Computer Engineering Student at United Technical College , Bharatpur Chitwan");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setVisibility(View.VISIBLE);
            }
        });

    }
}