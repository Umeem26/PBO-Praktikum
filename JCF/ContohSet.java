import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class ContohSet {
    public static void main(String[] args) {
        
        // 1. HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Zebra");
        hashSet.add("Singa");
        hashSet.add("Gajah");
        hashSet.add("Singa"); 
        
        System.out.println("HashSet (Tidak Terurut): " + hashSet); 
        
        // 2. TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Singa");
        treeSet.add("Gajah");
        treeSet.add("Singa"); 
        
        System.out.println("TreeSet (Pasti Terurut): " + treeSet);

        System.out.println("\nKesimpulan: Keduanya menolak duplikat.");
        System.out.println("Perbedaan utama adalah HashSet (cepat, tidak terurut) vs TreeSet (terurut).");
    }
}