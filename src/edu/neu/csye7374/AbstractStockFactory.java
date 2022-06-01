package edu.neu.csye7374;

// Factory Method Design Pattern
// Abstract Super Class

public abstract class AbstractStockFactory {

    public abstract Stock getObject(String ID, double price, String description);

}
