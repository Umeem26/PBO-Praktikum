import java.util.Scanner;
import java.util.InputMismatchException;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan jumlah case dan angka yang ingin di cek:");

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {6
                    System.out.println("* byte");
                }
                
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (InputMismatchException e) {
                String inputThatFailed = sc.next();
                System.out.println(inputThatFailed + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}