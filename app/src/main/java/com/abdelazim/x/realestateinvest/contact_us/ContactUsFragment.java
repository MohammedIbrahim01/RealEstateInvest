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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.abdelazim.x.realestateinvest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {
    Button btnCallUs, btnEmailUs;
    EditText txtName,txtPhoneNumber;

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
        txtName = view.findViewById(R.id.txtName);
        txtPhoneNumber = view.findViewById(R.id.txtPhoneNumber);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btnEmailUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtName.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "لا تنس كتابة اسمك", Toast.LENGTH_SHORT).show();
                    return;
                }else if (txtPhoneNumber.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "لا تنس كتابة رقمك", Toast.LENGTH_SHORT).show();
                    return;
                }else
                Toast.makeText(getContext(), txtName.getText().toString() + " "
                        +"wait call from Us on this Number \n"+txtPhoneNumber.getText().toString(),
                        Toast.LENGTH_SHORT).show();
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
