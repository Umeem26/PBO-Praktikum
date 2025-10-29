import java.util.HashSet;
import java.util.Set;

public class CountrySet {
    public static void main(String[] args) {
        
        Set<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Jepang");
        countries.add("Brazil");
        countries.add("Mesir");
        countries.add("Jepang"); 
        countries.add("Kanada");
        
        System.out.println("Jumlah negara (unik): " + countries.size());
        System.out.println("Daftar negara (urutan tidak terjamin): " + countries);
    }
}