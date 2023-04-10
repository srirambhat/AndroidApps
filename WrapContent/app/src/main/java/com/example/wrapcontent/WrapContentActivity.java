package com.example.wrapcontent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WrapContentActivity extends AppCompatActivity {
    private Button button_sbm;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrap_content);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        password = (EditText) findViewById(R.id.editText);
        button_sbm = (Button) findViewById(R.id.button);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(WrapContentActivity.this,
                                password.getText(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}