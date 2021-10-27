package se.haris.model;

public interface Product {
    String examine();
    String use();
    int getId();
    String getProductName();
    void setProductName(String productName);
    int getPrice();
    void setPrice(int price);
}
