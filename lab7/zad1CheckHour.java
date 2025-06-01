import java.util.Scanner;

public class zad1CheckHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj godzinę (0-24): ");
            int hour = scanner.nextInt();
            System.out.println("Podana godzina: " + hour);

            if (hour <= 0 || hour >= 24) {
                throw new IllegalArgumentException("Godzina musi być w przedziale (0, 24)!");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        } finally {
            System.out.println("Do zobaczenia jutro!");
            scanner.close();
        }
    }
}