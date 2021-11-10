package com.company;

import com.company.bazine.TransportasImpl;
import com.company.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {
        //Tėvo objektai
        TransportasImpl transportas1 = new TransportasImpl("Sausumos",true,2009);
        TransportasImpl transportas2 = new TransportasImpl("Vandens",true,1998);
        TransportasImpl transportas3 = new TransportasImpl("Vandens",false,2005);
        TransportasImpl transportas4 = new TransportasImpl("Oro",true,2015);
        TransportasImpl transportas5 = new TransportasImpl("Sausumos",false,2018);

        //Vaiko objektai
        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos",true,2011,"Opel",2,false);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("Sausumos",true,2004,"Renault",4,true);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("Sausumos",true,1996,"Volvo",4,false);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Sausumos",true,2017,"Opel",4,true);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("Sausumos",true,2010,"Mercedes-Benz",2,true);

        //Sukeliami visi objektai į sarašą
        TransportasImpl[] transportas = new TransportasImpl[10];
        transportas[0] = transportas1;
        transportas[1] = transportas2;
        transportas[2] = transportas3;
        transportas[3] = transportas4;
        transportas[4] = transportas5;
        transportas[5] = automobilis1;
        transportas[6] = automobilis2;
        transportas[7] = automobilis3;
        transportas[8] = automobilis4;
        transportas[9] = automobilis5;

        //Ciklas patikrinimui ar tai yra automobilis ir ar jis varomas elektra, jei taip tai išvedami objekto duomenys
        for (TransportasImpl x : transportas) {
            if (x instanceof AutomobilisImpl&&((AutomobilisImpl) x).getVaromasElektra()==true) {
                System.out.println(x.getTipas() + " " + ((AutomobilisImpl) x).getMarke());
                //x.toString();
            }
        }
    }
}
