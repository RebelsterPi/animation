package com.example.dell.holiday;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ss extends Activity {
    private ImageView iw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        iw=findViewById(R.id.iw);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.mytransition1);
        iw.startAnimation(anim);
        Thread mt = new Thread(){
            @Override
            public void run(){
                try{sleep(1500);
                    Intent intent =new Intent (getApplicationContext(),MainActivity.class);
                    finish();//this will finish this activity whenever you start the splash activity and continues with main activity
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mt.start();
    }
}
