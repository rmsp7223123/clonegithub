package com.example.myapplication.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.myapplication.HideActionBar;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityRegisterBinding;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    public static ArrayList<AccountDTO> list = new ArrayList<>();

    ActivityRegisterBinding binding;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new HideActionBar().hideActionBar(this);
        binding.btnCancel.setOnClickListener(v -> {
            finish();
        });
        binding.btnCommit.setOnClickListener(v -> {
            intent = new Intent(RegisterActivity.this, StartActivity.class);
            String userid = binding.edtId.getText().toString();

            boolean isDuplicate = false;
            for (int i = 0; i < list.size(); i++) {
                AccountDTO account = list.get(i);
                if(account.getUser_id().equals(userid)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate && binding.edtPw.getText().toString().equals(binding.edtPwcheck.getText().toString())){
                list.add(new AccountDTO(userid, binding.edtPw.getText().toString(),
                        binding.edtName.getText().toString(), binding.edtEmail.getText().toString()));
                Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            } else if (!binding.edtPw.getText().toString().equals(binding.edtPwcheck.getText().toString())){
                Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "중복된 id입니다.", Toast.LENGTH_SHORT).show();
            }

        });
    }
}