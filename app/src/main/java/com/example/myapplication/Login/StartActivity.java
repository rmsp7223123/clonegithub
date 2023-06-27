package com.example.myapplication.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

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