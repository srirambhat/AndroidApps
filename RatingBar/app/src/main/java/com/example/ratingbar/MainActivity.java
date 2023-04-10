package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Button button_sbm;
    public static TextView text_v;
    public static RatingBar rating_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerRatingBar();
        onClickSubmitButtonListener();
    }

    public void onClickListenerRatingBar () {
        rating_v = (RatingBar) findViewById(R.id.ratingBar);
        text_v = (TextView) findViewById(R.id.textView);

        rating_v.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        text_v.setText(String.valueOf(v));
                    }
                }
        );
    }

    public void onClickSubmitButtonListener() {
        rating_v = (RatingBar) findViewById(R.id.ratingBar);
        text_v = (TextView) findViewById(R.id.textView);
        button_sbm = (Button) findViewById(R.id.button);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,
                                String.valueOf(rating_v.getRating()),
                                Toast.LENGTH_SHORT).show();
                    }

                }

        );

    }
}