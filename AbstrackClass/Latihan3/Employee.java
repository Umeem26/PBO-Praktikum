public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) {
            return -1;
        }
        if (this.salary > eb.salary) {
            return 1;
        }
        return 0;
    }

    public int hireYear() {
        return hireyear;
    }

    public void print() {
        System.out.println("Nama: " + name + ", Gaji: " + salary + ", Tahun Masuk: " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }
}