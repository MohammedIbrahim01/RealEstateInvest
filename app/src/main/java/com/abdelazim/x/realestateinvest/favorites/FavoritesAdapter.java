package com.abdelazim.x.realestateinvest.favorites;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.realestateinvest.R;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> {

    private OnListItemClickListener onListItemClickListener;

    public interface OnListItemClickListener {
        void onListItemClick(View view);
    }

    public FavoritesAdapter(OnListItemClickListener onListItemClickListener) {
        this.onListItemClickListener = onListItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_item, viewGroup, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onListItemClickListener.onListItemClick(v);
            }
        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
