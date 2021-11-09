package com.company.bazine;

public class TransportasImpl implements Transportas{
    private String tipas;
    private Boolean variklis;
    private int pagaminimoMetai;

    public TransportasImpl(String tipas, Boolean variklis, int pagaminimoMetai){
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    @Override
    public String getTipas() {
        return this.tipas;
    }

    @Override
    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    @Override
    public Boolean getVariklis() {
        return this.variklis;
    }

    @Override
    public void setVariklis(Boolean variklis) {
        this.variklis = variklis;
    }

    @Override
    public int getPagaminimoMetai() {
        return this.pagaminimoMetai;
    }

    @Override
    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }
}
