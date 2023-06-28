package com.example.myapplication.Notifications;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentNotificationsBinding;


public class NotificationsFragment extends Fragment {
    FragmentNotificationsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        binding.noReFrag.setAdapter(new NotificationsAdapter(getContext()));
        binding.noReFrag.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.noBtnBar.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com"));
            startActivity(intent);
        });

        binding.noTvLater.setOnClickListener(v -> {
            binding.noLnFrag.setVisibility(View.GONE);
        });

        return binding.getRoot();

    }

}