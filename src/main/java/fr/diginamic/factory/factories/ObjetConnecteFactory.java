package fr.diginamic.factory.factories;

import fr.diginamic.factory.*;

public class ObjetConnecteFactory {
    public static ObjetConnecte getObjetConnecte(ObjetConnecteEnum type){
        if (type.equals(ObjetConnecteEnum.TABLETTE)) {
            return new Tablette(25);
        } else if(type.equals(ObjetConnecteEnum.ENCEINTE_CONNECTEE)){
            return new EnceinteConnectee(40);
        } else if(type.equals(ObjetConnecteEnum.TELEPHONE_PORTABLE)) {
            return new TelephonePortable(12);
        }
        return null;
    }

     // Avec un switch

    //switch (type) {
    //case TABLETTE :
    //return newTablette(limitVolts);
    //case ENCEINTE_CONNECTEE:
    // return newEnceinteConnectee(limitVolts);
    //case TELEPHONE_PORTABLE :
    //return newTelephonePortable(limitVolts);
}