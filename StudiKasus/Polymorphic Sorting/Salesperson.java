public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
        firstName.equals(((Salesperson)other).getFirstName()));
    }

    // PERUBAHAN: Metode compareTo sekarang sudah diimplementasikan
    public int compareTo(Object other)
    {
        Salesperson otherSalesperson = (Salesperson) other;

        // Pertama, bandingkan total penjualanjava
        if (this.totalSales != otherSalesperson.totalSales) {
            return this.totalSales - otherSalesperson.totalSales;
        } else {
            // Jika penjualan sama, bandingkan nama belakang secara terbalik (Z-A)
            int lastNameCompare = otherSalesperson.lastName.compareTo(this.lastName);
            if (lastNameCompare != 0) {
                return lastNameCompare;
            } else {
                return otherSalesperson.firstName.compareTo(this.firstName);
            }
        }
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSales() { return totalSales; }
}