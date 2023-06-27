package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        FragmentManager manager = getSupportFragmentManager();
        binding.container.removeAllViews(); // 홈에 있는 메뉴가 Fragment 가 아니여서 임시로 해둠 2023-06-27.
        manager.beginTransaction().replace(R.id.container, new ProfileFragment()).commit();

        binding.btmMenu.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.menu4){
                fragment = new ProfileFragment();

            }

            return true;
        });



        Window window =getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.TRANSPARENT);
        View view = getWindow().getDecorView();
        view.setSystemUiVisibility(view.getSystemUiVisibility() & ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


    }
}