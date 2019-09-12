 package com.example.my_music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button play, pause,stop;
    MediaPlayer mediaPlayer;
    int pausepos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play= (Button) findViewById(R.id.btn_play);
        pause= (Button) findViewById(R.id.btn_pause);
        stop= (Button) findViewById(R.id.btn_stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }
     @Override
     public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btn_play:
                if(mediaPlayer==null){
                mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.sample);
                mediaPlayer.start();}
                else if(!mediaPlayer.isPlaying())
                {
                    mediaPlayer.seekTo(pausepos);
                    mediaPlayer.start();
                }
                break;
            case R.id.btn_pause:
                if(mediaPlayer!=null) {
                    mediaPlayer.pause();
                    pausepos= mediaPlayer.getCurrentPosition();
                }
                break;
            case R.id.btn_stop:
                if(mediaPlayer!=null)
                {
                mediaPlayer.stop();
                mediaPlayer= null;}
                break;



        }

     }
 }
