package se.haris.model;

public class Drinks implements Product{
    private int id;
    private String name;
    private int Volume;
    private int price;

    public Drinks(int id, String name, int volume, int price) {
        this.id = id;
        this.name = name;
        Volume = volume;
        this.price = price;
    }

    @Override
    public String examine() {
       return "{ id: "+id +", Drink " +name + ", is "  + Volume +"cl.";
    }

    @Override
    public String use() {
       String description = "You drink some " + name + "that tasts good";
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
    this.name=productName;
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
