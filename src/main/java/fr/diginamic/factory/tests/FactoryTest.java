package fr.diginamic.factory.tests;

import fr.diginamic.factory.ObjetConnecte;
import fr.diginamic.factory.ObjetConnecteEnum;
import fr.diginamic.factory.factories.ObjetConnecteFactory;

public class FactoryTest {
    public static void main(String[] args) {
        ObjetConnecte obj1 = ObjetConnecteFactory.getObjetConnecte(ObjetConnecteEnum.ENCEINTE_CONNECTEE);
        System.out.println(obj1);
        ObjetConnecte obj2 = ObjetConnecteFactory.getObjetConnecte(ObjetConnecteEnum.TABLETTE);
        System.out.println(obj2);
        ObjetConnecte obj3 = ObjetConnecteFactory.getObjetConnecte(ObjetConnecteEnum.TELEPHONE_PORTABLE);
        System.out.println(obj3);
    }
}