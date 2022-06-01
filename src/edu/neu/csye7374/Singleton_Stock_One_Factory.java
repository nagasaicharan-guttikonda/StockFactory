package edu.neu.csye7374;


// Singleton (Early or Eager) Factory class for Stock_Implementation_One

public class Singleton_Stock_One_Factory extends AbstractStockFactory {

    private static AbstractStockFactory instance = new Stock_One_Factory();

    private Singleton_Stock_One_Factory() {
        super();
    }

    public static AbstractStockFactory getInstance() {
        return instance;
    }

    @Override
    public Stock getObject(String ID, double price, String description) {
        return new Stock_Implementation_One(ID, price, description);
    }

}