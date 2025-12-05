package com.example.zadaniezaliczeniowe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

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

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);
        EditText characterAmount = findViewById(R.id.characterAmount);


        CheckBox check1 = findViewById(R.id.check1);
        CheckBox check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);


        Button generateBtn = findViewById(R.id.generateBtn);
        Button confirmBtn = findViewById(R.id.confirmBtn);

        Spinner dropdownMenu = findViewById(R.id.dropdownMenu);

        String generatedPassword = "";

        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseChars = lowerCaseChars.toUpperCase();
        String numbers = "1234567890";
        String specialChars = "!@#$%^&*()_+-=.";

//        GENEROWANIE HASLA

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String passwordLength = characterAmount.getText().toString();
                int finalPasswordLength = Integer.parseInt(passwordLength);

                if(finalPasswordLength == 0){
                    Toast.makeText(MainActivity.this, "Wybierz dlugość hasła!", Toast.LENGTH_SHORT);
                }
                else{

                String possibleChars = lowerCaseChars;

                if(check1.isChecked()){
                    possibleChars += upperCaseChars;
                }
                if(check2.isChecked()){
                    possibleChars += numbers;
                }
                if(check3.isChecked()){
                    possibleChars += specialChars;
                }

                    Random random = new Random();

                    for (int i = 0; i < finalPasswordLength; i++) {

                    }


            }
            }
        });


    }
}