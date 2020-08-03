package com.example.vegetarianrecipes.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vegetarianrecipes.R;
import com.example.vegetarianrecipes.adapters.RecyclerAdapter;
import com.example.vegetarianrecipes.objects.Jela;

import java.util.ArrayList;
import java.util.List;


public class PredjelaFragment extends Fragment {

    private List<Jela> predjela;

    private static final int PREDJELA = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_item, container, false );

        getActivity().setTitle( getString( R.string.predjela ) );

        RecyclerView recyclerView = rootView.findViewById( R.id.recyclerview );
        LinearLayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( layoutManager );

        predjela = new ArrayList<>();

        addPredjela();

        recyclerView.setAdapter( new RecyclerAdapter( getActivity(), predjela, PREDJELA ) );

        return rootView;
    }

    private void addPredjela() {
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo1 ),
                getString( R.string.predjelo1_opis ),
                getString( R.string.predjelo1_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo2 ),
                getString( R.string.predjelo2_opis ),
                getString( R.string.predjelo2_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo3 ),
                getString( R.string.predjelo3_opis ),
                getString( R.string.predjelo3_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo4 ),
                getString( R.string.predjelo4_opis ),
                getString( R.string.predjelo4_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo5 ),
                getString( R.string.predjelo5_opis ),
                getString( R.string.predjelo5_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo6 ),
                getString( R.string.predjelo6_opis ),
                getString( R.string.predjelo6_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo7 ),
                getString( R.string.predjelo7_opis ),
                getString( R.string.predjelo7_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo8 ),
                getString( R.string.predjelo8_opis ),
                getString( R.string.predjelo8_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo9 ),
                getString( R.string.predjelo9_opis ),
                getString( R.string.predjelo9_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo10 ),
                getString( R.string.predjelo10_opis ),
                getString( R.string.predjelo10_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo11 ),
                getString( R.string.predjelo11_opis ),
                getString( R.string.predjelo11_opis_detalji ) ) );
        predjela.add( new Jela( R.drawable.vege,
                getString( R.string.predjelo12 ),
                getString( R.string.predjelo12_opis ),
                getString( R.string.predjelo12_opis_detalji ) ) );
    }
}