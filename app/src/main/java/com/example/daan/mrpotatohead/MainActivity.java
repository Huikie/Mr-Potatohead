package com.example.daan.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    public String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // to make sure only the body is displayed at first
        ImageView body = findViewById(R.id.body);
        body.setVisibility(View.VISIBLE);
    }

    public void checkClicked(View v) {
        // make it possible to check and uncheck the checkboxes
        Log.d("potato", "checkClicked: ");
        //I couldn't find out how to use the two statements below
        //CheckBox checkbox = (CheckBox) v;
        //String checkBoxInfo = checkbox.getText().toString();
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
        if (checkBox4.isChecked()) ears.setVisibility(View.VISIBLE); else ears.setVisibility(View.INVISIBLE);
        if (checkBox5.isChecked()) eyebrows.setVisibility(View.VISIBLE); else eyebrows.setVisibility(View.INVISIBLE);
        if (checkBox6.isChecked()) mustache.setVisibility(View.VISIBLE); else mustache.setVisibility(View.INVISIBLE);
        if (checkBox7.isChecked()) nose.setVisibility(View.VISIBLE); else nose.setVisibility(View.INVISIBLE);
        if (checkBox8.isChecked()) shoes.setVisibility(View.VISIBLE); else shoes.setVisibility(View.INVISIBLE);
        if (checkBox9.isChecked()) mouth.setVisibility(View.VISIBLE); else mouth.setVisibility(View.INVISIBLE);
        if (checkBox10.isChecked()) glasses.setVisibility(View.VISIBLE); else glasses.setVisibility(View.INVISIBLE);
    }
}