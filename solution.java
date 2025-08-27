import java.util.Scanner;
import java.util.InputMismatchException;

public class solution {

    public static void main(String[S] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Membaca jumlah test case

        for (int i = 0; i < t; i++) {
            try {
                // Mencoba membaca input sebagai tipe data long
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // Memeriksa apakah cocok untuk tipe byte (-128 hingga 127)
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                
                // Memeriksa apakah cocok untuk tipe short (-32,768 hingga 32,767)
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                
                // Memeriksa apakah cocok untuk tipe int (-2^31 hingga 2^31-1)
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                
                // Jika berhasil dibaca sebagai long, pasti cocok untuk tipe long
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (InputMismatchException e) {
                // Jika terjadi error saat membaca (angka terlalu besar), tangkap errornya
                // Baca input yang salah tersebut sebagai String untuk dicetak
                String inputThatFailed = sc.next();
                System.out.println(inputThatFailed + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}