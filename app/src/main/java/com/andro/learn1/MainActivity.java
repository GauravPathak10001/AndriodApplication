package com.andro.learn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button addition, subtraction, multiply, division;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        addition=findViewById(R.id.addition);
        subtraction=findViewById(R.id.subtraction);
        multiply=findViewById(R.id.multiply);
        division=findViewById(R.id.division);
        result=findViewById(R.id.result);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f+s;
                result.setText("Add: "+a);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int f,s,s1;
              f=Integer.parseInt(et1.getText().toString());
              s=Integer.parseInt(et2.getText().toString());
              s1=s-f;
              result.setText("Subtract: "+s1);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,s1;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                s1=s*f;
                result.setText("Multiply: "+s1);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,s1;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                s1=(int)s/f;
                result.setText("Divison: "+s1);
            }
        });
    }
}