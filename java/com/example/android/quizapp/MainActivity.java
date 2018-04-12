package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int highScore = 0;


    //Code For Question One

    public int firstQuestionAnswer() {
        RadioButton firstQuestionButton = findViewById(R.id.q1_a3);

        if (firstQuestionButton.isChecked()) {
            highScore = 1;

        } else {
            highScore = 0;
        }
        return highScore;
    }

    //Code For Question Two

    public int secondQuestionButton() {
        RadioButton secondQuestionButton = findViewById(R.id.q2_a1);

        if (secondQuestionButton.isChecked()) {
            highScore = 1;

        } else {
            highScore = 0;
        }
        return highScore;
    }

}
