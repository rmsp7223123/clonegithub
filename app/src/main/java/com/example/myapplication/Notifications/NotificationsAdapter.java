package com.example.myapplication.Notifications;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.databinding.ItemNotificationsBinding;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {
    ItemNotificationsBinding binding;
    Context context;

    public NotificationsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemNotificationsBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.noLnItem.getContext();

        h.binding.noLnItem.setOnClickListener(v -> {
            Intent intent = new Intent(context, NotificationsDetailActivity.class);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemNotificationsBinding binding;

        public ViewHolder(ItemNotificationsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
