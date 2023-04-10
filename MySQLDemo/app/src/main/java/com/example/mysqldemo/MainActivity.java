package com.example.mysqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, SurnameEt, MobileEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText)findViewById(R.id.etName);
        SurnameEt = (EditText)findViewById(R.id.etSurname);
        MobileEt = (EditText) findViewById(R.id.etMobileNo);
    }

    public void OnLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = SurnameEt.getText().toString();
        String mobile = MobileEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password, mobile);
    }
}