package com.example.ngoc.betapdoc_v2;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnHocChuCai, btnTroChoi, btnHuongDan;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.alphabet);
        mediaPlayer.start();

        btnHocChuCai = (Button) findViewById(R.id.btnHocChuCai);
        btnHocChuCai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent BangChuCai = new Intent(MainActivity.this, BangChuCai.class);
                startActivity(BangChuCai);


            }
        });

        btnHuongDan = (Button) findViewById(R.id.btnHuongDan);
        btnHuongDan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent HuongDan = new Intent(MainActivity.this, HuongDan.class);
                startActivity(HuongDan);
            }
        });


        btnTroChoi = (Button) findViewById(R.id.btnTroChoi);
        btnTroChoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent TroChoi = new Intent(MainActivity.this, game.class);
                startActivity(TroChoi);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.tb_mute3:
                AudioManager mAudioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume=0;
                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume, 0);
            break;
            case R.id.tb_unmute3:
                AudioManager   mAudioManager1 = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume1=10;
                mAudioManager1.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume1, 1);
            break;
            case R.id.tb_ex1:
                finish();
                moveTaskToBack(true);
            break;
        }
        return super.onOptionsItemSelected(item);
    }

}
