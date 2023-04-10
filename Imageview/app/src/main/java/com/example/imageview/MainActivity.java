package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static ImageView iview1;
    public static Button submit_btn;
    private int current_image_index;
    int[] images = {R.mipmap.smasher, R.mipmap.smasher1, R.mipmap.smasher2, R.mipmap.smasher3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButton();
    }

    public void onClickButton () {
        iview1 = (ImageView) findViewById(R.id.imageView2);
        submit_btn = (Button) findViewById(R.id.button2);

        submit_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;

                        iview1.setImageResource(images[current_image_index]);
                    }
                }
        );

    }
}