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

    int correctAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitButton(View view) {

        //Radio answers check for question 1
        RadioButton questionOneAnswer = findViewById(R.id.q1_a3);
        boolean question1correct = questionOneAnswer.isChecked();

        //adds to user score if question 1 is right
        if (question1correct) {
            correctAnswer = correctAnswer + 1;
        }

        //radio answer check for question 2
        RadioButton questionTwoAnswer = findViewById(R.id.q2_a2);
        boolean question2correct = questionTwoAnswer.isChecked();

        //adds to user score if question 2 is right
        if (question2correct) {
            correctAnswer = correctAnswer + 1;
        }

        //checkbox answers check for question 3
        CheckBox questionThreeAnswerA = findViewById(R.id.rest_notes);
        boolean question3correctA = questionThreeAnswerA.isChecked();

        CheckBox questionThreeAnswerB = findViewById(R.id.eigth_notes);
        boolean question3correctB = questionThreeAnswerB.isChecked();

        CheckBox questionThreeAnswerC = findViewById(R.id.sixteenth_notes);
        boolean question3correctC = questionThreeAnswerC.isChecked();

        CheckBox questionThreeAnswerD = findViewById(R.id.triplets);
        boolean question3correctD = questionThreeAnswerD.isChecked();

        //adds the user score if correct answer of only B,C, D are correct
        if ((question3correctB && question3correctC && question3correctD) && (!question3correctB) && (!question3correctC)) {
            correctAnswer = correctAnswer + 1;
        }

        //form field entry check
        EditText answer = findViewById(R.id.q4_edit_text);
        String answerText = answer.getText().toString();

        // adds to the score total if correct answer is typed.
        if (answerText.equalsIgnoreCase("metrenome")) {
            correctAnswer = correctAnswer + 1;
        } else if (answerText.equalsIgnoreCase("metrenome")) {
            correctAnswer = correctAnswer + 1;
        } else if (answerText.equalsIgnoreCase("a metrenome")) {
            correctAnswer = correctAnswer + 1;
        }

        //return of display score
        displayScore(correctAnswer);
        displayToast(correctAnswer);
    }

    public void displayScore(int correctAnswer) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_button);
        scoreTextView.setText(String.valueOf(correctAnswer));
    }

    public void displayToast(int correct) {
        if (correct == 4) {
            Toast.makeText(getApplicationContext(), "Your awesome, Congratulations", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Practice, you will get better", Toast.LENGTH_SHORT).show();
        }
    }
}











