import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // - Läs in X temperaturangivelser från en fil
        // - Spara i en array
        // - Räkna ut medelvärdet
        // - Skriv ut alla temperaturer (+ rad i filen) som är högre än medelvärdet

        Scanner fileIn = new Scanner(new File("temps.txt"));
        double[] temps = new double[100];
        int count = 0;
        double sum = 0;

        while (fileIn.hasNextDouble()) {
            temps[count] = fileIn.nextDouble();
            sum += temps[count];
            count++;
        }

        double avg = sum / count;

        System.out.println("Medelvärdet är " + avg);
        for (int i=0; i < count; i++) {
            if (temps[i] > avg) {
                System.out.println(i + " --> " + temps[i]);
            }
        }
    }
}