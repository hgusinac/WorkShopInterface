package se.haris.Service;

import se.haris.model.Product;

public class VendingMachine implements IVendingMachine{

    private static final int [] validMoney = {1,2,5,10,20,50,100,200,500,1000};
    private final Product [] products;
    public int depositPool;

    public VendingMachine(Product[] products) {
        this.products = products;
    }



    @Override
    public void addCurrency(int amount) {
        //Kolla igenom ValidMoney, varje valör heter money
        for (int money :validMoney){
            //Om valören är samma som innehållet
            if (money ==  amount){
                //Lägg till valören
                depositPool+=amount;
            }
        }
    }

    @Override
    public int getBalance() {
        //Visa depositPoolens innehåll.
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product: products){
            if (product.getId() == id){
                if (product.getPrice() <= depositPool){
                    depositPool = depositPool - product.getPrice();
                    return product;
                }else{
                    throw new RuntimeException("Product " + product.getProductName() + " is to expensive");
                }
            }
        }
        throw new RuntimeException("Cold not fint the product whit id: " + id);
    }
    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool=0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        String notFound = "Could not find product whit id" + id;
        for (Product product:products){
            if (product.getId()==id){
                return product.examine().concat(" price:" +product.getPrice());
            }
        }
        return notFound;
    }

    @Override
    public String[] getProducts() {
        String[] productsInArray = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsInArray[i]= products[i].examine().concat(" price "+ products[i].getPrice());

        }
        return productsInArray;
    }
}
