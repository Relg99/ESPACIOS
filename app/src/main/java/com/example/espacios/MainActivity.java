package com.example.espacios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openClientActivity(View view) {
        Intent intent = new Intent(this, ClientActivity.class);

        startActivity(intent);
    }

    public void openMenuStoreActivity(View view) {
        Intent intent = new Intent(this, MenuStoreActivity.class);

        startActivity(intent);
    }
}