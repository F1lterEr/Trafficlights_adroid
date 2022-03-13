package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3;
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        mConstraintLayout = findViewById(R.id.BackGROUND);
        RedButton();
        YellowButton();
        GreenButton();
    }
    void RedButton(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));

            }
        });
    }
    void YellowButton(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));

            }
        });
    }
    void GreenButton(){
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));

            }
        });
    }
}