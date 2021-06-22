package fr.diginamic.singleton;


import java.util.ResourceBundle;

//<---------------------->
//Elements de correction

//private static fianl Configuration INSTANCE = new Configuration();
//private Configuration();{
    //chargerFichier();
     //


public class Configuration {

    private String nomBase;
    private String user;
    private String password;

    private Configuration() {
        chargerFichier();
    }

    public Configuration(String nomBase, String user, String password) {
        this.nomBase = nomBase;
        this.user = user;
        this.password = password;
    }

    private void chargerFichier() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration");
        nomBase = configuration.getString("db.nom");
        user = configuration.getString("db.user");
        password = configuration.getString("db.password");
    }
// Classe chargée au moment où la méthode getInstance est unvoquée, ce qui
    //garanti la création du singleton au moment où getInstance est invoquée et
    //non au moment du lancement de l'application

        private static class SingletonHolder {
        private final static Configuration INSTANCE = new Configuration();
    }

    public static Configuration getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //<----------------------------------->

    //getter/setter

    public String getNomBase() {
        return nomBase;
    }

    public void setNomBase(String url) {
        this.nomBase = nomBase;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}




