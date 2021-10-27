package se.haris.model;

public class Sandwich implements Product {
    private int id;
    private String name;
    private String meat;
    private int price;

    public Sandwich(int id, String name, String meat, int price) {
        this.id = id;
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    @Override
    public String examine() {
        return "{ Sandwich: "+id+ " of type:" +meat +". For only " +price;
    }

    @Override
    public String use() {
        String description = "You eating a " + name + ". Inside the sandwich the meat is " + meat;
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
