package com.example.dell.holiday;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private Button b2a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2a1=findViewById(R.id.b2a1);
        b2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opena1();
            }
        });}
        public void opena1() {
            Intent i = new Intent(getApplicationContext(), A1.class);
startActivity(i);
        }
}
