package com.example.ngoc.betapdoc_v2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HuongDan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huong_dan);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.tb_mute:
                AudioManager mAudioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume=0;
                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume, 0);
            break;
            case R.id.tb_unmute:
                AudioManager   mAudioManager1 = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
                int set_volume1=10;
                mAudioManager1.setStreamVolume(AudioManager.STREAM_MUSIC,set_volume1, 1);
            break;
            case R.id.tb_ex:
                finish();
                moveTaskToBack(true);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
