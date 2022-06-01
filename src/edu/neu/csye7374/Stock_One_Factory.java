package edu.neu.csye7374;


// Factory Method Design Pattern - Implemented here
// Factory subclass for creating objects Stock_Implementation_One

public class Stock_One_Factory extends AbstractStockFactory {

    @Override
    public Stock getObject(String ID, double price, String description) {
        return new Stock_Implementation_One(ID, price, description);
    }

}
