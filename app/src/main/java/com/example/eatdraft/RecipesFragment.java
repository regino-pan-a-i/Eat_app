package com.example.eatdraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.eatdraft.databinding.MealPlanningBinding;
import com.example.eatdraft.databinding.RecipesFragmentBinding;

import java.util.ArrayList;

public class RecipesFragment extends Fragment {
    private RecipesFragmentBinding binding;
    private static ListView listView;
    private static ArrayList<String> items;
    private static ListViewAdapter adapter;
    EditText input;
    ImageView enter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = RecipesFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.navPlanningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(RecipesFragment.this)
                        .navigate(R.id.action_RecipesFragment_to_MealPlanningFragment);
            }
        });

        binding.navHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(RecipesFragment.this)
                        .navigate(R.id.action_RecipesFragment_to_FirstFragment);
            }
        });

        binding.navScanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(RecipesFragment.this)
                        .navigate(R.id.action_RecipesFragment_to_ScanFragment);
            }
        });

        binding.navSavedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(RecipesFragment.this)
                        .navigate(R.id.action_RecipesFragment_to_SavedFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
