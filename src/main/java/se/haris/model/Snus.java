package se.haris.model;

public class Snus implements Product{

    private int id;
    private String name;
    private boolean isStrong;
    private int price;

    public Snus(int id, String name, boolean isStrong, int price) {
        this.id = id;
        this.name = name;
        this.isStrong = isStrong;
        this.price = price;
    }

    @Override
    public String examine() {
        return "{ Snus: "+id+ " of type:" +name +". For only " +price;
    }

    @Override
    public String use() {
        String description = "You snusing " + name;
        description += isStrong ? " Good snus" : "This i not even snus";
        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setProductName(String productName) {
    this.name=name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
    this.price=price;
    }
}
