package fr.diginamic.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        System.out.println(configuration.getNomBase());
        System.out.println(configuration.getUser());
        System.out.println(configuration.getPassword());
    }
}