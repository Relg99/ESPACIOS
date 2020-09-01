package com.example.espacios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void login(View view) {
        EditText emailET = (EditText) findViewById(R.id.emailEditText);
        EditText passET = (EditText) findViewById(R.id.passwordEditText);

        Toast.makeText(this, emailET.getText(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, passET.getText(), Toast.LENGTH_LONG).show();
    }
}