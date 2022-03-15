package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView a;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.tv);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == b1)
        {
            a.setTextSize(50);
        }
        if(view == b2)
        {
            a.setTextColor(Color.RED);
        }
    }
}