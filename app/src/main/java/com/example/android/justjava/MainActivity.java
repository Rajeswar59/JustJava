package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA=0;
    int scoreForTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    This method is called when user press "+3 points" button
    add three points and call the display function to display the result in the Result TextView of Team A
     */
    protected void addThreePointsToTeamA(View view){
        scoreForTeamA=scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);
    }

    /*
    This method is called when user press "+2 points" button
    add two points and call the display function to display the result in the Result TextView of Team A
     */
    protected void addTwoPointsToTeamA(View view){
        scoreForTeamA=scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);
    }

    /*
    This method is called when user press "Free Throw" button
    add one points and call the display function to display the result in the Result TextView of Team A
     */
    protected void addOnePointsToTeamA(View view){
        scoreForTeamA=scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }

    /*
    This method is called when user press "+3 points" button
    add three points and call the display function to display the result in the Result TextView of Team B
     */
    protected void addThreePointsToTeamB(View view){
        scoreForTeamB=scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);
    }

    /*
    This method is called when user press "+2 points" button
    add two points and call the display function to display the result in the Result TextView of Team B
     */
    protected void addTwoPointsToTeamB(View view){
        scoreForTeamB=scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);
    }
    /*
    This method is called when user press "Free Throw" button
    add one points and call the display function to display the result in the Result TextView of Team B
     */
    protected void addOnePointsToTeamB(View view){
        scoreForTeamB=scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }
    /*
    This method is called when user press "reset" button
    reset the score variables to to zero and call the display function to display the result in the Result TextView of Team A
     */
    protected void resetScore(View view){
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

    /*
    Display given score for Team A
     */
    private void displayForTeamA(int score){
        TextView scoreTeamAView=(TextView)findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(score));
    }

    /*
    Display given score for Team B
     */
    private void displayForTeamB(int score){
        TextView scoreTeamBView=(TextView)findViewById(R.id.team_b_score);
        scoreTeamBView.setText(String.valueOf(score));
    }
}
