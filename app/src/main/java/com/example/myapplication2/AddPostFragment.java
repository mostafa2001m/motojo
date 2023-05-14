package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication2.databinding.FragmentAddPostBinding;


public class AddPostFragment extends Fragment {
    private FragmentAddPostBinding binding;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAddPostBinding.inflate(getLayoutInflater());
        setOnCleck();
        return binding.getRoot();

    }

    private void setOnCleck() {
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.mainMenuFragment);

            }
        });
    }
}