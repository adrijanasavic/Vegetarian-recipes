package com.example.vegetarianrecipes.objects;


public class Jela {

    private int mJelaSlikaId;
    private String mJelaNaziv;
    private String mJelaKratakOpis;
    private String mJelaOpis;


    public Jela(int mJelaSlikaId, String mJelaNaziv, String mJelaKratakOpis, String mJelaOpis) {
        this.mJelaSlikaId = mJelaSlikaId;
        this.mJelaNaziv = mJelaNaziv;
        this.mJelaKratakOpis = mJelaKratakOpis;
        this.mJelaOpis = mJelaOpis;
    }

    public int getmJelaSlikaId() {
        return mJelaSlikaId;
    }

    public String getmJelaNaziv() {
        return mJelaNaziv;
    }

    public String getmJelaKratakOpis() {
        return mJelaKratakOpis;
    }

    public String getmJelaOpis() {
        return mJelaOpis;
    }
}

