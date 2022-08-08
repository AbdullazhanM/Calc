package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //нажал на единицу
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.btn_clear:
                //нажал на clear
                textView.setText("0");
                first = 0;
                second = 0;
                break;
            case R.id.btn_three:

                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:

                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_five:
                //нажал на единицу
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                //нажал на двойку
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                //нажал на плюс
                //12
                first = Integer.parseInt(textView.getText().toString());
                operation = "+";
                isOperationClick = true;
                break;
            case R.id.btn_minus:

                first = Integer.parseInt(textView.getText().toString());
                operation = "-";
                isOperationClick = true;
                break;
            case R.id.btn_multiply:
                first = Integer.parseInt(textView.getText().toString());
                operation = "*";
                isOperationClick = true;
                break;
            case R.id.btn_division:
                first = Integer.parseInt(textView.getText().toString());
                operation = "/";
                isOperationClick = true;
                break;
            case R.id.btn_equal:
                switch (operation) {
                    case "+":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result = first + second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result1 = first - second;
                        textView.setText(result1.toString());
                        break;
                    case "*":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result2 = first * second;
                        textView.setText(result2.toString());
                        break;
                    case "/":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result3 = first / second;
                        textView.setText(result3.toString());
                        break;
                }
                //нажал на равно
                //21

                break;
        }

    }
}