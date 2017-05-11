package com.example.saurav.blinkingeffect;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtMessage;
    Button BtnStart;
    Animation BlinkIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = (TextView) findViewById(R.id.txt);
        BtnStart = (Button) findViewById(R.id.btn);
        BlinkIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_in);

                // load the animation
        BlinkIn.setAnimationListener(this);
        BtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(BlinkIn);


            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {


    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(MainActivity.this,"Animation Stopped",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {


    }
}
