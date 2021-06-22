//package fr.diginamic.builder.tests;
//
//import fr.diginamic.builder.Dauphin;
//import fr.diginamic.builder.Lion;
//import fr.diginamic.builder.builder.ZooBuilder;
//
//public class ZooBuilderTest {
//
//    public class ZooBuilderTest {
//
//        public static void main(String[] args) {
//            ZooBuilder builder = new ZooBuilder("Zoo");
//
//            ZooBuilder zoo = null;
//            try {
//                zoo = builder.appendZone("Savane", 2)
//                        .appendZone("Jungle",2)
//                        .appendAnimal("Savane",new Lion("Lion"))
//                        .appendAnimal("Savane",new Lion("Hyène"))
//                        .appendAnimal("Mer",new Dauphin("Dauphin"))
//                        .appendAnimal("Mer",new Dauphin("Requin"));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(zoo.get());
//
//
//        }
//    }
//}
