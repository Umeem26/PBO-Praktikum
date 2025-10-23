import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class ContohMap {
    public static void main(String[] args) {

        // 1. HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Tiga");
        hashMap.put(1, "Satu");
        hashMap.put(2, "Dua");
        hashMap.put(1, "Satu-Revisi"); 
        
        System.out.println("HashMap (Key Tidak Terurut): " + hashMap);
        
        // 2. TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Tiga");
        treeMap.put(1, "Satu");
        treeMap.put(2, "Dua");
        treeMap.put(1, "Satu-Revisi"); 

        System.out.println("TreeMap (Key Pasti Terurut): " + treeMap);

        System.out.println("\nKesimpulan: Keduanya memetakan Key unik ke Value.");
        System.out.println("Perbedaan utama adalah HashMap (key cepat, tidak terurut) vs TreeMap (key terurut).");
    }
}