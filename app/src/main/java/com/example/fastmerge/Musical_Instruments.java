package com.example.fastmerge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;





import static com.example.fastmerge.R.raw.song;

public class Musical_Instruments extends AppCompatActivity implements View.OnClickListener{


    public static final String TAG = "BTN";



    CardView c1 , c2, c3 ,c4 ,c5, c6 ,c7 , c8 ;
    MediaPlayer m1, m2, m3, m4 , m5, m6, m7, m8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_instruments);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);


        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);

        m1 = MediaPlayer.create(this, song);
        m2 = MediaPlayer.create(this, song);
        m3 = MediaPlayer.create(this, song);
        m4 = MediaPlayer.create(this, song);
        m5 = MediaPlayer.create(this, song);
        m6 = MediaPlayer.create(this, song);
        m7 = MediaPlayer.create(this, song);
        m8 = MediaPlayer.create(this, song);
    }




    @Override
    public void onClick(View v) {
        if(m1.isPlaying())
        {
            //m1.stop();
            m1.pause();
            m1.seekTo(0);
        }
        else if(m2.isPlaying())
        {
            m2.pause();
            // m2.release();
            m2.seekTo(0);
        }
        else if(m3.isPlaying()){
            m3.pause();
            //m3.release();
            m3.seekTo(0);
        }
        else if(m4.isPlaying()){
            m4.pause();
            m4.seekTo(0);
        }
        else if(m5.isPlaying()){
            m5.pause();
            //  m5.release();
            m5.seekTo(0);
        }
        else if(m6.isPlaying())
        {
            m6.pause();
            // m6.release();
            m6.seekTo(0);
        }
        else if(m7.isPlaying())
        {
            m7.pause();
            //m7.release();
            m7.seekTo(0);
        }
        else if(m8.isPlaying())
        { m8.pause();
            m8.seekTo(0);
            //m8.release();
        }


        switch (v.getId()){
            case (R.id.c1):

                Log.d(TAG, "onClick: c1 started");
                m1.start();

                break;
            case (R.id.c2):
                Log.d(TAG, "onClick: c2 started");
                m2.start();
                break;
            case (R.id.c3):
                Log.d(TAG, "onClick: c3 started");
                m3.start();break;
            case (R.id.c4):
                Log.d(TAG, "onClick: c4 started"); m4.start();break;
            case (R.id.c5):
                Log.d(TAG, "onClick: c5 started");m5.start();break;
            case (R.id.c6):
                Log.d(TAG, "onClick: c6 started");m6.start();break;
            case (R.id.c7):
                Log.d(TAG, "onClick: c7 started");m7.start();break;
            case (R.id.c8):
                Log.d(TAG, "onClick: c8 started");m8.start();break;
            default:break;


        }
    }


}