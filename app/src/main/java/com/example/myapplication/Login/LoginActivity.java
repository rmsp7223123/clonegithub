package com.example.myapplication.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

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
        binding.btnCancel.setOnClickListener(v -> {
            finish();
        });
        binding.btnLogin.setOnClickListener(v -> {
            intent = new Intent(LoginActivity.this, MainActivity.class);
            boolean isDuplicate = false;
            for (int i = 0; i < RegisterActivity.list.size(); i++) {
                if (binding.edtId.getText().toString().equals(RegisterActivity.list.get(i).getUser_id()) &&
                        binding.edtPw.getText().toString().equals(RegisterActivity.list.get(i).getUser_pw())) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "존재하지 않은 아이디이거나 비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}