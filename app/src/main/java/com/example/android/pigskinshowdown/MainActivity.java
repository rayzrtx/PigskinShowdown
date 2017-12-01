package com.example.android.pigskinshowdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the football score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    int scoreTexas = 0;
    int scoreWorld = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Texas.
     */
    public void displayScoreForTexas(int score) {
        TextView scoreView = (TextView) findViewById(R.id.texas_score_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for World.
     */
    public void displayScoreForWorld(int score) {
        TextView scoreView = (TextView) findViewById(R.id.world_score_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Texas by 6 points.
     */
    public void addSixPointsTexas(View view) {
        scoreTexas = scoreTexas + 6;
        displayScoreForTexas(scoreTexas);
    }

    /**
     * Increase the score for World by 6 points.
     */
    public void addSixPointsWorld(View view){
        scoreWorld = scoreWorld + 6;
        displayScoreForWorld(scoreWorld);
    }

    /**
     * Increase the score for Texas by 3 points.
     */
    public void addThreePointsTexas(View view) {
        scoreTexas = scoreTexas + 3;
        displayScoreForTexas(scoreTexas);
    }

    /**
     * Increase the score for World by 3 points.
     */
    public void addThreePointsWorld(View view) {
        scoreWorld = scoreWorld + 3;
        displayScoreForWorld(scoreWorld);
    }

    /**
     * Increase the score for Texas by 1 point.
     */
    public void addOnePointTexas(View view) {
        scoreTexas = scoreTexas + 1;
        displayScoreForTexas(scoreTexas);
    }

    /**
     * Increase the score for World by 1 point.
     */
    public void addOnePointWorld(View view) {
        scoreWorld = scoreWorld + 1;
        displayScoreForWorld(scoreWorld);
    }

    /**
     * Increase the score for Texas by 2 points.
     */
    public void addTwoPointsTexas(View view) {
        scoreTexas = scoreTexas + 2;
        displayScoreForTexas(scoreTexas);
    }

    /**
     * Increase the score for World by 2 points.
     */
    public void addTwoPointsWorld(View view) {
        scoreWorld = scoreWorld + 2;
        displayScoreForWorld(scoreWorld);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScoreToZero(View view) {
        scoreWorld = 0;
        scoreTexas = 0;
        displayScoreForWorld(scoreWorld);
        displayScoreForTexas(scoreTexas);
    }
}
