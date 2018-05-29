package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB = 0;
    final int THREE_POINTS = 3,TWO_POINTS = 2,FREE_THROW = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void AddThreePointsTeamA(View view) {
        scoreTeamA+=THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void AddTwoPointsTeamA(View view) {
        scoreTeamA+=TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void AddFreeThrowTeamA(View view) {
        scoreTeamA+=FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    public void AddThreePointsTeamB(View view) {
        scoreTeamB+=THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void AddTwoPointsTeamB(View view) {
        scoreTeamB+=TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void AddFreeThrowTeamB(View view) {
        scoreTeamB+=FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    public void ResetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
