package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.myapplication.Explore.ExploreFragment;
import com.example.myapplication.Home.HomeFragment;
import com.example.myapplication.Notifications.NotificationsFragment;
import com.example.myapplication.databinding.ActivityMainBinding;

import com.example.myapplication.Notifications.NotificationsFragment;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new HideActionBar().hideActionBar(this);

        // 메인 액티비티 기본 화면 Home
        manager.beginTransaction().replace(R.id.container_linear, new HomeFragment()).commit();


        // 네비바 클릭시 프래그먼트 전환
        binding.bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId() == R.id.home) {
                fragment = new HomeFragment();
            } else if (item.getItemId() == R.id.notifications) {
                fragment = new NotificationsFragment();
            } else if (item.getItemId() == R.id.explore) {
                fragment = new ExploreFragment();
            } else if (item.getItemId() == R.id.profile) {
                fragment = new ProfileFragment();
            } else {
                return false;
            }
            if (fragment == null) {
                Toast.makeText(this, "빈공간", Toast.LENGTH_SHORT).show();
            } else {
                manager.beginTransaction().replace(R.id.container_linear, fragment).commit();
            }
            return true;
        });


    }

    public void changeFrag(Fragment fragment){
        manager.beginTransaction().replace(R.id.container_linear, fragment).commit();
    }

}