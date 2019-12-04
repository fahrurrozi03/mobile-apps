package com.foodchef.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.foodchef.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;
    private ImageView ivLogo;
    private Animation fadeIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        tvTitle= (TextView) findViewById(R.id.tv_title);
        ivLogo= (ImageView) findViewById(R.id.imageView);
        fadeIn= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        tvTitle.setVisibility(View.VISIBLE);
        ivLogo.setVisibility(View.VISIBLE);
        tvTitle.startAnimation(fadeIn);
        ivLogo.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i = new Intent(MainActivity.this, MenuDetailsActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        /*new Handler().postDelayed(new Runnable() {

			*//*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 *//*

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }*/
    }
}
