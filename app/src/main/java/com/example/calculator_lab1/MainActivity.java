package com.example.calculator_lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void handleClickSummation(View view) {//setting listener on the summation button by the handleClick*() method

        //getting the link to the TextViews
        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        //checking whether entered values are numbers by regular expressions
        if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
            // adding two numbers and showing the result
            resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) + Double.parseDouble(secondValue.getText().toString())));
        }
        else {//if entered values are not numbers
            resultOutput.setText("You can enter only numbers!");
        }
    }

    public void handleClickSubtraction(View view) {//setting listener on the subtraction button by the handleClick*() method

        //getting the link to the TextViews
        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        //checking whether entered values are numbers by regular expressions
        if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
            // subtraction and showing the result
            resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) - Double.parseDouble(secondValue.getText().toString())));
        }
        else {//if entered values are not numbers
            resultOutput.setText("You can enter only numbers!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the link to the TextViews and buttons
        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        Button multiplication = findViewById(R.id.multiplication);
        Button division = findViewById(R.id.division);

        multiplication.setOnClickListener(l -> { //setting listener on the multiplication button by the View.setOnClickListener() method
            //checking whether entered values are numbers by regular expressions
            if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
                // multiplication and showing the result
                resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) * Double.parseDouble(secondValue.getText().toString())));
            }
            else {//if entered values are not numbers
                resultOutput.setText("You can enter only numbers!");
            }
        });

        division.setOnClickListener(l -> {//setting listener on the division button by the View.setOnClickListener() method
            //checking whether entered values are numbers by regular expressions
            if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
                //checking whether entered second number does not equal zero by regular expressions
                if (secondValue.getText().toString().matches("[0]")) {
                    resultOutput.setText("It can not be divided by zero");
                }
                else {
                    // division and showing the result
                    resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) / Double.parseDouble(secondValue.getText().toString())));
                }
            }
            else {//if entered values are not numbers
                resultOutput.setText("You can enter only numbers!");
            }
        });
    }
}