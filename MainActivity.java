package com.example.android.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int finalDegree;
    int correctAnswerCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalDegree = 0;
        correctAnswerCount=0;
    }

    public void submitClick(View v)
    {
        finalDegree = 0;
        correctAnswerCount=0;

        CheckQ1();
        CheckQ2();
        CheckQ3();
        CheckQ4();

        Toast.makeText(getApplicationContext(),"Final Drgree is:"+finalDegree+"\nCorrect answer is:"+correctAnswerCount,Toast.LENGTH_LONG).show();

    }

    private void CheckQ1()
    {
        EditText q1=(EditText)findViewById(R.id.q1Answer);
        String answer1=q1.getText().toString();
        if(answer1.equals(""))
            return;
        if(answer1.trim().toLowerCase().equals("3") || answer1.trim().toLowerCase().equals("three")) {
            finalDegree = finalDegree + 1;
            correctAnswerCount=correctAnswerCount+1;
        }

    }

    private void CheckQ2()
    {
        CheckBox cb1=(CheckBox)findViewById(R.id.q1cbox1);
        CheckBox cb2=(CheckBox)findViewById(R.id.q1cbox2);
        CheckBox cb3=(CheckBox)findViewById(R.id.q1cbox3);
        if(cb1.isChecked() && cb2.isChecked())
        {
            finalDegree+=1;
            correctAnswerCount+=1;
        }

    }

    private void CheckQ3()
    {
        RadioButton q3=(RadioButton) findViewById(R.id.rb1);
        int q3Degree=0;
        if(q3.isChecked())
            q3Degree = 1;
        else
            q3Degree=0;

        finalDegree+=q3Degree;
        correctAnswerCount+=q3Degree;


    }

    private void CheckQ4()
    {
        EditText q4=(EditText)findViewById(R.id.q4Answer);
        String qAnswer=q4.getText().toString();
        if(qAnswer.equals(""))
            return;
        if(Integer.parseInt(qAnswer.trim())==correctAnswerCount)
        {
            finalDegree+=1;
            correctAnswerCount+=1;
        }

    }

}
