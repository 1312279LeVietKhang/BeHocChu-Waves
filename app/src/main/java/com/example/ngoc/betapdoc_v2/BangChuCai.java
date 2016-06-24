package com.example.ngoc.betapdoc_v2;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BangChuCai extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgbtn_1, imgbtn_2, imgbtn_3, imgbtn_4, imgbtn_5, imgbtn_6, imgbtn_7, imgbtn_8, imgbtn_9;

    ImageButton imgbtn_a, imgbtn_aw, imgbtn_aa, imgbtn_b, imgbtn_c, imgbtn_d, imgbtn_dd, imgbtn_e, imgbtn_ee, imgbtn_g;

    ImageButton imgbtn_h, imgbtn_i, imgbtn_k, imgbtn_l, imgbtn_m, imgbtn_n, imgbtn_o, imgbtn_oo, imgbtn_ow, imgbtn_p;

    ImageButton imgbtn_q, imgbtn_r, imgbtn_s, imgbtn_t, imgbtn_u, imgbtn_uw, imgbtn_v, imgbtn_x, imgbtn_y;

    ImageButton imgbtn_home;

    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bang_chu_cai);

        imgV = (ImageView) findViewById(R.id.imgV);
        imgV.setImageResource(R.drawable.tittle);

        imgbtn_1 = (ImageButton) findViewById(R.id.imgbtn_1);
        imgbtn_2 = (ImageButton) findViewById(R.id.imgbtn_2);
        imgbtn_3 = (ImageButton) findViewById(R.id.imgbtn_3);
        imgbtn_4 = (ImageButton) findViewById(R.id.imgbtn_4);
        imgbtn_5 = (ImageButton) findViewById(R.id.imgbtn_5);
        imgbtn_6 = (ImageButton) findViewById(R.id.imgbtn_6);
        imgbtn_7 = (ImageButton) findViewById(R.id.imgbtn_7);
        imgbtn_8 = (ImageButton) findViewById(R.id.imgbtn_8);
        imgbtn_9 = (ImageButton) findViewById(R.id.imgbtn_9);
        imgbtn_a = (ImageButton) findViewById(R.id.imgbtn_a);
        imgbtn_aw = (ImageButton) findViewById(R.id.imgbtn_aa);
        imgbtn_aa = (ImageButton) findViewById(R.id.imgbtn_aw);
        imgbtn_b = (ImageButton) findViewById(R.id.imgbtn_b);
        imgbtn_c = (ImageButton) findViewById(R.id.imgbtn_c);
        imgbtn_d = (ImageButton) findViewById(R.id.imgbtn_d);
        imgbtn_dd = (ImageButton) findViewById(R.id.imgbtn_dd);
        imgbtn_e = (ImageButton) findViewById(R.id.imgbtn_e);
        imgbtn_ee = (ImageButton) findViewById(R.id.imgbtn_ee);
        imgbtn_g = (ImageButton) findViewById(R.id.imgbtn_g);
        imgbtn_h = (ImageButton) findViewById(R.id.imgbtn_h);
        imgbtn_i = (ImageButton) findViewById(R.id.imgbtn_i);
        imgbtn_k = (ImageButton) findViewById(R.id.imgbtn_k);
        imgbtn_l = (ImageButton) findViewById(R.id.imgbtn_l);
        imgbtn_m = (ImageButton) findViewById(R.id.imgbtn_m);
        imgbtn_n = (ImageButton) findViewById(R.id.imgbtn_n);
        imgbtn_o = (ImageButton) findViewById(R.id.imgbtn_o);
        imgbtn_oo = (ImageButton) findViewById(R.id.imgbtn_oo);
        imgbtn_ow = (ImageButton) findViewById(R.id.imgbtn_ow);
        imgbtn_p = (ImageButton) findViewById(R.id.imgbtn_p);
        imgbtn_q = (ImageButton) findViewById(R.id.imgbtn_q);
        imgbtn_r = (ImageButton) findViewById(R.id.imgbtn_r);
        imgbtn_s = (ImageButton) findViewById(R.id.imgbtn_s);
        imgbtn_t = (ImageButton) findViewById(R.id.imgbtn_t);
        imgbtn_u = (ImageButton) findViewById(R.id.imgbtn_u);
        imgbtn_uw = (ImageButton) findViewById(R.id.imgbtn_uw);
        imgbtn_v = (ImageButton) findViewById(R.id.imgbtn_v);
        imgbtn_x = (ImageButton) findViewById(R.id.imgbtn_x);
        imgbtn_y = (ImageButton) findViewById(R.id.imgbtn_y);


        imgbtn_1.setOnClickListener((View.OnClickListener) this);
        imgbtn_2.setOnClickListener((View.OnClickListener) this);
        imgbtn_3.setOnClickListener((View.OnClickListener) this);
        imgbtn_4.setOnClickListener((View.OnClickListener) this);
        imgbtn_5.setOnClickListener((View.OnClickListener) this);
        imgbtn_6.setOnClickListener((View.OnClickListener) this);
        imgbtn_7.setOnClickListener((View.OnClickListener) this);
        imgbtn_8.setOnClickListener((View.OnClickListener) this);
        imgbtn_9.setOnClickListener((View.OnClickListener) this);
        imgbtn_a.setOnClickListener((View.OnClickListener) this);
        imgbtn_aw.setOnClickListener((View.OnClickListener) this);
        imgbtn_aa.setOnClickListener((View.OnClickListener) this);
        imgbtn_b.setOnClickListener((View.OnClickListener) this);
        imgbtn_c.setOnClickListener((View.OnClickListener) this);
        imgbtn_d.setOnClickListener((View.OnClickListener) this);
        imgbtn_dd.setOnClickListener((View.OnClickListener) this);
        imgbtn_e.setOnClickListener((View.OnClickListener) this);
        imgbtn_ee.setOnClickListener((View.OnClickListener) this);
        imgbtn_g.setOnClickListener((View.OnClickListener) this);
        imgbtn_h.setOnClickListener((View.OnClickListener) this);
        imgbtn_i.setOnClickListener((View.OnClickListener) this);
        imgbtn_k.setOnClickListener((View.OnClickListener) this);
        imgbtn_l.setOnClickListener((View.OnClickListener) this);
        imgbtn_m.setOnClickListener((View.OnClickListener) this);
        imgbtn_n.setOnClickListener((View.OnClickListener) this);
        imgbtn_o.setOnClickListener((View.OnClickListener) this);
        imgbtn_oo.setOnClickListener((View.OnClickListener) this);
        imgbtn_ow.setOnClickListener((View.OnClickListener) this);
        imgbtn_p.setOnClickListener((View.OnClickListener) this);
        imgbtn_q.setOnClickListener((View.OnClickListener) this);
        imgbtn_r.setOnClickListener((View.OnClickListener) this);
        imgbtn_s.setOnClickListener((View.OnClickListener) this);
        imgbtn_t.setOnClickListener((View.OnClickListener) this);
        imgbtn_u.setOnClickListener((View.OnClickListener) this);
        imgbtn_uw.setOnClickListener((View.OnClickListener) this);
        imgbtn_v.setOnClickListener((View.OnClickListener) this);
        imgbtn_x.setOnClickListener((View.OnClickListener) this);
        imgbtn_y.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {

        MediaPlayer mediaPlayer;

        switch (v.getId()) {
            case R.id.imgbtn_1:
                imgV.setImageResource(R.mipmap.so1);
                mediaPlayer = MediaPlayer.create(this, R.raw.so1);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_2:
                imgV.setImageResource(R.mipmap.so2);
                mediaPlayer = MediaPlayer.create(this, R.raw.so2);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_3:
                imgV.setImageResource(R.mipmap.so3);
                mediaPlayer = MediaPlayer.create(this, R.raw.so3);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_4:
                imgV.setImageResource(R.mipmap.so4);
                mediaPlayer = MediaPlayer.create(this, R.raw.so4);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_5:
                imgV.setImageResource(R.mipmap.so5);
                mediaPlayer = MediaPlayer.create(this, R.raw.so5);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_6:
                imgV.setImageResource(R.mipmap.so6);
                mediaPlayer = MediaPlayer.create(this, R.raw.so6);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_7:
                imgV.setImageResource(R.mipmap.so7);
                mediaPlayer = MediaPlayer.create(this, R.raw.so7);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_8:
                imgV.setImageResource(R.mipmap.so8);
                mediaPlayer = MediaPlayer.create(this, R.raw.so8);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_9:
                imgV.setImageResource(R.mipmap.so9);
                mediaPlayer = MediaPlayer.create(this, R.raw.so9);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_a:
                imgV.setImageResource(R.mipmap.a);
                mediaPlayer = MediaPlayer.create(this, R.raw.a);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_aw:
                imgV.setImageResource(R.mipmap.aw);
                mediaPlayer = MediaPlayer.create(this, R.raw.aw);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_aa:
                imgV.setImageResource(R.mipmap.aa);
                mediaPlayer = MediaPlayer.create(this, R.raw.aa);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_b:
                imgV.setImageResource(R.mipmap.b);
                mediaPlayer = MediaPlayer.create(this, R.raw.b);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_c:
                imgV.setImageResource(R.mipmap.c);
                mediaPlayer = MediaPlayer.create(this, R.raw.c);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_d:
                imgV.setImageResource(R.mipmap.d);
                mediaPlayer = MediaPlayer.create(this, R.raw.d);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_dd:
                imgV.setImageResource(R.mipmap.dd);
                mediaPlayer = MediaPlayer.create(this, R.raw.dd);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_e:
                imgV.setImageResource(R.mipmap.e);
                mediaPlayer = MediaPlayer.create(this, R.raw.e);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_ee:
                imgV.setImageResource(R.mipmap.ee);
                mediaPlayer = MediaPlayer.create(this, R.raw.ee);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_g:
                imgV.setImageResource(R.mipmap.g);
                mediaPlayer = MediaPlayer.create(this, R.raw.g);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_h:
                imgV.setImageResource(R.mipmap.h);
                mediaPlayer = MediaPlayer.create(this, R.raw.h);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_i:
                imgV.setImageResource(R.mipmap.i);
                mediaPlayer = MediaPlayer.create(this, R.raw.i);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_k:
                imgV.setImageResource(R.mipmap.k);
                mediaPlayer = MediaPlayer.create(this, R.raw.k);
                mediaPlayer.start();break;
            case R.id.imgbtn_l:
                imgV.setImageResource(R.mipmap.l);
                mediaPlayer = MediaPlayer.create(this, R.raw.l);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_m:
                imgV.setImageResource(R.mipmap.m);
                mediaPlayer = MediaPlayer.create(this, R.raw.m);
                mediaPlayer.start();
                break;
            case R.id. imgbtn_n:
                imgV.setImageResource(R.mipmap.n);
                mediaPlayer = MediaPlayer.create(this, R.raw.n);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_o:
                imgV.setImageResource(R.mipmap.o);
                mediaPlayer = MediaPlayer.create(this, R.raw.o);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_oo:
                imgV.setImageResource(R.mipmap.oo);
                mediaPlayer = MediaPlayer.create(this, R.raw.oo);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_ow:
                imgV.setImageResource(R.mipmap.ow);
                mediaPlayer = MediaPlayer.create(this, R.raw.ow);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_p:
                imgV.setImageResource(R.mipmap.p);
                mediaPlayer = MediaPlayer.create(this, R.raw.p);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_q:
                imgV.setImageResource(R.mipmap.q);
                mediaPlayer = MediaPlayer.create(this, R.raw.g);
                mediaPlayer.start();break;
            case R.id.imgbtn_r:
                imgV.setImageResource(R.mipmap.r);
                mediaPlayer = MediaPlayer.create(this, R.raw.r);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_s:
                imgV.setImageResource(R.mipmap.s);
                mediaPlayer = MediaPlayer.create(this, R.raw.s);
                mediaPlayer.start();
                break;
            case R.id. imgbtn_t:
                imgV.setImageResource(R.mipmap.t);
                mediaPlayer = MediaPlayer.create(this, R.raw.t);
                mediaPlayer.start();
                break;
            case R.id. imgbtn_u:
               imgV.setImageResource(R.mipmap.u);
                mediaPlayer = MediaPlayer.create(this, R.raw.u);
                mediaPlayer.start();
                break;
            case R.id. imgbtn_uw:
                imgV.setImageResource(R.mipmap.uw);
                mediaPlayer = MediaPlayer.create(this, R.raw.uw);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_v:
                imgV.setImageResource(R.mipmap.v);
                mediaPlayer = MediaPlayer.create(this, R.raw.v);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_x:
                imgV.setImageResource(R.mipmap.x);
                mediaPlayer = MediaPlayer.create(this, R.raw.x);
                mediaPlayer.start();
                break;
            case R.id.imgbtn_y:
                imgV.setImageResource(R.mipmap.y);
                mediaPlayer = MediaPlayer.create(this, R.raw.y);
                mediaPlayer.start();
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.tb_ex:
                finish();
                moveTaskToBack(true);
            break;
            case R.id.tb_mute:
                AudioManager   mAudioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume=0;
                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume, 0);
            break;
            case R.id.tb_unmute:
                AudioManager   mAudioManager1 = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume1=10;
                mAudioManager1.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume1, 1);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
