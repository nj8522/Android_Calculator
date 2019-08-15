package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String text;


    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button add;
    Button subtract;
    Button divide;
    Button multiply;
    Button dot;
    Button equal;
    Button clear;

    TextView tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero     = findViewById(R.id.zero);
        one      = findViewById(R.id.one);
        two      = findViewById(R.id.two);
        three    = findViewById(R.id.three);
        four     = findViewById(R.id.four);
        five     = findViewById(R.id.five);
        six      = findViewById(R.id.six);
        seven    = findViewById(R.id.seven);
        eight    = findViewById(R.id.eight);
        nine     = findViewById(R.id.nine);
        dot      = findViewById(R.id.dot);
        add      = findViewById(R.id.add);
        subtract = findViewById(R.id.sub);
        multiply = findViewById(R.id.multiply);
        divide   = findViewById(R.id.divide);
        equal    = findViewById(R.id.equal);
        clear    = findViewById(R.id.clear);
        tx       = findViewById(R.id.textView);






    }

    public void clear(View view)
    {
        tx.setText(" ");
    }
    public void dot(View view) {

        tx.setText(".");

    }
    public void zero(View view) {

        tx.setText("0");
    }
    public void one(View view) {

        tx.setText("1");
    }
    public void two(View view) {

        tx.setText("2");
    }
    public void three(View view) {

        tx.setText("3");
    }
    public void four(View view) {

        tx.setText("4");
    }
    public void five(View view) {

        tx.setText("5");
    }
    public void six(View view) {

        tx.setText("6");
    }
    public void seven(View view) {

        tx.setText("7");
    }
    public void eight(View view) {

        tx.setText("8");
    }
    public void nine(View view) {

        tx.setText("9");
    }
    public void add(View view) {

        tx.setText("+");
    }
    public void subtract(View view) {

        tx.setText("-");
    }
    public void divide(View view) {

        tx.setText("÷");
    }
    public void multiply(View view) {

        tx.setText("x");
    }

    public void equal(View view){

        text = tx.getText().toString().trim();



        DynamicCal cal = new DynamicCal(new Processor[]{

                new Adder()
        });

        String result = cal.process(text);
        tx.setText(result);

    }


}








