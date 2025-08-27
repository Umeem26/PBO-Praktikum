import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        // 1. Menjumlahkan panjang kedua string
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        // 2. Membandingkan secara leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Mengubah huruf pertama menjadi kapital dan menggabungkannya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}