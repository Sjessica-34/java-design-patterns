package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Zone> zones = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(String nom) {
        this.nom = nom;
    }

    public Zoo(String nom, List<Zone> zones) {
        this.nom = nom;
        this.zones = zones;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Zone> getZone() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public void addZone(Zone zone) {
        this.zones.add(zone);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nom='" + nom + '\'' +
                ", zones=" + zones +
                '}';
    }
}