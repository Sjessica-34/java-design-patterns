package fr.diginamic.strategy;

public class StrategyFactory {

    public static Strategy getInstanceTri(TypeTri type){
        switch (type) {
            case BUBBLE_SORT:
                return new BubbleSort();
            case INSERTION_SORT:
                return new InsertionSort();
            case SELECTION_SORT:
                return new SelectionSort();
            default:
                return null;
        }
    }
}
