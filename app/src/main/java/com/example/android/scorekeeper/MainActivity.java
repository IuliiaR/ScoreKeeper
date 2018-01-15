package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGriffindor = 0;
    int scoreSlytherin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Gryffindor.
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = findViewById(R.id.gryffindor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the quaffle ball is caught.
     */
    public void addTenPointsToGryffindor(View view) {
        scoreGriffindor = scoreGriffindor + 10;
        displayForGryffindor(scoreGriffindor);
    }

    /**
     * This method is called when the snitch is caught.
     */
    public void addSnitchPointsToGryggindor(View view) {
        scoreGriffindor = scoreGriffindor + 150;
        displayForGryffindor(scoreGriffindor);
        changeBackgroundImages(R.drawable.gryffindor_back, R.drawable.gryffindor);
        setButtonsVisibility(View.INVISIBLE);
    }

    /**
     * Displays the given score for Slytherin.
     */
    public void displayForSlytherin(int score) {
        TextView scoreView = findViewById(R.id.slytherin_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the quaffle ball is caught.
     */
    public void addTenPointsToSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 10;
        displayForSlytherin(scoreSlytherin);
    }

    /**
     * This method is called when the snitch is caught.
     */
    public void addSnitchPointsToSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 150;
        displayForSlytherin(scoreSlytherin);
        changeBackgroundImages(R.drawable.slytherin_back, R.drawable.slytherin);
        setButtonsVisibility(View.INVISIBLE);
    }

    public void resetAllScores(View view) {
        scoreGriffindor = 0;
        scoreSlytherin = 0;
        displayForGryffindor(scoreGriffindor);
        displayForSlytherin(scoreSlytherin);
        changeBackgroundImages(R.drawable.background, R.drawable.hogwarts_icon);
        setButtonsVisibility(View.VISIBLE);
    }

    /**
     * This method is called to change background image and logo when game finished
     * @param bgId Background image Id
     * @param logoId Logo image Id
     */
    private void changeBackgroundImages(int bgId, int logoId) {
        ImageView background = findViewById(R.id.background);
        background.setImageResource(bgId);
        ImageView logo = findViewById(R.id.logo);
        logo.setImageResource(logoId);
    }

    /**
     * This method is called to change score buttons visibility
     * @param visibility New value of button visibility
     */
    private void setButtonsVisibility(int visibility) {
        findViewById(R.id.tenPointsToGryggindor).setVisibility(visibility);
        findViewById(R.id.tenPointsToSlytherin).setVisibility(visibility);
        findViewById(R.id.snitchGryffindor).setVisibility(visibility);
        findViewById(R.id.snitchSlytherin).setVisibility(visibility);
    }
}
