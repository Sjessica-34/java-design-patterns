package fr.diginamic.strategy;

public class Tri {

    public void exec(int typeTri, Integer[] array) {

        // Bubble sort algorithm
        if (typeTri == 1) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        // insertion sort algorithm
        else if (typeTri == 2) {
            for (int k = 1; k < array.length - 1; k++) {
                int temp = array[k];
                int j = k - 1;
                while (j >= 0 && temp <= array[j]) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = temp;
            }
        } else if (typeTri == 3) {
            for (int i = 0; i < array.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[index]) {
                        index = j;//searching for lowest index
                    }
                }
                int smallerNumber = array[index];
                array[index] = array[i];
                array[i] = smallerNumber;
            }
        }
    }

    public void exec(TypeTri typeTri, Integer[] arr) {
        switch (typeTri) {
            case BUBBLE_SORT:
                Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.BUBBLE_SORT);
                bubble.trier(arr);
            case INSERTION_SORT:
                Strategy insertion = StrategyFactory.getInstanceTri(TypeTri.INSERTION_SORT);
                insertion.trier(arr);
            case SELECTION_SORT:
                Strategy selection = StrategyFactory.getInstanceTri(TypeTri.SELECTION_SORT);
                selection.trier(arr);
        }
    }
}