import java.util.Scanner;

public class PRAK101_2510817320004_RahmaSyaritaJaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int day = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int month = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int year = scanner.nextInt();

        boolean isKabisat = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxHari;

        if (month == 2) {
            maxHari = isKabisat ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxHari = 30;
        } else {
            maxHari = 31;
        }

        if (month < 1 || month > 12 || day < 1 || day > maxHari) {
            System.exit(0);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int height = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = scanner.nextDouble();

        String[] monthName = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthPlace +
                            " pada Tanggal " + day + " " + monthName[month] + " " + year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");

        scanner.close();
    }
}
