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
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new HideActionBar().hideActionBar(this);
        binding.btnCancel.setOnClickListener(v -> {
            finish();
        });
        binding.btnLogin.setOnClickListener(v -> {
            RegisterActivity.list.add(new AccountDTO("123","123","123","123"));
            intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            boolean isDuplicate = false;
            for (int i = 0; i < RegisterActivity.list.size(); i++) {
                if (binding.edtId.getText().toString().equals(RegisterActivity.list.get(i).getUser_id()) &&
                        binding.edtPw.getText().toString().equals(RegisterActivity.list.get(i).getUser_pw())) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {

            } else {
                Toast.makeText(this, "존재하지 않은 아이디이거나 비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}