package com.abdelazim.x.realestateinvest.favorites;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.realestateinvest.R;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment implements FavoritesAdapter.OnListItemClickListener {

    private RecyclerView favoritesRecyclerView;

    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorites, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
    }

    private void initViews(View view) {

        favoritesRecyclerView = view.findViewById(R.id.favorites_recyclerView);
        favoritesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        favoritesRecyclerView.setHasFixedSize(true);
        favoritesRecyclerView.setAdapter(new FavoritesAdapter(this));
    }

    @Override
    public void onListItemClick(View view) {

        Navigation.findNavController(view).navigate(R.id.toApartmentDetailsFragment);
    }
}
