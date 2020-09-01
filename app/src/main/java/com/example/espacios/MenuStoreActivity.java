package com.example.espacios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_store);
    }

    public void openLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent);
    }

    public void openRegisterAccountActivity(View view) {
        Intent intent = new Intent(this, RegisterAccountActivity.class);

        startActivity(intent);
    }
}