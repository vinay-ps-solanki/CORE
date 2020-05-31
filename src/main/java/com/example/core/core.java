package com.example.core;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class core extends AppCompatActivity {
    private Button button3;
    private Button button4;
    private Button button6;
    private Button button7;


    @Override // music page  //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);
            // Music//
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusic();
            }
        });
            // sms//
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensms();
            }
        });
        // web page//
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwebview();
            }
        });
        //image view//
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openimage();
            }
        });

    }
                        // Music//
    public void openMusic(){
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);

    }
                // sms//
    public void opensms(){
        Intent intent = new Intent(this, sms.class);
        startActivity(intent);

    }

    public void openwebview(){
        Intent intent = new Intent(this,webview.class);
        startActivity(intent);
    }

    public void openimage() {
        Intent intent = new Intent(this,image.class);
        startActivity(intent);
    }


    public void displayToast(View view){
        Toast.makeText(this, "great work", Toast.LENGTH_SHORT).show();
    }
}
