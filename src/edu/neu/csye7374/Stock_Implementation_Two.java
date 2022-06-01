package edu.neu.csye7374;


public class Stock_Implementation_Two extends Stock{

    public Stock_Implementation_Two(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() { //Calculates the fluctuation median between bid amount and stock price
        double difference = getBid()-getPrice();
        double median = difference/2;
        setMetric((int) (median));
        return super.getMetric();
    }

}
