package com.example.fastmerge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.TextView;



import static com.example.fastmerge.R.raw.song;

public class Musical_Letters extends AppCompatActivity implements  View.OnClickListener{


    private static final String TAG = "txtview";
    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    MediaPlayer mla , mlb ,mlc ,mld ,mle, mlf ,mlg , mlh , mli,mlj,mlk,mll,mlm,mln,mlo,mlp,mlq,mlr,mls,mlt,mlu,mlv,mlw,mlx,mly,mlz;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_letters);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        i = findViewById(R.id.i);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        m = findViewById(R.id.m);
        n = findViewById(R.id.n);
        o = findViewById(R.id.o);
        p = findViewById(R.id.p);
        q = findViewById(R.id.q);
        r = findViewById(R.id.r);
        s = findViewById(R.id.s);
        t = findViewById(R.id.t);
        u = findViewById(R.id.u);
        v = findViewById(R.id.v);
        w = findViewById(R.id.w);
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        z = findViewById(R.id.z);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

        mla = MediaPlayer.create(this, song);
        mlb = MediaPlayer.create(this, song);
        mlc = MediaPlayer.create(this, song);
        mld = MediaPlayer.create(this, song);
        mle = MediaPlayer.create(this, song);
        mlf = MediaPlayer.create(this, song);
        mlg = MediaPlayer.create(this, song);
        mlh = MediaPlayer.create(this, song);
        mli = MediaPlayer.create(this, song);
        mlj = MediaPlayer.create(this, song);
        mlk = MediaPlayer.create(this, song);
        mll = MediaPlayer.create(this, song);
        mlm = MediaPlayer.create(this, song);
        mln = MediaPlayer.create(this, song);
        mlo = MediaPlayer.create(this, song);
        mlp = MediaPlayer.create(this, song);
        mlq = MediaPlayer.create(this, song);
        mlr = MediaPlayer.create(this, song);
        mls = MediaPlayer.create(this, song);
        mlt = MediaPlayer.create(this, song);
        mlu = MediaPlayer.create(this, song);
        mlv = MediaPlayer.create(this, song);
        mlw = MediaPlayer.create(this, song);
        mlx = MediaPlayer.create(this, song);
        mly = MediaPlayer.create(this, song);
        mlz = MediaPlayer.create(this, song);



    }

    @Override
    public void onClick(View v) {

        if(mla.isPlaying())
        {

            mla.pause();
            mla.seekTo(0);
        }
        else if(mlb.isPlaying())
        {
            mlb.pause();
            mlb.seekTo(0);
        }
        else if(mlc.isPlaying())
        {
            mlc.pause();
            mlc.seekTo(0);
        }
        else if(mld.isPlaying())
        {
            mld.pause();
            mld.seekTo(0);
        }
        else if(mle.isPlaying())
        {
            mle.pause();
            mle.seekTo(0);
        }
        else if(mlf.isPlaying())
        {
            mlf.pause();
            mlf.seekTo(0);
        }
        else if(mlg.isPlaying())
        {
            mlg.pause();
            mlg.seekTo(0);
        }
        else if(mlh.isPlaying())
        {
            mlh.pause();
            mlh.seekTo(0);
        }
        else if(mli.isPlaying())
        {
            mli.pause();
            mli.seekTo(0);
        }
        else if(mlj.isPlaying())
        {
            mlj.pause();
            mlj.seekTo(0);
        }
        else if(mlk.isPlaying())
        {
            mlk.pause();
            mlk.seekTo(0);
        }
        else if(mll.isPlaying())
        {
            mll.pause();
            mll.seekTo(0);
        }
        else if(mlm.isPlaying())
        {
            mlm.pause();
            mlm.seekTo(0);
        }
        else if(mln.isPlaying())
        {
            mln.pause();
            mln.seekTo(0);
        }
        else if(mlo.isPlaying())
        {
            mlo.pause();
            mlo.seekTo(0);
        }
        else if(mlp.isPlaying())
        {
            mlp.pause();
            mlp.seekTo(0);
        }
        else if(mlq.isPlaying())
        {
            mlq.pause();
            mlq.seekTo(0);
        }
        else if(mlr.isPlaying())
        {
            mlr.pause();
            mlr.seekTo(0);
        }
        else if(mls.isPlaying())
        {
            mls.pause();
            mls.seekTo(0);
        }
        else if(mlt.isPlaying())
        {
            mlt.pause();
            mlt.seekTo(0);
        }
        else if(mlu.isPlaying())
        {
            mlu.pause();
            mlu.seekTo(0);
        }
        else if(mlv.isPlaying())
        {
            mlv.pause();
            mlv.seekTo(0);
        }
        else if(mlw.isPlaying())
        {
            mlw.pause();
            mlw.seekTo(0);
        }
        else if(mlx.isPlaying())
        {
            mlx.pause();
            mlx.seekTo(0);
        }
        else if(mly.isPlaying())
        {
            mly.pause();
            mly.seekTo(0);
        }
        else if(mlz.isPlaying())
        {
            mlz.pause();
            mlz.seekTo(0);
        }

        switch (v.getId()){
            case (R.id.a):
                Log.d(TAG, "onClick: c1 started");

                mla.start();
                break;
            case (R.id.b):
                Log.d(TAG, "onClick: c1 started");
                mlb.start();
                break;
            case (R.id.c):
                Log.d(TAG, "onClick: c1 started");
                mlc.start();
                break;
            case (R.id.d):
                Log.d(TAG, "onClick: c1 started");
                mld.start();
                break;
            case (R.id.e):
                Log.d(TAG, "onClick: c1 started");
                mle.start();
                break;
            case (R.id.f):
                Log.d(TAG, "onClick: c1 started");
                mlf.start();
                break;
            case (R.id.g):
                Log.d(TAG, "onClick: c1 started");
                mlg.start();
                break;
            case (R.id.h):
                Log.d(TAG, "onClick: c1 started");
                mlh.start();
                break;
            case (R.id.i):
                Log.d(TAG, "onClick: c1 started");
                mli.start();
                break;
            case (R.id.j):
                Log.d(TAG, "onClick: c1 started");
                mlj.start();
                break;
            case (R.id.k):
                Log.d(TAG, "onClick: c1 started");
                mlk.start();
                break;
            case (R.id.l):
                Log.d(TAG, "onClick: c1 started");
                mll.start();
                break;
            case (R.id.m):
                Log.d(TAG, "onClick: c1 started");
                mlm.start();
                break;
            case (R.id.n):
                Log.d(TAG, "onClick: c1 started");
                mln.start();
                break;
            case (R.id.o):
                Log.d(TAG, "onClick: c1 started");
                mlo.start();
                break;
            case (R.id.p):
                Log.d(TAG, "onClick: c1 started");
                mlp.start();
                break;
            case (R.id.q):
                Log.d(TAG, "onClick: c1 started");
                mlq.start();
                break;
            case (R.id.r):
                Log.d(TAG, "onClick: c1 started");
                mlr.start();
                break;
            case (R.id.s):
                Log.d(TAG, "onClick: c1 started");
                mls.start();
                break;
            case (R.id.t):
                Log.d(TAG, "onClick: c1 started");
                mlt.start();
                break;
            case (R.id.u):
                Log.d(TAG, "onClick: c1 started");
                mlu.start();
                break;
            case (R.id.v):
                Log.d(TAG, "onClick: c1 started");
                mlv.start();
                break;
            case (R.id.w):
                Log.d(TAG, "onClick: c1 started");
                mlw.start();
                break;
            case (R.id.x):
                Log.d(TAG, "onClick: c1 started");
                mlx.start();
                break;
            case (R.id.y):
                Log.d(TAG, "onClick: c1 started");
                mly.start();
                break;
            case (R.id.z):
                Log.d(TAG, "onClick: c1 started");
                mlz.start();
                break;

        }








    }


}