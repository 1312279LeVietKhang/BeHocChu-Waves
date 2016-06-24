package com.example.ngoc.betapdoc_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        // thread for displaying the SplashScreen
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5 * 1000);

                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Intent mainIntent = new Intent(splashscreen.this, MainActivity.class);
                    splashscreen.this.startActivity(mainIntent);
                    splashscreen.this.finish();
                }

            }
        };
        splashTread.start();
    }
}
