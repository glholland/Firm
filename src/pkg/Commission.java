package pkg;

public class Commission extends Hourly {
    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eComRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = eComRate;
    }

    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    public double pay()
    {
        totalSales =+ super.pay();
        return totalSales;
    }

    public String toString(){

        return "s";
    }

}
