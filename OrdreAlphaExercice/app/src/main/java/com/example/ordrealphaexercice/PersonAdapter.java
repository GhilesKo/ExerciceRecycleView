package com.example.ordrealphaexercice;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    public List<Person> list;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
       public TextView tvNom;
       public ImageView descend;
        public ImageView monte;

        public ViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            // Define click listener for the ViewHolder's View

            tvNom = linearLayout.findViewById(R.id.tvNom);
            descend = linearLayout.findViewById(R.id.tvDescend);
            monte = linearLayout.findViewById(R.id.tvMonte);


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
    public PersonAdapter() {
      list = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.person_item, viewGroup, false);

        return new ViewHolder(linearLayout);

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        viewHolder.tvNom.setText(list.get(position).nom);
        viewHolder.descend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomProchain;
                nomProchain = list.get(position + 1).nom;
                if (position<list.size()-1&& position>0) {
                    list.get(position).nom = nomProchain;

                }
            }
        });


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return list.size();
    }
}


