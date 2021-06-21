package fr.diginamic.builder;

public class Zone {

    private String nom;
    private int capacity;

    // constructeurs

    public Zone() {
    }

    public Zone(String nom, int capacity) {
        this.nom = nom;
        this.capacity = capacity;
    }


    // getter/setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
