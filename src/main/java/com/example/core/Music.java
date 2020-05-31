package com.example.core;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

    }

    public void Play(View view){
        if(player == null){
            player = MediaPlayer.create(this, R.raw.song);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public void Pause(View view){
        if(player != null) {
            player.pause();
            Toast.makeText(this,"Music Pause", Toast.LENGTH_SHORT).show();
        }

    }
    public void Stop(View view){
        stopPlayer();
    }

    private void  stopPlayer(){
        if(player != null) {
            player.release();
            player = null;
            Toast.makeText(this,"Music stoped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
