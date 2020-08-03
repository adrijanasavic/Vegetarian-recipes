package com.example.vegetarianrecipes.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.objects.Dezerti;

import java.util.List;


public class DezertiAdapter extends RecyclerView.Adapter<DezertiAdapter.ViewHolder> {
    private Context mContext;
    private List<Dezerti> mDezerti;

    private int mKategorija;


    public DezertiAdapter(Context mContext, List<Dezerti> dezerti, int mCategory) {
        this.mContext = mContext;
        this.mDezerti = dezerti;
        this.mKategorija = mCategory;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.card_item_dezerti, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public int getItemCount() {
        return mDezerti.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nazivTextView;
        private CardView cardView;

        ViewHolder(View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.dezeri_slika );
            nazivTextView = itemView.findViewById( R.id.dezerti_naziv );
            cardView = itemView.findViewById( R.id.cardview_dezerti );
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Dezerti dezerti = this.mDezerti.get( position );
        Drawable drawable = ContextCompat.getDrawable( mContext, dezerti.getmDezertiSlikaId() );
        holder.imageView.setBackground( drawable );
        holder.nazivTextView.setText( dezerti.getmDezertiNaziv() );
        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        } );
    }
}
