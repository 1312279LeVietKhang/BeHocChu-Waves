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

import java.util.Random;

public class game extends AppCompatActivity {
    ImageView imV_g;
    ImageButton imgbtn_loa, imgbtn_g1, imgbtn_g2, imgbtn_g3, imgbtn_try;
    MediaPlayer s[] = new MediaPlayer[29];
    MediaPlayer mda_correct, mda_wrong;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imV_g = (ImageView) findViewById(R.id.imV_g);

        imgbtn_loa = (ImageButton) findViewById(R.id.imgbtn_loa);
        imgbtn_g1 = (ImageButton) findViewById(R.id.imgbtn_g1);
        imgbtn_g2 = (ImageButton) findViewById(R.id.imgbtn_g2);
        imgbtn_g3 = (ImageButton) findViewById(R.id.imgbtn_g3);
        imgbtn_try = (ImageButton) findViewById(R.id.imgbtn_try);



        s[0] = MediaPlayer.create(this,R.raw.a);
        s[1] = MediaPlayer.create(this,R.raw.aw);
        s[2] = MediaPlayer.create(this,R.raw.aa);
        s[3] = MediaPlayer.create(this,R.raw.b);
        s[4] = MediaPlayer.create(this,R.raw.c);
        s[5] = MediaPlayer.create(this,R.raw.d);
        s[6] = MediaPlayer.create(this,R.raw.dd);
        s[7] = MediaPlayer.create(this,R.raw.e);
        s[8] = MediaPlayer.create(this,R.raw.ee);
        s[9] = MediaPlayer.create(this,R.raw.g);
        s[10] = MediaPlayer.create(this,R.raw.h);
        s[11] = MediaPlayer.create(this,R.raw.i);
        s[12] = MediaPlayer.create(this,R.raw.k);
        s[13] = MediaPlayer.create(this,R.raw.l);
        s[14] = MediaPlayer.create(this,R.raw.m);
        s[15] = MediaPlayer.create(this,R.raw.n);
        s[16] = MediaPlayer.create(this,R.raw.o);
        s[17] = MediaPlayer.create(this,R.raw.oo);
        s[18] = MediaPlayer.create(this,R.raw.ow);
        s[19] = MediaPlayer.create(this,R.raw.p);
        s[20] = MediaPlayer.create(this,R.raw.q);
        s[21] = MediaPlayer.create(this,R.raw.r);
        s[22] = MediaPlayer.create(this,R.raw.s);
        s[23] = MediaPlayer.create(this,R.raw.t);
        s[24] = MediaPlayer.create(this,R.raw.u);
        s[25] = MediaPlayer.create(this,R.raw.uw);
        s[26] = MediaPlayer.create(this,R.raw.v);
        s[27] = MediaPlayer.create(this,R.raw.x);
        s[28] = MediaPlayer.create(this,R.raw.y);

        mda_correct = MediaPlayer.create(this,R.raw.correct);
        mda_wrong = MediaPlayer.create(this,R.raw.wrong);



        imgbtn_loa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                n = r.nextInt(28);
                s[n].start();

                imgbtn_try.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        s[n].start();
                    }
                });

                switch (n) {
                    case 0:
                        imgbtn_g1.setImageResource(R.drawable.chu_a);
                        imgbtn_g2.setImageResource(R.drawable.chu_aa);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 1:
                        imgbtn_g1.setImageResource(R.drawable.chu_b);
                        imgbtn_g2.setImageResource(R.drawable.chu_aw);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 2:
                        imgbtn_g1.setImageResource(R.drawable.chu_u);
                        imgbtn_g2.setImageResource(R.drawable.chu_c);
                        imgbtn_g3.setImageResource(R.drawable.chu_aa);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 3:
                        imgbtn_g1.setImageResource(R.drawable.chu_b);
                        imgbtn_g2.setImageResource(R.drawable.chu_u);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 4:
                        imgbtn_g1.setImageResource(R.drawable.chu_t);
                        imgbtn_g2.setImageResource(R.drawable.chu_aw);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 5:
                        imgbtn_g1.setImageResource(R.drawable.chu_b);
                        imgbtn_g2.setImageResource(R.drawable.chu_d);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 6:
                        imgbtn_g1.setImageResource(R.drawable.chu_dd);
                        imgbtn_g2.setImageResource(R.drawable.chu_uw);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 7:
                        imgbtn_g1.setImageResource(R.drawable.chu_e);
                        imgbtn_g2.setImageResource(R.drawable.chu_u);
                        imgbtn_g3.setImageResource(R.drawable.chu_k);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 8:
                        imgbtn_g1.setImageResource(R.drawable.chu_m);
                        imgbtn_g2.setImageResource(R.drawable.chu_ee);
                        imgbtn_g3.setImageResource(R.drawable.chu_k);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 9:
                        imgbtn_g1.setImageResource(R.drawable.chu_b);
                        imgbtn_g2.setImageResource(R.drawable.chu_g);
                        imgbtn_g3.setImageResource(R.drawable.chu_x);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 10:
                        imgbtn_g1.setImageResource(R.drawable.chu_x);
                        imgbtn_g2.setImageResource(R.drawable.chu_h);
                        imgbtn_g3.setImageResource(R.drawable.chu_t);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 11:
                        imgbtn_g1.setImageResource(R.drawable.chu_i);
                        imgbtn_g2.setImageResource(R.drawable.chu_ee);
                        imgbtn_g3.setImageResource(R.drawable.chu_e);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 12:
                        imgbtn_g1.setImageResource(R.drawable.chu_t);
                        imgbtn_g2.setImageResource(R.drawable.chu_aw);
                        imgbtn_g3.setImageResource(R.drawable.chu_k);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 13:
                        imgbtn_g1.setImageResource(R.drawable.chu_u);
                        imgbtn_g2.setImageResource(R.drawable.chu_m);
                        imgbtn_g3.setImageResource(R.drawable.chu_l);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 14:
                        imgbtn_g1.setImageResource(R.drawable.chu_m);
                        imgbtn_g2.setImageResource(R.drawable.chu_t);
                        imgbtn_g3.setImageResource(R.drawable.chu_i);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 15:
                        imgbtn_g1.setImageResource(R.drawable.chu_a);
                        imgbtn_g2.setImageResource(R.drawable.chu_n);
                        imgbtn_g3.setImageResource(R.drawable.chu_u);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 16:
                        imgbtn_g1.setImageResource(R.drawable.chu_o);
                        imgbtn_g2.setImageResource(R.drawable.chu_oo);
                        imgbtn_g3.setImageResource(R.drawable.chu_a);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 17:
                        imgbtn_g1.setImageResource(R.drawable.chu_n);
                        imgbtn_g2.setImageResource(R.drawable.chu_aw);
                        imgbtn_g3.setImageResource(R.drawable.chu_oo);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 18:
                        imgbtn_g1.setImageResource(R.drawable.chu_t);
                        imgbtn_g2.setImageResource(R.drawable.chu_ow);
                        imgbtn_g3.setImageResource(R.drawable.chu_y);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 19:
                        imgbtn_g1.setImageResource(R.drawable.chu_p);
                        imgbtn_g2.setImageResource(R.drawable.chu_r);
                        imgbtn_g3.setImageResource(R.drawable.chu_t);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 20:
                        imgbtn_g1.setImageResource(R.drawable.chu_q);
                        imgbtn_g2.setImageResource(R.drawable.chu_m);
                        imgbtn_g3.setImageResource(R.drawable.chu_oo);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 21:
                        imgbtn_g1.setImageResource(R.drawable.chu_r);
                        imgbtn_g2.setImageResource(R.drawable.chu_b);
                        imgbtn_g3.setImageResource(R.drawable.chu_y);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 22:
                        imgbtn_g1.setImageResource(R.drawable.chu_u);
                        imgbtn_g2.setImageResource(R.drawable.chu_aw);
                        imgbtn_g3.setImageResource(R.drawable.chu_s);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 23:
                        imgbtn_g1.setImageResource(R.drawable.chu_x);
                        imgbtn_g2.setImageResource(R.drawable.chu_n);
                        imgbtn_g3.setImageResource(R.drawable.chu_t);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 24:
                        imgbtn_g1.setImageResource(R.drawable.chu_u);
                        imgbtn_g2.setImageResource(R.drawable.chu_ee);
                        imgbtn_g3.setImageResource(R.drawable.chu_v);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 25:
                        imgbtn_g1.setImageResource(R.drawable.chu_v);
                        imgbtn_g2.setImageResource(R.drawable.chu_uw);
                        imgbtn_g3.setImageResource(R.drawable.chu_t);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 26:
                        imgbtn_g1.setImageResource(R.drawable.chu_v);
                        imgbtn_g2.setImageResource(R.drawable.chu_n);
                        imgbtn_g3.setImageResource(R.drawable.chu_c);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });
                        break;

                    case 27:
                        imgbtn_g1.setImageResource(R.drawable.chu_m);
                        imgbtn_g2.setImageResource(R.drawable.chu_a);
                        imgbtn_g3.setImageResource(R.drawable.chu_x);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;

                    case 28:
                        imgbtn_g1.setImageResource(R.drawable.chu_q);
                        imgbtn_g2.setImageResource(R.drawable.chu_p);
                        imgbtn_g3.setImageResource(R.drawable.chu_y);

                        imgbtn_g1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.sai);
                                mda_wrong.start();
                            }
                        });

                        imgbtn_g3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imV_g.setImageResource(R.drawable.dung);
                                mda_correct.start();
                            }
                        });
                        break;
                }

            }
        });
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
                AudioManager mAudioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
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