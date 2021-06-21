package fr.diginamic.factory;

public class FactoryTest {
    public static void main(String[] args) {
        ObjetConnecte obj1 = ObjetConnecteFactory.getObjectConnecte(ObjetConnecteEnum.ENCEINTE_CONNECTEE);
        System.out.println(obj1);
        ObjetConnecte obj2 = ObjetConnecteFactory.getObjectConnecte(ObjetConnecteEnum.TABLETTE);
        System.out.println(obj2);
        ObjetConnecte obj3 = ObjetConnecteFactory.getObjectConnecte(ObjetConnecteEnum.TELEPHONE_PORTABLE);
        System.out.println(obj3);
    }
}