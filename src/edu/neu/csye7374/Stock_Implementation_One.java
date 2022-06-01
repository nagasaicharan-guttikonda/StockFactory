package edu.neu.csye7374;


public class Stock_Implementation_One extends Stock{

    public Stock_Implementation_One(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() { //Calculates the percentage bid amount has fluctuated from the stock price
        double difference = getBid()-getPrice();
        double percentage = 100 * difference/getPrice();
        setMetric((int) (percentage));
        return super.getMetric();
    }
}
