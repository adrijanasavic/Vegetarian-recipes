package com.example.vegetarianrecipes.objects;


public class Dezerti {

    private int mDezertiSlikaId;
    private String mDezertiNaziv;
    private String mDezertiNaziv1;
    private String mDezertiOpis;


    public Dezerti(int mDezertiSlikaId, String mDezertiNaziv, String mDezertiNaziv1, String mDezertiOpis) {
        this.mDezertiSlikaId = mDezertiSlikaId;
        this.mDezertiNaziv = mDezertiNaziv;
        this.mDezertiNaziv1 = mDezertiNaziv1;
        this.mDezertiOpis = mDezertiOpis;
    }


    public int getmDezertiSlikaId() {
        return mDezertiSlikaId;
    }


    public String getmDezertiNaziv() {
        return mDezertiNaziv;
    }


    public String getmDezertiOpis() {
        return mDezertiOpis;
    }


}
