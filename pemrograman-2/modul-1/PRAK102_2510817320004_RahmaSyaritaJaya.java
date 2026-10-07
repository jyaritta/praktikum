import java.util.Scanner;

public class PRAK102_2510817320004_RahmaSyaritaJaya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        int current = n;

        while (count < 10) {
            if (current % 5 == 0) {
                System.out.print((current / 5) - 1);
            } else {
                System.out.print(current);
            }
            if (count < 9) {
                System.out.print(",");
            }
            current++;
            count++;
        }
        scanner.close();
    }
}
