package com.abdelazim.x.realestateinvest.home;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abdelazim.x.realestateinvest.R;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements OffersListAdapter.OnListItemClickListener {

    private TextView favoritesTextView;
    private RecyclerView offersRecyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
    }

    private void initViews(View view) {

        favoritesTextView = view.findViewById(R.id.favorites_textView);
        offersRecyclerView = view.findViewById(R.id.offers_recyclerView);

        offersRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        offersRecyclerView.setHasFixedSize(true);
        offersRecyclerView.setAdapter(new OffersListAdapter(this));

        favoritesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.toFavoritesFragment);
            }
        });
    }

    @Override
    public void onListItemClick(View view) {
        Navigation.findNavController(view).navigate(R.id.toApartmentDetailsFragment);
    }
}
