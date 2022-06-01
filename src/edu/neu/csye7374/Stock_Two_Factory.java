package edu.neu.csye7374;


// Factory Method Design Pattern - Implemented here
// Factory subclass for creating objects Stock_Implementation_Two

public class Stock_Two_Factory extends AbstractStockFactory {

    @Override
    public Stock getObject(String ID, double price, String description) {
        return new Stock_Implementation_Two(ID, price, description);
    }

}


