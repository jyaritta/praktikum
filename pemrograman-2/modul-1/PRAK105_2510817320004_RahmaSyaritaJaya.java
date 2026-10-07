import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2510817320004_RahmaSyaritaJaya {
    public static void main(String[] args) {
        final double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double result = pi * radius * radius * tinggi;
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + tinggi + " cm adalah " + df.format(result) + " m3");

        scanner.close();
    }
}
