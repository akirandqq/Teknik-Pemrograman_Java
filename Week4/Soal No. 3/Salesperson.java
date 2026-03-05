public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // --- JAWABAN INSTRUKSI 5: Melengkapi compareTo ---
    public int compareTo(Object other) {
        int result;
        Salesperson otherSalesPerson = (Salesperson) other;

        // 1. Bandingkan berdasarkan total sales
        if (this.totalSales < otherSalesPerson.totalSales) {
            result = -1;
        } else if (this.totalSales > otherSalesPerson.totalSales) {
            result = 1;
        } else {
            // 2. Jika sales sama (tie), bandingkan berdasarkan lastName
            result = this.lastName.compareTo(otherSalesPerson.lastName);
            
            // 3. Jika lastName masih sama, bandingkan firstName
            if (result == 0) {
                result = this.firstName.compareTo(otherSalesPerson.firstName);
            }
        }
        return result;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSales() { return totalSales; }
}