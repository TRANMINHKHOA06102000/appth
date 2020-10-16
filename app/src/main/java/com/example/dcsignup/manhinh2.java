package com.example.dcsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class manhinh2 extends AppCompatActivity {
    Button btnGoto;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        btnGoto =(Button)findViewById(R.id.buttonGoTo);
        btnGoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(manhinh2.this,manhinh3.class);
                startActivity(mh2);
            }
        });
        textView=(TextView)findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 =new Intent(manhinh2.this,manhinh3.class);
                startActivity(mh3);
            }
        });
    }
}