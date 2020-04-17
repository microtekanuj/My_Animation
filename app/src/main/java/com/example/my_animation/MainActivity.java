package com.example.my_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_fade_in, btn_fade_out;
    ImageView image_view;
    Animation animationfadein,
            animationfadeout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_view=findViewById(R.id.image_view);
        btn_fade_in=findViewById(R.id.btn_fade_in);
        btn_fade_out=findViewById(R.id.btn_fade_out);

        btn_fade_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationfadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
           //     image_view.setVisibility(View.VISIBLE);
                image_view.startAnimation(animationfadeout);

            }
        });
        btn_fade_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Toast.makeText(MainActivity.this, "Fade in", Toast.LENGTH_SHORT).show();
                animationfadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                image_view.setVisibility(View.VISIBLE);
                image_view.startAnimation(animationfadein);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
