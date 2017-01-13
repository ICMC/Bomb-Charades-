package com.example.anna_.bombcharades;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;
import android.os.Vibrator;


import org.w3c.dom.Text;

import java.util.logging.LogRecord;

import static android.R.color.holo_green_light;
import static android.graphics.Color.*;
import static com.example.anna_.bombcharades.R.id.screen;

public class DisplayWords extends AppCompatActivity{




    final Vector<String> dictionary = new Vector<String>();
    final Vector<String> Scored =  new Vector<String>();

    TextView timerTextView;
    long startTime = 0;

    private void endGame(ArrayList<String> dictionary, int[] count){
        String points = String.valueOf(count[0]);

        Intent intent = new Intent(this, GameScore.class);
        intent.putStringArrayListExtra("wordlist", dictionary);
        intent.putExtra("points",points);
        startActivity(intent);
        finish();
    }

    private void changeBackground(long milliseconds){
        View background = findViewById(R.id.space1);

        if(milliseconds == 50000){
            background.setBackgroundColor(WHITE);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_display_words);



        Intent intent =getIntent();


        final ArrayList<String> dictionary = intent.getStringArrayListExtra("wordlist");
        final TextView text = (TextView)findViewById(R.id.word);
        //initdictionary(dictionary);

        //shuffling the worslist to be displayed
        long seed = System.nanoTime();
        Collections.shuffle(dictionary, new Random(seed));

        text.setText(dictionary.get(0));
        final int[] count = {0};

        final Button bRight = (Button)findViewById(R.id.right);
        final Button bPass = (Button)findViewById(R.id.pass);




        bRight.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    //final RelativeLayout background  = (RelativeLayout) findViewById(R.id.activity_display_words);
                    //background.setBackgroundColor(Color.GREEN);
                    Scored.add(dictionary.get(0));
                    dictionary.remove(0);

                    if (dictionary.size() != 0) {
                        //Delay for the background to be green for .5 seconds
                        new CountDownTimer(500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }

                            public void onFinish() {
                                //background.setBackgroundColor(Color.WHITE);
                                text.setText(dictionary.get(0));

                            }
                        }.start();

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        // Vibrate for 500 milliseconds
                        v.vibrate(500);
                        count[0]=count[0] +1;
                    }

                    else {
                        text.setText("BOOOM");
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        // Vibrate for 500 milliseconds
                        v.vibrate(2000);
                        String point = String.valueOf(count[0]);
                        //initdictionary(dictionary);
                        count[0] = 0;
                    }

                }
        });

        bPass.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(final View view) {
                    dictionary.remove(0);
                    //final RelativeLayout background  = (RelativeLayout) findViewById(R.id.activity_display_words);
                    //background.setBackgroundColor(Color.RED);

                    if (dictionary.size() != 0) {
                        //background.setBackgroundColor(Color.RED);
                        //garantees that the RED background is up for 0.5 seconds
                        new CountDownTimer(500, 1000) {

                            public void onTick(long millisUntilFinished) {

                            }

                            public void onFinish() {
                                //background.setBackgroundColor(Color.WHITE);
                                text.setText(dictionary.get(0));
                            }
                        }.start();

                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        v.vibrate(500);

                    } else {
                        onPause();
                        text.setText("BOOOM");
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        // Vibrate for 500 milliseconds
                        v.vibrate(2000);
                        //initdictionary(dictionary);
                        count[0] = 0;
                    }

                }
        });

        new CountDownTimer(70000, 1000) {

            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished <= 65000){
                    View background = findViewById(R.id.space1);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 60000){
                    View background = findViewById(R.id.space2);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 55000){
                    View background = findViewById(R.id.space3);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 50000){
                    View background = findViewById(R.id.space4);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 45000){
                    View background = findViewById(R.id.space5);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 40000){
                    View background = findViewById(R.id.space6);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 35000){
                    View background = findViewById(R.id.space7);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 30000){
                    View background = findViewById(R.id.space8);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 25000){
                    View background = findViewById(R.id.space9);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 20000){
                    View background = findViewById(R.id.space10);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 15000){
                    View background = findViewById(R.id.space11);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 10000){
                    View background = findViewById(R.id.space12);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 5000){
                    View background = findViewById(R.id.space13);
                    background.setBackgroundColor(WHITE);
                }
                if(millisUntilFinished <= 500){
                    View background = findViewById(R.id.space14);
                    background.setBackgroundColor(WHITE);
                }
            }

            public void onFinish(){

                endGame(dictionary,count);
            }
        }.start();


    }




}
