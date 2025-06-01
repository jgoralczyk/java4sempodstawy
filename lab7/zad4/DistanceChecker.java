package zad4;

import java.util.Scanner;

public class DistanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj odległość (0-100): ");
            int distance = scanner.nextInt();

            if (distance > 100) {
                throw new TooFarException(distance);
            }

            System.out.println("Podana odległość: " + distance);

        } catch (TooFarException e) {
            System.err.println("Błąd: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Koniec programu");
        }
    }
}
