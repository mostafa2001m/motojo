package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication2.databinding.FragmentNewBinding;

public class NewFragment extends Fragment {
    private FragmentNewBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNewBinding.inflate(getLayoutInflater());
        clickLogin();
        clickSignUp();
        return binding.getRoot();
    }

    private void clickSignUp() {
        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.signupFragment);

            }
        });
    }

    private void clickLogin() {
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.mainMenuFragment);

            }
        });
    }

}