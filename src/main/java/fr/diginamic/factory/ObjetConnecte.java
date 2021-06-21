package fr.diginamic.factory;

public class ObjetConnecte {

    private Integer limiteVolts;

    //----------------------------
    //constructeur

    public ObjetConnecte() {
       }

    public ObjetConnecte(Integer limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    //----------------------------
    //getter/setter

    public Integer getLimiteVolts() {
        return limiteVolts;
    }

    public void setLimiteVolts(Integer limiteVolts) {
        this.limiteVolts = limiteVolts;
    }
}