/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @version 1.0
 * @see #getIndexOfMin(int[])
 * @see #getIndexOfMax(int[])
 * @see #makeCastling(int[])
 */
public class Castling {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 21);
        }
        System.out.print("The array befor the castling: ");
        for (int value : array) {
            System.out.print(value + "; ");
        }
        makeCastling(array);
        System.out.print("\nThe array after the castling: ");
        for (int value : array) {
            System.out.print(value + "; ");
        }
    }

    /**
     * Method for getting index of the smallest number in array.
     *
     * @param array the array in which a minimal search is sought.
     * @return int value
     */
    public static int getIndexOfMin(int[] array) {
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexMin] > array[i]) indexMin = i;
        }
        return indexMin;
    }

    /**
     * Method for getting index of the biggest number in array.
     *
     * @param array the array in which a maximal search is sought.
     * @return int value
     */
    public static int getIndexOfMax(int[] array) {
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexMax] <= array[i]) indexMax = i;
        }
        return indexMax;
    }

    /**
     * The method in which the first smallest value in array changes places with the last highest value in array.
     *
     * @param array the array where will be change.
     * @return int[] array
     */
    public static int[] makeCastling(int[] array) {
        int a = array[getIndexOfMin(array)];
        array[getIndexOfMin(array)] = array[getIndexOfMax(array)];
        array[getIndexOfMax(array)] = a;
        return array;
    }
}
