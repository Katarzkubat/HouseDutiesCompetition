package com.example.katarzkubat.housedutiescompetition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreFirstPerson = 0;
    int scoreSecondPerson = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForFirstPerson(View view) {
        scoreFirstPerson = scoreFirstPerson + 1;
        displayForFirstPerson(scoreFirstPerson);
    }

    public void addTwoForFirstPerson(View view) {
        scoreFirstPerson = scoreFirstPerson + 2;
        displayForFirstPerson(scoreFirstPerson);
    }

    public void subtractOneForFirstPerson(View view) {
        scoreFirstPerson = scoreFirstPerson - 1;
        displayForFirstPerson(scoreFirstPerson);
    }

    public void displayForFirstPerson(int scoreFirstPerson) {
        if (scoreFirstPerson >=0){
            TextView scoreView = (TextView) findViewById(R.id.score_first_person);
            scoreView.setText(String.valueOf(scoreFirstPerson));
        }
    }

    public void addOneForSecondPerson(View view) {
        scoreSecondPerson = scoreSecondPerson + 1;
        displayForSecondPerson(scoreSecondPerson);
    }

    public void addTwoForSecondPerson(View view) {
        scoreSecondPerson = scoreSecondPerson + 2;
        displayForSecondPerson(scoreSecondPerson);
    }

    public void subtractOneForSecondPerson(View view) {
        scoreSecondPerson = scoreSecondPerson - 1;
        displayForSecondPerson(scoreSecondPerson);
    }

    public void displayForSecondPerson(int scoreSecondPerson) {
        if (scoreSecondPerson >=0){
            TextView scoreView = (TextView) findViewById(R.id.score_second_person);
            scoreView.setText(String.valueOf(scoreSecondPerson));
        }
    }

    public void resetScore(View view) {
        scoreFirstPerson = 0;
        scoreSecondPerson= 0;
        displayForFirstPerson(scoreFirstPerson);
        displayForSecondPerson(scoreSecondPerson);
    }
}