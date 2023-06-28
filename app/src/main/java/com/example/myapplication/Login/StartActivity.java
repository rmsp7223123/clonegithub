package com.example.myapplication.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.myapplication.HideActionBar;
import com.example.myapplication.MainActivity;
import com.example.myapplication.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {

    ActivityStartBinding binding;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new HideActionBar().hideActionBar(this);
        binding.btnCreateAccount.setOnClickListener(v -> {
            intent = new Intent(StartActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
        binding.btnLogin.setOnClickListener(v -> {
            intent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}