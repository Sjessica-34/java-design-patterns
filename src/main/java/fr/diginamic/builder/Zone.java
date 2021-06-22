package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nom;
    private Integer capacite;
    private List<Animal> animalList = new ArrayList<>();

    public Zone() {
    }

    public Zone(String nom, Integer capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    public Zone(String nom, Integer capacite, List<Animal> animalList) {
        this.nom = nom;
        this.capacite = capacite;
        this.animalList = animalList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void addAnimal(Animal animal){
        this.animalList.add(animal);
    }

    @Override
    public String toString() {
        return "Zone{" +
                "nom='" + nom + '\'' +
                ", capacite=" + capacite +
                ", animalList=" + animalList +
                '}';
    }
}