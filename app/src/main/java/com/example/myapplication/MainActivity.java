package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView panel;
    private double result, firstNumber, secondNumber;
    private String operation;
    String intermediateNumber = "";
    boolean isOperation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panel = findViewById(R.id.text);
    }
    public void onClick_buttons(View view) {
        if (isOperation) {
            panel.setText("");
            result = 0;
            operation = null;
            secondNumber = 0;
            firstNumber = 0;
            intermediateNumber = "";
            isOperation = false;
        }

        switch (view.getId()) {
            case R.id.button0:
                intermediateNumber += "0";
                break;
            case R.id.button1:
                intermediateNumber += "1";
                break;

            case R.id.button2:
                intermediateNumber += "2";
                break;

            case R.id.button3:
                intermediateNumber += "3";
                break;
            case R.id.button4:
                intermediateNumber += "4";
                break;

            case R.id.button5:
                intermediateNumber += "5";
                break;

            case R.id.button6:
                intermediateNumber += "6";
                break;

            case R.id.button7:
                intermediateNumber += "7";
                break;

            case R.id.button8:
                intermediateNumber += "8";
                break;

            case R.id.button9:
                intermediateNumber += "9";
                break;

            case R.id.comma:
                intermediateNumber += ".";
                break;
        }
        panel.setText(intermediateNumber);
    }

    public void onClick_buttonLogic(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstNumber = Double.parseDouble(intermediateNumber);
                operation = "+";
                intermediateNumber = "";
                panel.setText("+");
                break;
            case R.id.minus:
                firstNumber = Double.parseDouble(intermediateNumber);
                operation = "-";
                intermediateNumber = "";
                panel.setText("-");
                break;
            case R.id.multiply:
                firstNumber = Double.parseDouble(intermediateNumber);
                operation = "*";
                intermediateNumber = "";
                panel.setText("*");
                break;
            case R.id.division:
                firstNumber = Double.parseDouble(intermediateNumber);
                operation = "/";
                intermediateNumber = "";
                panel.setText("/");
                break;
            case R.id.equal:
                secondNumber = Double.parseDouble(intermediateNumber);

                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }
                panel.setText(result + "");
                isOperation = true;
                break;
        }
    }
}