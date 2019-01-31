package com.abdelazim.x.realestateinvest.apartment_details;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.abdelazim.x.realestateinvest.R;
import com.abdelazim.x.realestateinvest.contact_us.ContactUsFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApartmentDetailsFragment extends Fragment {

    Button favourite,call;

    public ApartmentDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        calling();
        handling();
        return inflater.inflate(R.layout.fragment_apartment_details, container, false);



    }

    public void calling(){
        favourite=getActivity().findViewById(R.id.favourite);
        call=getActivity().findViewById(R.id.call);


    }

    public void handling(){

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ContactUsFragment.class));
            }
        });


    }

}
