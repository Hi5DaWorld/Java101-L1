package com.example.android101l2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    static double calculate (double a, int b)
    {
        double result = a;
        for (int i = 1; i < b; i++)
        {
            result = result * a;
        }
        return result;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button AddBtn = (Button) findViewById(R.id.AddBtn);

        AddBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double b = Integer.parseInt(Imput2.getText().toString());
                double result = a+b;
                resultTextView.setText("Answer: "+result);

            }
        });


        Button SubBtn = (Button) findViewById(R.id.SubBtn);

        SubBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double b = Integer.parseInt(Imput2.getText().toString());
                double result = a-b;
                resultTextView.setText("Answer: "+result);

            }
        });


        Button MulBtn = (Button) findViewById(R.id.MulBtn);

        MulBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double b = Integer.parseInt(Imput2.getText().toString());
                double result = a*b;
                resultTextView.setText("Answer: "+result);

            }
        });


        Button DivBtn = (Button) findViewById(R.id.DivBtn);

        DivBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double b = Integer.parseInt(Imput2.getText().toString());
                double result = a/b;
                resultTextView.setText("Answer: "+result);

            }
        });


        Button PowBtn = (Button) findViewById(R.id.PowBtn);

        PowBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double b = Integer.parseInt(Imput2.getText().toString());
                double result = calculate (a, (int)b);
                resultTextView.setText("Answer: "+result);

            }
        });


        Button RooBtn = (Button) findViewById(R.id.RooBtn);

        RooBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Imput1 = (EditText) findViewById(R.id.Imput1);
                EditText Imput2 = (EditText) findViewById(R.id.Imput2);
                TextView resultTextView = (TextView) findViewById (R.id.TextView);

                double a = Integer.parseInt(Imput1.getText().toString());
                double result = Math.sqrt(a);
                resultTextView.setText("Answer: "+result);

            }
        });






    }
}
