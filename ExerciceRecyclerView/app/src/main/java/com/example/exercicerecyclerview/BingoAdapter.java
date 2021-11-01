package com.example.exercicerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BingoAdapter extends RecyclerView.Adapter<BingoAdapter.ViewHolder> {

    List<TirageBingo> listTirageBingo;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvNumeroTirage;
        private final TextView tvNumeroTire;
        private final TextView tvLettreBingo;

        public ViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            // Define click listener for the ViewHolder's View

             tvNumeroTirage = linearLayout.findViewById(R.id.tvNumeroTirage);
            tvNumeroTire = linearLayout.findViewById(R.id.tvNumeroTire);
            tvLettreBingo =  linearLayout.findViewById(R.id.tvLettreBingo);
        }

      /*  public TextView getTextView() {
            return textView;
        }*/
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public BingoAdapter() {
        listTirageBingo = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        LinearLayout view = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bingo_textview, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvNumeroTirage.setText("Tirage #"+listTirageBingo.get(position).NumeroDuTirage);
        viewHolder.tvNumeroTire.setText("Numéro tiré : "+listTirageBingo.get(position).NumeroTiré);
        viewHolder.tvLettreBingo.setText(listTirageBingo.get(position).LettreTirée);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listTirageBingo.size();
    }
}




