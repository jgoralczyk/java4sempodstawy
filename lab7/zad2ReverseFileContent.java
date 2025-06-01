import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class zad2ReverseFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ścieżkę do pliku: ");
        String filePath = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            Collections.reverse(lines);

            System.out.println("Zawartość pliku w odwrotnej kolejności:");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Błąd podczas czytania pliku: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operacja zakończona.");
        }
    }
}