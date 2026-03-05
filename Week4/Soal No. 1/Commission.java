// Commission.java
public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor dengan 6 parameter
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        // Memanggil constructor parent (Hourly) untuk 5 parameter pertama
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // Set komisi untuk parameter ke-6
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    // Method untuk menambahkan penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Overriding method pay()
    @Override
    public double pay() {
        // Panggil pay() dari parent untuk hitung gaji per jam
        double hourlyPay = super.pay(); 
        
        // Hitung tambahan dari komisi
        double commissionPay = totalSales * commissionRate; 
        
        // Total gaji
        double totalPay = hourlyPay + commissionPay;
        
        // Reset totalSales kembali ke 0 setelah digaji
        totalSales = 0.0; 
        
        return totalPay;
    }

    // Overriding toString()
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}