public class Main {
    public static void main(String[] args) {
        System.out.println("--- Perhitungan Gaji Karyawan Bulan April 2025 ---");

        Department deptTeknologi = new Department("Teknologi Informasi");
        Department deptOperasional = new Department("Operasional");

        Fulltime asep = new Fulltime(
            "Asep",              
            "Staf Programmer",   
            deptTeknologi,      
            3,                  
            2,                  
            500000               
        );

        Parttime ujang = new Parttime(
            "Ujang",             
            "Pegawai Part-time", 
            deptOperasional,     
            5                    
        );

        System.out.println("\nInformasi Karyawan: " + asep.getNama());
        System.out.println("Departemen: " + asep.getDepartment().getDepartmentName());
        System.out.println("Jabatan: " + asep.getJabatan() + " (Full-time)");
        asep.displayRincianGaji();
        System.out.println("--------------------------------------------------");
        System.out.println("Total Gaji Asep: Rp " + String.format("%,.0f", asep.hitungGajiTotal()));

        System.out.println("\nInformasi Karyawan: " + ujang.getNama());
        System.out.println("Departemen: " + ujang.getDepartment().getDepartmentName());
        System.out.println("Jabatan: " + ujang.getJabatan());
        ujang.displayRincianGaji();
        System.out.println("--------------------------------------------------");
        System.out.println("Total Gaji Ujang: Rp " + String.format("%,.0f", ujang.hitungGajiTotal()));
    }
}