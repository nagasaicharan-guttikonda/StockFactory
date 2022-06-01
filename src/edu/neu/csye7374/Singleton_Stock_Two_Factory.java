package edu.neu.csye7374;


//Singleton (Lazy) Factory class for Stock_Implementation_Two

public class Singleton_Stock_Two_Factory extends AbstractStockFactory {

    private static AbstractStockFactory instance;

    private Singleton_Stock_Two_Factory() {
        super();
    }

    public static AbstractStockFactory getInstance() {
        if (instance == null) {
            instance = new Stock_Two_Factory();
        }
        return instance;
    }

    @Override
    public Stock getObject(String ID, double price, String description) {
        return new Stock_Implementation_Two(ID, price, description);
    }

}

