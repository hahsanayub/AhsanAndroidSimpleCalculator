package com.androidcalculator.ahsan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1 , input2;
    Button add ,mul ,div , sub;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        add = (Button) findViewById(R.id.add);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        sub = (Button) findViewById(R.id.sub);
        answer =(TextView) findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager hideKeyBoard = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                hideKeyBoard.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(input1.getText().toString());
                    double b = Double.parseDouble(input2.getText().toString());
                    double ans=a+b;
                    answer.setText(Double.toString(ans));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager hideKeyBoard = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                hideKeyBoard.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(input1.getText().toString());
                    double b = Double.parseDouble(input2.getText().toString());
                    double ans=a-b;
                    answer.setText(Double.toString(ans));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager hideKeyBoard = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                hideKeyBoard.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(input1.getText().toString());
                    double b = Double.parseDouble(input2.getText().toString());
                    double ans=a*b;
                    answer.setText(Double.toString(ans));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager hideKeyBoard = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                hideKeyBoard.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(input1.getText().toString());
                    double b = Double.parseDouble(input2.getText().toString());
                    double ans=a/b;
                    answer.setText(Double.toString(ans));
                }
            }
        });
    }
}