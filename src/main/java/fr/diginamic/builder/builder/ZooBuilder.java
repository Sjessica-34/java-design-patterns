package fr.diginamic.builder.builder;

import fr.diginamic.builder.Animal;
import fr.diginamic.builder.Zone;
import fr.diginamic.builder.Zoo;

import java.util.List;

public class ZooBuilder {

    private Zoo zoo;

    // constructeurs

    public ZooBuilder() {
    }

    public ZooBuilder(String nom) {
        this.zoo = new Zoo(nom);
    }

    public void appendZone(String nom, int capacite) {
        Zone zone = new Zone(nom, capacite);
        this.zoo.getZone().add(zone);
        //zoo.getZone().add(newZone(nom,capacite));
    }


    public ZooBuilder appendAnimal(String nomZone, Animal animal) {
        List<Zone> zone = zoo.getZone();
        for (Zone zone1 :
                zone) {
            if (zone1.getNom().equals(nomZone)) {
                if (zone1.getCapacite() > zone1.getAnimalList().size()) {
                    zone1.addAnimal(animal);
                    return this;
                } else {
                    System.out.println("La zone est remplie");
                }
            }
        }
        return null;
    }



    public Zoo get() {
        return zoo;
    }

}
