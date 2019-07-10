package com.example.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class StartActivity extends AppCompatActivity {

    TextView score, question;
    Button b11, b12;

    private Questions ques=new Questions();
    private  String  mAnswer;
    private int mScore=0;
    private int quesLength=ques.ques.length;
    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        question = findViewById(R.id.question);
        score = findViewById(R.id.vs);


        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);


        r=new Random();
        score.setText("Score: " + mScore);
        updateQuestions(r.nextInt(quesLength));


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b11.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(quesLength));

                }else {
                    gameOver();
                }

            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b12.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(r.nextInt(quesLength));

                }else {
                    gameOver();
                }

            }
        });


    }
    private void updateQuestions(int num)
    {
        question.setText(ques.getQuestion(num));
        b11.setText(ques.getChoice1(num));
        b12.setText(ques.getChoice2(num));

        mAnswer=ques.getCorrectAnswer(num);

    }
private void gameOver()
{

    AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(StartActivity.this);
    alertDialogBuilder
            .setMessage("Game Over !!! Your Score Is " +mScore +"points.")
            .setCancelable(false)
            .setPositiveButton("START NEW QUIZ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    startActivity(new Intent(getApplicationContext(),StartActivity.class));
                    finish();
                }
            })

    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

        startActivity(new Intent(getApplicationContext(),StartActivity.class));
        finish();
    }
});


            AlertDialog alertDialog=alertDialogBuilder.create();
            alertDialog.show();
}};