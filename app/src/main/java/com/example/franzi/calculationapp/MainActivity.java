package com.example.franzi.calculationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultText = (TextView) findViewById(R.id.resultTextView);
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 + num2;
                resultText.setText(result+"");

            }
        });


    }
}
