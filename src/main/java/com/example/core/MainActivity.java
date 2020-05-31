package com.example.core;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencore();
            }
        });
    }
             // public void displayToast(View view) {
              //Toast.makeText(this, "good job", Toast.LENGTH_SHORT).show();
                // }
    public void opencore() {
        Intent intent = new Intent(this, core.class);
        startActivity(intent);


    }
}

