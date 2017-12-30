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
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the free throw button is clicked.
     */
    public void addTenPointsToGryffindor(View view) {
        scoreGriffindor = scoreGriffindor + 10;
        displayForTeamA(scoreGriffindor);
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void addSnitchPointsToGryggindor(View view) {
        scoreGriffindor = scoreGriffindor + 150;
        displayForTeamA(scoreGriffindor);
        changeBackgroundImages(R.drawable.gryffindor_back, R.drawable.gryffindor);
        setButtonsVisibility(View.INVISIBLE);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.slytherin_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the free throw button is clicked.
     */
    public void addTenPointsToSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 10;
        displayForTeamB(scoreSlytherin);
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void addSnitchPointsToSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 150;
        displayForTeamB(scoreSlytherin);
        changeBackgroundImages(R.drawable.slytherin_back, R.drawable.slytherin);
        setButtonsVisibility(View.INVISIBLE);
    }

    public void resetAllScores(View view) {
        scoreGriffindor = 0;
        scoreSlytherin = 0;
        displayForTeamA(scoreGriffindor);
        displayForTeamB(scoreSlytherin);
        changeBackgroundImages(R.drawable.background, R.drawable.hogwarts_icon);
        setButtonsVisibility(View.VISIBLE);
    }

    private void changeBackgroundImages(int bgId, int logoId)
    {
        ImageView background = (ImageView) findViewById(R.id.background);
        background.setImageResource(bgId);
        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(logoId);
    }

    private void setButtonsVisibility(int visibility)
    {
        findViewById(R.id.tenPointsToGryggindor).setVisibility(visibility);
        findViewById(R.id.tenPointsToSlytherin).setVisibility(visibility);
        findViewById(R.id.snitchGryffindor).setVisibility(visibility);
        findViewById(R.id.snitchSlytherin).setVisibility(visibility);
    }
}
