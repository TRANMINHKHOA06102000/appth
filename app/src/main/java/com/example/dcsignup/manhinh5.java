package com.example.dcsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class manhinh5 extends AppCompatActivity {
    ImageView imageView;
    ImageView nlist;
    ImageView nlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh5);
        imageView= findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(manhinh5.this,MainActivity.class);
                startActivity(mh2);
            }
        });
        nlist =(ImageView) findViewById(R.id.list);
        nlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(manhinh5.this,manhinh4.class);
                startActivity(mh4);
            }
        });

        nlogout =(ImageView) findViewById(R.id.logout);
        nlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(manhinh5.this,MainActivity.class);
                startActivity(mh4);
            }
        });
    }
}