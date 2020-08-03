package com.example.vegetarianrecipes.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vegetarianrecipes.R;


public class InformacijeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_informacije, container, false );

        getActivity().setTitle( getString( R.string.app_name ) );

        TextView textView = rootView.findViewById( R.id.uvodni_tekst );
        Spannable span = new SpannableString( textView.getText() );
        span.setSpan( new RelativeSizeSpan( 1.8f ), 0, 54, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE );
        textView.setText( span );
        return rootView;
    }
}
