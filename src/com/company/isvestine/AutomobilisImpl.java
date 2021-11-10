package com.company.isvestine;

import com.company.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis{
    private String marke;
    private int duruSkaicius;
    private Boolean varomasElektra;

    public AutomobilisImpl(String tipas, Boolean variklis, int pagaminimoMetai, String marke, int duruSkaicius, Boolean varomasElektra){
        super(tipas,variklis,pagaminimoMetai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }

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

    @Override
    public String toString() {
        return "AutomobilisImpl{" +
                "marke='" + marke + '\'' +
                ", duruSkaicius=" + duruSkaicius +
                ", varomasElektra=" + varomasElektra +
                '}';
    }
}
