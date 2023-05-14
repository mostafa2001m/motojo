package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication2.databinding.FragmentMainMenuBinding;


public class MainMenuFragment extends Fragment {
    private FragmentMainMenuBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainMenuBinding.inflate(getLayoutInflater());
        setOnCleck();
        return binding.getRoot();
    }

    private void setOnCleck() {
        binding.fbtnAddPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.mainMenuFragment);

            }
        });

    }
}