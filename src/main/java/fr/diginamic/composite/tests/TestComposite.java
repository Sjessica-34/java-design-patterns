package fr.diginamic.composite.tests;

import fr.diginamic.composite.Employe;
import fr.diginamic.composite.Service;


public class TestComposite {
    public static void main(String[] args) {

//<--------------------------------------------------->Services

        Service DSIN = new Service("DSIN");

        Service BigData = new Service("Big Data");
        DSIN.addElement(BigData);

        Service JavaDev = new Service("Java Dev");
        DSIN.addElement(JavaDev);

//<-----------------------------------------------> Employés

        Employe directeur = new Employe(10000, "RASPEY", "Cécile");
        DSIN.addElement(directeur);

        Employe architecte = new Employe(8000, "BECHKHAR", "Bilel");
        DSIN.addElement(architecte);

        Employe chefDeProjet = new Employe(7500, "RANMEY", "JB");
        BigData.addElement(chefDeProjet);

        Employe concepteur = new Employe(3500, "PINTUR", "Eloi");
        BigData.addElement(concepteur);

        Employe chefDeService = new Employe(7500, "GUINEAU", "Kevin");
        JavaDev.addElement(chefDeService);

        Employe leadDev = new Employe(3500, "MARTIN", "Paul");
        JavaDev.addElement(leadDev);

//<-------------------------------------------> Affichage

        System.out.println("Salaire global du service DSIN: " + DSIN.calculerSalaire());
        System.out.println("Salaire global du service Big Data: " + BigData.calculerSalaire());
        System.out.println("Salaire global du service Java Dev: " + JavaDev.calculerSalaire());
    }

//<------------------------------------> Corrigé

    //service dsin = new Service ("DSIN");
    //dsin.getElements().add(new Employe ("","",10000));
   // dsin.getElements().add(new Employe ("","",8000));

    //service javaDev = new Service ("DSIN");
    //javaDev.getElements().add(new Employe ("","",7500));
    // javaDev.getElements().add(new Employe ("","",3500));

    //service bigData = new Service ("DSIN");
    //bigData.getElements().add(new Employe ("","",7500));
    // bigData.getElements().add(new Employe ("","",3500));
    //dsin.getElements().add(bigData);
    //dsin.getElements().add(javaDev);

    //double salaire = dsin.calculerSalaire();
    //Syso(salaire)
}


