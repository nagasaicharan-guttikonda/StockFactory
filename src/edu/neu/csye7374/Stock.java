package edu.neu.csye7374;

public class Stock implements Tradable {

    private String ID;
    private double price;
    private String description;
    private double bid;
    private int metric;

    public Stock(String ID, double price, String description){
        this.ID=ID;
        this.price=price;
        this.description=description;
        this.bid=0;
        this.metric=0;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "\n"+"Stock ID: "+this.ID+"\n"+
                "Stock Price: "+this.price+"\n"+
                "Stock Description: "+this.description+"\n"+
                "Stock Bid: "+this.bid+"\n"+
                "Stock Metric: "+this.metric+"\n"+
                "********************************************";
    }

    public Double getBid() {
        return bid;
    }

    @Override
    public void setBid(double bid) {
        this.bid = bid;
        this.setPrice(getPrice()+getMetric()); //Stock price updated
    }

    @Override
    public int getMetric() {
        return metric;
    }

    public void setMetric(int metric) {
        this.metric = metric;
    }

}
