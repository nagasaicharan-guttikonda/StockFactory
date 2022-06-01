package edu.neu.csye7374;

public class Driver {

    public static void main (String[] args) {

        // GoF Factory Method pattern
        AbstractStockFactory IBMFactory = new Stock_One_Factory();
        Stock IBM = IBMFactory.getObject("IBM1", 100.01, "IBM Stock");
        System.out.println(IBM);


        System.out.println("\nState of the stock after each bidding");

        IBM.setBid(122.15);
        System.out.println(IBM);

        IBM.setBid(129.74);
        System.out.println(IBM);

        IBM.setBid(142.09);
        System.out.println(IBM);

        IBM.setBid(162.63);
        System.out.println(IBM);

        IBM.setBid(132.22);
        System.out.println(IBM);

        IBM.setBid(124.19);
        System.out.println(IBM);


        // GoF Factory Method pattern and Eager Singleton
        AbstractStockFactory singleIBMFactory = Singleton_Stock_One_Factory.getInstance();
        Stock anotherIBM = singleIBMFactory.getObject("IBM2", 120.99, "Another IBM Stock from Eager Singleton Factory");
        System.out.println(anotherIBM);

        anotherIBM.setBid(122.15);
        System.out.println(anotherIBM);

        anotherIBM.setBid(129.74);
        System.out.println(anotherIBM);

        anotherIBM.setBid(142.09);
        System.out.println(anotherIBM);

        anotherIBM.setBid(162.63);
        System.out.println(anotherIBM);

        anotherIBM.setBid(132.22);
        System.out.println(anotherIBM);

        anotherIBM.setBid(124.19);
        System.out.println(anotherIBM);

        // GoF Factory Method pattern
        AbstractStockFactory googleFactory = new Stock_Two_Factory();
        Stock google = googleFactory.getObject("GOO1", 333.33, "Google Stock");
        System.out.println(google);


        System.out.println("\nState of the stock after each bidding");

        google.setBid(122.15);
        System.out.println(google);

        google.setBid(129.74);
        System.out.println(google);

        google.setBid(142.09);
        System.out.println(google);

        google.setBid(162.63);
        System.out.println(google);

        google.setBid(132.22);
        System.out.println(google);

        google.setBid(124.19);
        System.out.println(google);


        // GoF Factory Method pattern and Lazy Singleton
        AbstractStockFactory anotherGoogleFactory = Singleton_Stock_Two_Factory.getInstance();
        Stock anotherGoogle = anotherGoogleFactory.getObject("GOO2", 222.22, "Another Google Stock from Lazy Singleton Factory");
        System.out.println(anotherGoogle);


        System.out.println("\nState of the stock after each bidding");

        anotherGoogle.setBid(122.15);
        System.out.println(anotherGoogle);

        anotherGoogle.setBid(129.74);
        System.out.println(anotherGoogle);

        anotherGoogle.setBid(142.09);
        System.out.println(anotherGoogle);

        anotherGoogle.setBid(162.63);
        System.out.println(anotherGoogle);

        anotherGoogle.setBid(132.22);
        System.out.println(anotherGoogle);

        anotherGoogle.setBid(124.19);
        System.out.println(anotherGoogle);
    }

}
