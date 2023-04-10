package com.example.smpleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static EditText username_t;
    private static EditText password_t;
    private static TextView attempt_t;
    private static Button login_btn;
    int attempt_counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();
    }

    public void LoginButton() {
        username_t = (EditText) findViewById(R.id.username);
        password_t = (EditText) findViewById(R.id.password);
        attempt_t = (TextView) findViewById(R.id.attempt);
        login_btn = (Button) findViewById(R.id.button);

        attempt_t.setText(Integer.toString(attempt_counter));


        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        if(username_t.getText().toString().equals("user") &&
                                password_t.getText().toString().equals("pass") ) {
                            Toast.makeText(MainActivity.this, "User and Password Correct", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(".LoginActivity");
                            startActivity(intent);

                            attempt_counter = 5;
                        } else {

                            attempt_counter--;
                            attempt_t.setText(Integer.toString(attempt_counter));
                            if (attempt_counter == 0) {
                                login_btn.setEnabled(false);
                                Toast.makeText(MainActivity.this, "User Disabled", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "User and Password InCorrect", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                }
        );
    }
}