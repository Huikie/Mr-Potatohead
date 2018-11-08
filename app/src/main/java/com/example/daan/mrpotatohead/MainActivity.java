package com.example.daan.mrpotatohead;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // to make sure only the body is displayed at first
        ImageView body = findViewById(R.id.body);
        body.setVisibility(View.VISIBLE);

        if(savedInstanceState != null){

            int hat_vis = savedInstanceState.getInt("hat", 0);
            ImageView hat = findViewById(R.id.hat);
            hat.setVisibility(hat_vis);

            int arms_vis = savedInstanceState.getInt("arms",0);
            ImageView arms = findViewById(R.id.arms);
            arms.setVisibility(arms_vis);

            int eyes_vis = savedInstanceState.getInt("eyes",0);
            ImageView eyes = findViewById(R.id.eyes);
            eyes.setVisibility(eyes_vis);

            int eyebrows_vis = savedInstanceState.getInt("eyebrows",0);
            ImageView eyebrows = findViewById(R.id.eyebrows);
            eyebrows.setVisibility(eyebrows_vis);

            int ears_vis = savedInstanceState.getInt("ears",0);
            ImageView ears = findViewById(R.id.ears);
            ears.setVisibility(ears_vis);

            int mustache_vis = savedInstanceState.getInt("mustache",0);
            ImageView mustache = findViewById(R.id.mustache);
            mustache.setVisibility(mustache_vis);

            int nose_vis = savedInstanceState.getInt("nose",0);
            ImageView nose = findViewById(R.id.nose);
            nose.setVisibility(nose_vis);

            int shoes_vis = savedInstanceState.getInt("shoes",0);
            ImageView shoes = findViewById(R.id.shoes);
            shoes.setVisibility(shoes_vis);

            int mouth_vis = savedInstanceState.getInt("mouth",0);
            ImageView mouth = findViewById(R.id.mouth);
            mouth.setVisibility(mouth_vis);

            int glasses_vis = savedInstanceState.getInt("glasses",0);
            ImageView glasses = findViewById(R.id.glasses);
            glasses.setVisibility(glasses_vis);
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        ImageView hat = findViewById(R.id.hat);
        ImageView arms = findViewById(R.id.arms);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView ears = findViewById(R.id.ears);
        ImageView mustache = findViewById(R.id.mustache);
        ImageView nose = findViewById(R.id.nose);
        ImageView shoes = findViewById(R.id.shoes);
        ImageView mouth = findViewById(R.id.mouth);
        ImageView glasses = findViewById(R.id.glasses);

        outState.putInt("hat", hat.getVisibility());
        outState.putInt("arms", arms.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());

    }

    public void checkClicked(View v) {
        //I couldn't find out how to use the two statements below
        //CheckBox checkbox = (CheckBox) v;
        //String checkBoxInfo = checkbox.getText().toString();
        //System.out.println(checkBoxInfo);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        CheckBox checkBox10 = findViewById(R.id.checkBox10);


        ImageView hat = findViewById(R.id.hat);
        ImageView arms = findViewById(R.id.arms);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView ears = findViewById(R.id.ears);
        ImageView mustache = findViewById(R.id.mustache);
        ImageView nose = findViewById(R.id.nose);
        ImageView shoes = findViewById(R.id.shoes);
        ImageView mouth = findViewById(R.id.mouth);
        ImageView glasses = findViewById(R.id.glasses);

        if (checkBox1.isChecked()) hat.setVisibility(View.VISIBLE); else hat.setVisibility(View.INVISIBLE);
        if (checkBox2.isChecked()) arms.setVisibility(View.VISIBLE); else arms.setVisibility(View.INVISIBLE);
        if (checkBox3.isChecked()) eyes.setVisibility(View.VISIBLE); else eyes.setVisibility(View.INVISIBLE);
        if (checkBox4.isChecked()) eyebrows.setVisibility(View.VISIBLE); else eyebrows.setVisibility(View.INVISIBLE);
        if (checkBox5.isChecked()) ears.setVisibility(View.VISIBLE); else ears.setVisibility(View.INVISIBLE);
        if (checkBox6.isChecked()) mustache.setVisibility(View.VISIBLE); else mustache.setVisibility(View.INVISIBLE);
        if (checkBox7.isChecked()) nose.setVisibility(View.VISIBLE); else nose.setVisibility(View.INVISIBLE);
        if (checkBox8.isChecked()) shoes.setVisibility(View.VISIBLE); else shoes.setVisibility(View.INVISIBLE);
        if (checkBox9.isChecked()) mouth.setVisibility(View.VISIBLE); else mouth.setVisibility(View.INVISIBLE);
        if (checkBox10.isChecked()) glasses.setVisibility(View.VISIBLE); else glasses.setVisibility(View.INVISIBLE);
    }
}