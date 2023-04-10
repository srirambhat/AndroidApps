package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1;
    EditText e2;
    float res_num;
    int num1, num2;
    public static final String MY_TAG = "Sriram:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(MY_TAG,"In onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        Log.i(MY_TAG,"onClick invoked");

        t1 = (TextView) findViewById(R.id.result);
        e1 = (EditText) findViewById(R.id.number1);
        e2 = (EditText) findViewById(R.id.number2);

        num1 = Integer.parseInt(e1.getText().toString());
        num2 = Integer.parseInt(e2.getText().toString());
        res_num = num1 + num2;
        t1.setText(String.valueOf(res_num));
    }
}