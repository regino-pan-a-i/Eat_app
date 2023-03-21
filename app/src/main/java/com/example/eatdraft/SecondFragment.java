package com.example.eatdraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.eatdraft.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

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

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        listView = view.findViewById(R.id.listView);
        items = new ArrayList<>();

        input = view.findViewById(R.id.input);
        enter = view.findViewById(R.id.add_button);


        items.add("apple");
        items.add("manzana");
        items.add("estoy cansado");
        items.add("tengo hambre");
        items.add("aiuuuuraaaa");

        adapter = new ListViewAdapter(getActivity().getApplicationContext(), items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = items.get(i);
                makeToast(name);

            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                if (text == null || text.length() == 0){
                    makeToast("Enter new item");
                } else{
                    addItem(text);
                    input.setText("");
                    makeToast("Added: " + text);
                }
            }
        });



    }

    public static void addItem(String item){
        items.add(item);
        listView.setAdapter(adapter);
    }

    public static void removeItem(int item){
        items.remove(item);
        listView.setAdapter(adapter);
    }

    Toast toast;
    public void makeToast(String string) {
        if (toast != null) toast.cancel();

        toast = Toast.makeText(getActivity().getApplicationContext(), string, Toast.LENGTH_SHORT);
        toast.show();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}