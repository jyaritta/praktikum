import java.util.Scanner;

public class PRAK103_2510817320004_RahmaSyaritaJaya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int awal = scanner.nextInt();

        int count = 0;
        int current = awal;

        do {
            if (current % 2 != 0) {
                System.out.print(current);
                count++;
                if (count < N) {
                    System.out.print(", ");
                }
            }
            current++;
        } while (count < N);

        scanner.close();
    }
}
