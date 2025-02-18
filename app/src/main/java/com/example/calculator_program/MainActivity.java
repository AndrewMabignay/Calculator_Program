package com.example.calculator_program;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private double sum = 0, total = 0;
    private int operator = 0;

    private EditText input;

    // INPUTS 0 TO 9
    private Button zero, one, two, three, four, five, six, seven, eight, nine;

    // OPERATORS
    private Button plus, minus, times, divide, equal;

    // ADDITIONAL
    private TextView summation;
    private Button dot, squareRoot, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // USER INPUT
        input = (EditText) findViewById(R.id.Input);

        // BUTTONS [FROM CALCULATOR]
        zero = (Button) findViewById(R.id.Zero);
        one = (Button) findViewById(R.id.One);
        two = (Button) findViewById(R.id.Two);
        three = (Button) findViewById(R.id.Three);
        four = (Button) findViewById(R.id.Four);
        five = (Button) findViewById(R.id.Five);
        six = (Button) findViewById(R.id.Six);
        seven = (Button) findViewById(R.id.Seven);
        eight = (Button) findViewById(R.id.Eight);
        nine = (Button) findViewById(R.id.Nine);

        // BUTTON OPERATORS
        plus = (Button) findViewById(R.id.Addition);
        minus = (Button) findViewById(R.id.Subtraction);
        times = (Button) findViewById(R.id.Multiply);
        divide = (Button) findViewById(R.id.Division);
        equal = (Button) findViewById(R.id.Equal);

        // ADDITIONAL
        summation = (TextView) findViewById(R.id.Summation);
        dot = (Button) findViewById(R.id.Dot);
        squareRoot = (Button) findViewById(R.id.SquareRoot);
        clear = (Button) findViewById(R.id.Clear);

        Interaction();
    }

    @SuppressLint("SetTextI18n")
    private void Interaction() {

        dot.setOnClickListener(e -> {
            input.setText(input.getText().toString() + ".");
        });

        zero.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "0");
        });

        one.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "1");
        });

        two.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "2");
        });

        three.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "3");
        });

        four.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "4");
        });

        five.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "5");
        });

        six.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "6");
        });

        seven.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "7");
        });

        eight.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "8");
        });

        nine.setOnClickListener(e -> {
            input.setText(input.getText().toString() + "9");
        });

        // INTERACTION | OPERATIONS ________________________________
        plus.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                return;
            }

            switch (operator) {
                case 1:
                    sum += Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 2:
                    sum -= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 3:
                    sum *= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 4:
                    sum /= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                default:
                    sum = Double.parseDouble(input.getText().toString());
            }

            operator = 1;
            input.setText("");
            summation.setText(String.valueOf(sum));
        });

        minus.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                input.setText("-");
                return;
            }

            if (input.getText().toString().equals("-")) {
                return;
            }

            switch (operator) {
                case 1:
                    sum += Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 2:
                    sum -= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 3:
                    sum *= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 4:
                    sum /= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                default:
                    sum = Double.parseDouble(input.getText().toString());
            }

            operator = 2;
            input.setText("");
            summation.setText(String.valueOf(sum));
        });

        times.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                return;
            }

            switch (operator) {
                case 1:
                    sum += Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 2:
                    sum -= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 3:
                    sum *= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 4:
                    sum /= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                default:
                    sum = Double.parseDouble(input.getText().toString());
            }

            operator = 3;
            input.setText("");
            summation.setText(String.valueOf(sum));
        });

        divide.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                return;
            }

            switch (operator) {
                case 1:
                    sum += Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 2:
                    sum -= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 3:
                    sum *= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                case 4:
                    sum /= Double.parseDouble(input.getText().toString());
                    Log.d("Operasyon LoL", String.valueOf(sum));
                    break;
                default:
                    sum = Double.parseDouble(input.getText().toString());
            }

            operator = 4;
            input.setText("");
            summation.setText(String.valueOf(sum));
        });

        equal.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                return;
            }

            switch (operator) {
                case 1:
                    sum += Double.parseDouble(input.getText().toString());
                    break;
                case 2:
                    sum -= Double.parseDouble(input.getText().toString());
                    break;
                case 3:
                    sum *= Double.parseDouble(input.getText().toString());
                    break;
                case 4:
                    sum /= Double.parseDouble(input.getText().toString());
                    break;
                default:
                    sum = Double.parseDouble(input.getText().toString());
            }

            summation.setText(String.valueOf(sum)); // Bug Testing

            total = sum;
            input.setText(String.valueOf(total));

            sum = 0;
            operator = 0;
            total = 0;
        });

        // ADDITIONAL
        squareRoot.setOnClickListener(e -> {
            if (input.getText().toString().isEmpty()) {
                return;
            }

            sum = Double.parseDouble(input.getText().toString());
            sum = Math.sqrt(sum);

            summation.setText(String.valueOf(sum));
            input.setText(String.valueOf(sum));
        });

        clear.setOnClickListener(e -> {
            sum = 0;
            total = 0;
            operator = 0;

            summation.setText("");
            input.setText("");
        });


    }
}