package com.company;

import com.company.bazine.TransportasImpl;
import com.company.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {
        TransportasImpl transportas1 = new TransportasImpl("Sausumos",true,2009);
        TransportasImpl transportas2 = new TransportasImpl("Vandens",true,1998);
        TransportasImpl transportas3 = new TransportasImpl("Vandens",false,2005);
        TransportasImpl transportas4 = new TransportasImpl("Oro",true,2015);
        TransportasImpl transportas5 = new TransportasImpl("Sausumos",false,2018);

        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos",true,2011,"Opel",2,false);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("Sausumos",true,2004,"Renault",4,true);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("Sausumos",true,1996,"Volvo",4,false);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Sausumos",true,2017,"Opel",4,false);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("Sausumos",true,2010,"Mercedes-Benz",2,true);

    }
}
