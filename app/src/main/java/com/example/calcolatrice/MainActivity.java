package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Display1,Display2;
    String num;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display1 = (TextView) findViewById(R.id.display1);
        Display2 = (TextView) findViewById(R.id.display2);
    }
    public void ClickNumber(View v){
        Button b = (Button) v;
        num = Display1.getText().toString() + b.getText().toString();
        Display1.setText(num);
    }
    public void ClickC(View v){
        Display1.setText("");
    }
    public void ClickOp(View v){
        Button b = (Button) v;
        op = b.getText().charAt(0);
        Display2.setText(Display1.getText().toString() + op);
        Display1.setText("");
    }

    public void ClickEqual(View v){
        switch (op){
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;


        }
    }
}