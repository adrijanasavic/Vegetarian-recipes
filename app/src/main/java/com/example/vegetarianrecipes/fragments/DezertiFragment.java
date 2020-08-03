package com.example.vegetarianrecipes.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.adapters.DezertiAdapter;
import com.example.vegetarianrecipes.objects.Dezerti;

import java.util.ArrayList;
import java.util.List;


public class DezertiFragment extends Fragment {

    private List<Dezerti> dezerti;

    private static final int DEZERTI = 4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_item, container, false );

        getActivity().setTitle( getString( R.string.dezerti ) );

        RecyclerView recyclerView = rootView.findViewById( R.id.recyclerview );
        int numberOfColumns = 2;
        GridLayoutManager layoutManager = new GridLayoutManager( getActivity(), numberOfColumns );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( layoutManager );

        dezerti = new ArrayList<>();

        addFoods();

        recyclerView.setAdapter( new DezertiAdapter( getActivity(), dezerti, DEZERTI ) );
        return rootView;
    }

    private void addFoods() {
        dezerti.add( new Dezerti( R.drawable.vege,
                getString( R.string.dezert1 ),

                getString( R.string.dezert1_opis ),
                getString( R.string.dezert1_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert2 ),
                getString( R.string.dezert2_opis ),
                getString( R.string.dezert2_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert3 ),
                getString( R.string.dezert3_opis ),
                getString( R.string.dezert3_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert4 ),
                getString( R.string.dezert4_opis ),
                getString( R.string.dezert4_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert5 ),
                getString( R.string.dezert5_opis ),
                getString( R.string.dezert5_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert6 ),
                getString( R.string.dezert6_opis ),
                getString( R.string.dezert6_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert7 ),
                getString( R.string.dezert7_opis ),
                getString( R.string.dezert7_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert8 ),
                getString( R.string.dezert8_opis ),
                getString( R.string.dezert8_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,
                getString( R.string.dezert9 ),
                getString( R.string.dezert9_opis ),
                getString( R.string.dezert9_opis_detalji ) ) );
        dezerti.add( new Dezerti( R.drawable.vege,

                getString( R.string.dezert10 ),
                getString( R.string.dezert10_opis ),
                getString( R.string.dezert10_opis_detalji ) ) );

    }
}
