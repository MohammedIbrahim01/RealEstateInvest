package com.abdelazim.x.realestateinvest.contact_us;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.abdelazim.x.realestateinvest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {
    Button btnCallUs, btnEmailUs;

    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_contact_us, container, false);
        btnCallUs = view.findViewById(R.id.btnCallUs);
        btnEmailUs = view.findViewById(R.id.btnEmailUs);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btnEmailUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "abdelaziz.elantaky@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "drop apartment code here");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "kindly arrange meeting for me to discuss about this apartment");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

            }
        });
        btnCallUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent();
                dialIntent.setAction(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:0109996126"));
                startActivity(dialIntent);
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

}
