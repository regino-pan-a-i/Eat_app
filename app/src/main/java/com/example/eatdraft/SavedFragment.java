package com.example.eatdraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.eatdraft.databinding.SavedFragmentBinding;
import com.example.eatdraft.databinding.ScanFragmentBinding;

public class SavedFragment extends Fragment {
        private SavedFragmentBinding binding;

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState
    ) {

            binding = SavedFragmentBinding.inflate(inflater, container, false);
            return binding.getRoot();

        }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);


            binding.navPlanningButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(SavedFragment.this)
                            .navigate(R.id.action_SavedFragment_to_MealPlanningFragment);
                }
            });

            binding.navHomeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(SavedFragment.this)
                            .navigate(R.id.action_SavedFragment_to_FirstFragment);
                }
            });

            binding.navScanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(SavedFragment.this)
                            .navigate(R.id.action_SavedFragment_to_ScanFragment);
                }
            });

        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
}
