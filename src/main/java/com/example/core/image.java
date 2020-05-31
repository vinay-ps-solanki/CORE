package com.example.core;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.BatchUpdateException;

public class image extends AppCompatActivity {
    Button button7;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        button7 = (Button)findViewById(R.id.button7);
        imageView = (ImageView) findViewById(R.id.imageView1);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.image1);

            }
        });

    }
}
