package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<IElement> elements = new ArrayList<>();

    @Override
    public double calculerSalaire() {
        double salaire = 0.0;
        for (IElement element :
                elements) {
            salaire += element.calculerSalaire();
        }
        return salaire;
    }

//<----------------------------------> autre boucle (dimitri)

    //for(int i=0; i<elements.size();i++){
    //sommes = sommes + elements.get(i)
    //}
    //return sommes
    //}
//<------------------------> Constructeurs

    public Service() {
    }

    public Service(String nom) {
        this.nom = nom;
    }

//<--------------------------------> getter/setter


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

//<-------------------------------> add/remove

    public void addElement(IElement element) {
        elements.add(element);
    }
}