import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // 1. ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apel");
        arrayList.add("Jeruk");
        arrayList.add("Mangga");
        arrayList.add("Apel"); 
        
        System.out.println("ArrayList: " + arrayList);
        
        // 2. LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apel");
        linkedList.add("Jeruk");
        linkedList.add("Mangga");
        linkedList.add("Apel"); 
        
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\nKesimpulan: Keduanya menyimpan urutan dan mengizinkan duplikat.");
        System.out.println("Perbedaan utama mereka adalah performa internal (akses vs. insert/delete).");
    }
}