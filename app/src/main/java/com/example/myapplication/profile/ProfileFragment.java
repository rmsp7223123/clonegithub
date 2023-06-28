package com.example.myapplication.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentProfileBinding;
import com.example.myapplication.databinding.ItemProfileMenuRecvBinding;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        binding.recvMenu.setAdapter(new ProfileRecv1Adapter(list()));
        binding.recvMenu.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recvRepositories.setAdapter(new ProfileRecv2Adapter(llist()));
        binding.recvRepositories.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        return binding.getRoot();
    }

    public ArrayList<ProfileDTO> list(){
        ArrayList<ProfileDTO> list = new ArrayList<>();
        list.add(new ProfileDTO(R.drawable.pr_menu_ic1,"Repositories","22"));
        list.add(new ProfileDTO(R.drawable.pr_menu_ic2,"Starred","0"));
        list.add(new ProfileDTO(R.drawable.pr_menu_ic3,"Oraganizations","0"));
        return list;
    }

    public ArrayList<Profile2DTO> llist(){
        ArrayList<Profile2DTO> list = new ArrayList<>();
        list.add(new Profile2DTO("day5","day5 깃헙 연동예제", "10"));
        list.add(new Profile2DTO("java","day5 자바 연동예제", "23"));
        list.add(new Profile2DTO("android","day5 안드 연동예제", "0"));
        list.add(new Profile2DTO("html","day5 뷰 연동예제", "67"));
        list.add(new Profile2DTO("hanul","day5 한울 연동예제", "55"));
        list.add(new Profile2DTO("day7","day7 연동예제", "2"));

        return list;
    }
}