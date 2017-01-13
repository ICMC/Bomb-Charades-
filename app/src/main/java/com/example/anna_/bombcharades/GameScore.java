package com.example.anna_.bombcharades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class GameScore extends AppCompatActivity {

    private void continueGame(ArrayList<String> dictionary){

        Intent intent = new Intent(this, DisplayWords.class);
        intent.putStringArrayListExtra("wordlist", dictionary);
        startActivity(intent);
        finish();
    }
    private void newGame(){
        Intent intent = new Intent(this, FullscreenActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_score);

        Intent intent =getIntent();
        final ArrayList<String> dictionary = intent.getStringArrayListExtra("wordlist");
        final String score =intent.getExtras().getString("points");

        TextView points = (TextView) findViewById(R.id.score);
        points.setText(score);
        final Button nextPlayer = (Button)findViewById(R.id.player);
        Button menu = (Button) findViewById(R.id.menu);

        nextPlayer.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                continueGame(dictionary);
            }

            });

        menu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                newGame();
            }
        });

    }
}
