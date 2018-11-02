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
        // to make sure the body is only displayed at first
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
        ImageView arms = findViewById(R.id.arms);
        ImageView hat = findViewById(R.id.hat);
        ImageView mustache = findViewById(R.id.mustache);
        ImageView glasses = findViewById(R.id.glasses);
        if (checkBox1.isChecked()) {
            hat.setVisibility(View.VISIBLE);
        } else if (!checkBox1.isChecked()) {
            hat.setVisibility(View.INVISIBLE);
        }
        if (checkBox2.isChecked()) {
            arms.setVisibility(View.VISIBLE);
        } else if (!checkBox2.isChecked()) {
            arms.setVisibility(View.INVISIBLE);
        }
        if (checkBox3.isChecked()) {
            glasses.setVisibility(View.VISIBLE);
        } else if (!checkBox3.isChecked()) {
            glasses.setVisibility(View.INVISIBLE);
        }
        if (checkBox4.isChecked()) {
            mustache.setVisibility(View.VISIBLE);
        } else if (!checkBox4.isChecked()) {
            mustache.setVisibility(View.INVISIBLE);
        }
    }
}