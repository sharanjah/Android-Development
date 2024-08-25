package com.example.calculatorv3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void addition(View v) {
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText n3 = (EditText) findViewById(R.id.editTextNumber3);

        // Check if fields are not empty
        if (!n1.getText().toString().isEmpty() && !n2.getText().toString().isEmpty()) {
            try {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 + num2;
                n3.setText(String.valueOf(result));  // Convert result to String
            } catch (NumberFormatException e) {
                n3.setText("Error");  // Handle the case where parsing fails
            }
        } else {
            n3.setText("Enter numbers");
        }


    }

    public void Substraction(View v) {
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText n3 = (EditText) findViewById(R.id.editTextNumber3);

        // Check if fields are not empty
        if (!n1.getText().toString().isEmpty() && !n2.getText().toString().isEmpty()) {
            try {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 - num2;
                n3.setText(String.valueOf(result));  // Convert result to String
            } catch (NumberFormatException e) {
                n3.setText("Error");  // Handle the case where parsing fails
            }
        } else {
            n3.setText("Enter numbers");
        }
    }

    public void Multiplication(View v) {
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText n3 = (EditText) findViewById(R.id.editTextNumber3);

        // Check if fields are not empty
        if (!n1.getText().toString().isEmpty() && !n2.getText().toString().isEmpty()) {
            try {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 * num2;
                n3.setText(String.valueOf(result));  // Convert result to String
            } catch (NumberFormatException e) {
                n3.setText("Error");  // Handle the case where parsing fails
            }
        } else {
            n3.setText("Enter numbers");
        }
    }
    public void Division(View v) {
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText n3 = (EditText) findViewById(R.id.editTextNumber3);

        // Check if fields are not empty
        if (!n1.getText().toString().isEmpty() && !n2.getText().toString().isEmpty()) {
            try {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 / num2;
                n3.setText(String.valueOf(result));  // Convert result to String
            } catch (NumberFormatException e) {
                n3.setText("Error");  // Handle the case where parsing fails
            }
        } else {
            n3.setText("Enter numbers");
        }
    }
}