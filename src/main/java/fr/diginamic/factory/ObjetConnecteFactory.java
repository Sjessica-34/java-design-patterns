package fr.diginamic.factory;

public class ObjetConnecteFactory {
    public static ObjetConnecte getObjectConnecte(ObjetConnecteEnum type){
        if (type.equals(ObjetConnecteEnum.TABLETTE)) {
            return new Tablette(25);
        } else if(type.equals(ObjetConnecteEnum.ENCEINTE_CONNECTEE)){
            return new EnceinteConnectee(40);
        } else if(type.equals(ObjetConnecteEnum.TELEPHONE_PORTABLE)) {
            return new TelephonePortable(12);
        }
        return null;
    }
}