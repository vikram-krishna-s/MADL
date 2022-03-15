package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add,sub,mul,div;
    TextView one,two;
    EditText a,b,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.bt1);
        sub=findViewById(R.id.bt2);
        mul=findViewById(R.id.bt3);
        div=findViewById(R.id.bt4);

        a=(EditText) findViewById(R.id.et1);
        b=(EditText)findViewById(R.id.et2);
        result=(EditText) findViewById(R.id.et3);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        float n1=Float.parseFloat(a.getText().toString());
        float n2=Float.parseFloat(b.getText().toString());
        float res=0;

        if(view == add) {
            res=n1+n2;
            result.setText(Float.toString(res));
        }
        if(view == sub){
            res=n1-n2;
            result.setText(Float.toString(res));
        }
        if(view == mul){
            res=n1*n2;
            result.setText(Float.toString(res));
        }
        if(view == div){
            res=n1/n2;
            result.setText(Float.toString(res));
        }
    }
}