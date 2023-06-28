package com.example.myapplication.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Login.AccountDTO;
import com.example.myapplication.databinding.ItemProfileMenuRecvBinding;

import java.util.ArrayList;

public class ProfileRecv1Adapter extends RecyclerView.Adapter<ProfileRecv1Adapter.ViewHolder> {

    ItemProfileMenuRecvBinding binding;
    ArrayList<ProfileDTO> list;


    public ProfileRecv1Adapter(ArrayList<ProfileDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemProfileMenuRecvBinding.inflate(inflater, parent, false );
        return new ProfileRecv1Adapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.prMenuImg.setImageResource(list.get(i).getImg());
        h.binding.prMenuName.setText(list.get(i).getName());
        h.binding.prMenuCnt.setText(list.get(i).getNum());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemProfileMenuRecvBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public ViewHolder(ItemProfileMenuRecvBinding binding) {
            super(binding.getRoot());
            this.binding =binding;
        }
    }
}
