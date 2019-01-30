package com.abdelazim.x.realestateinvest.apartment_details;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.realestateinvest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApartmentDetailsFragment extends Fragment {


    public ApartmentDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_apartment_details, container, false);
    }

}
