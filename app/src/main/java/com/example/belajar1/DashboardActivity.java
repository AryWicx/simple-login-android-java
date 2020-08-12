package com.example.belajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    String uname, pwd;
    TextView tvUsername, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
        action();
    }

    private void init() {
        tvUsername = findViewById(R.id.tvUsername);
        tvPassword = findViewById(R.id.tvPassword);

    }

    private void action() {
        Intent intent = getIntent();
        uname = intent.getStringExtra("username");
        pwd = intent.getStringExtra("password");
        tvUsername.setText(uname);
        tvPassword.setText(pwd);

        Toast.makeText(getApplicationContext(), "Welcome Back "+ uname, Toast.LENGTH_LONG).show();
    }

}