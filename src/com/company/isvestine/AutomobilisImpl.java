package com.company.isvestine;

public class AutomobilisImpl implements Automobilis{
    private String marke;
    private int duruSkaicius;
    private Boolean varomasElektra;
    @Override
    public String getMarke() {
        return this.marke;
    }

    @Override
    public void setMarke(String marke) {
        this.marke = marke;
    }

    @Override
    public int getDuruSkaicius() {
        return this.duruSkaicius;
    }

    @Override
    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    @Override
    public Boolean getVaromasElektra() {
        return this.varomasElektra;
    }

    @Override
    public void setVaromasElektra(Boolean varomasElektra) {
        this.varomasElektra = varomasElektra;
    }
}
