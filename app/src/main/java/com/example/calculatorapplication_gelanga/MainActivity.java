package com.example.calculatorapplication_gelanga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
TextView result;
    EditText ed1,ed2,ed3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.Result);
        ed1=findViewById(R.id.Ed1);
        ed2=findViewById(R.id.Ed2);
        ed3=findViewById(R.id.Ed3);
        btn1=findViewById(R.id.BTN1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(ed1.getText().toString());
                double b= Double.parseDouble(ed2.getText().toString());
                double c= Double.parseDouble(ed3.getText().toString());
                double res= a+b+c;
                DecimalFormat form = new DecimalFormat("0.00");
                result.setText(form.format(res));

            }
        });
    }
}