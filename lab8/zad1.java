package lab8;

import java.util.Arrays;

public class zad1 {

    // Generyczna metoda swap
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Indeksy poza zakresem tablicy!");
        }

        // Zamiana elementów
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // calkowite
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Przed zamianą: " + Arrays.toString(intArray));

        swap(intArray, 1, 3); // zamiana
        System.out.println("Po zamianie: " + Arrays.toString(intArray));

        // Przykład z tablicą napisów
        String[] stringArray = { "A", "B", "C", "D" };
        System.out.println("\nPrzed zamianą: " + Arrays.toString(stringArray));

        swap(stringArray, 0, 2);
        System.out.println("Po zamianie: " + Arrays.toString(stringArray));

        try {
            swap(intArray, -1, 10);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("\nBłąd: " + e.getMessage());
        }
    }
}