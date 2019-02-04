package com.abdelazim.x.realestateinvest.apartment_details;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.abdelazim.x.realestateinvest.R;
import com.abdelazim.x.realestateinvest.contact_us.ContactUsFragment;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApartmentDetailsFragment extends Fragment {

    Button call;
    ImageButton favourite;

    public ApartmentDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_apartment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        calling(view);
        handling();
    }

    public void calling(View view) {
        favourite = view.findViewById(R.id.favourite);
        call = view.findViewById(R.id.call);


    }

    public void handling() {

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.toContactUsFragment);
            }
        });


    }

}
