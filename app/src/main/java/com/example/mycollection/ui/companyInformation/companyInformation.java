package com.example.mycollection.ui.companyInformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mycollection.R;

public class companyInformation extends Fragment {

    private companyInformationModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = ViewModelProviders.of(this).get(companyInformationModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) { textView.setText(s);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.example.myfragments");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getActivity(), "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });


        return root;


    }
}