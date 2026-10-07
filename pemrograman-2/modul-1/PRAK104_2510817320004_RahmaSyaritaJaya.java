import java.util.Scanner;

public class PRAK104_2510817320004_RahmaSyaritaJaya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = scanner.next();
        String abu2 = scanner.next();
        String abu3 = scanner.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = scanner.next();
        String bagas2 = scanner.next();
        String bagas3 = scanner.next();

        int pointA = 0;
        int pointB = 0;

        if (abu1.equals(bagas1)) {
        } else if ((abu1.equals("B") && bagas1.equals("G")) ||
                   (abu1.equals("G") && bagas1.equals("K")) ||
                   (abu1.equals("K") && bagas1.equals("B"))) {
            pointA++;
        } else {
            pointB++;
        }

        if (abu2.equals(bagas2)) {
        } else if ((abu2.equals("B") && bagas2.equals("G")) ||
                   (abu2.equals("G") && bagas2.equals("K")) ||
                   (abu2.equals("K") && bagas2.equals("B"))) {
            pointA++;
        } else {
            pointB++;
        }

        if (abu3.equals(bagas3)) {
        } else if ((abu3.equals("B") && bagas3.equals("G")) ||
                   (abu3.equals("G") && bagas3.equals("K")) ||
                   (abu3.equals("K") && bagas3.equals("B"))) {
            pointA++;
        } else {
            pointB++;
        }

        if (pointA > pointB) {
            System.out.println("Abu");
        } else if (pointB > pointA) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}
