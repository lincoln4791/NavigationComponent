package com.example.mynavigationcomponentdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EndGame extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_end_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);
        Button btnEnd = view.findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener(v -> {
            //navController.navigate(R.id.action_endGame_to_startGame2);
            NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.startGame,true).build();
            navController.navigate(R.id.action_endGame_to_startGame2,null,navOptions);

        });

    }
}