package se.haris;

import se.haris.Service.VendingMachine;
import se.haris.model.Drinks;
import se.haris.model.Product;
import se.haris.model.Sandwich;
import se.haris.model.Snus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Product [] products ={
                new Drinks(1,"Coke",300,25),
                new Drinks(2,"fanta",500,30),
                new Drinks(3,"Monster",1000,50),
                new Sandwich(4,"TunaSandwich","Tuna",100),
                new Sandwich(5,"ChickenSandwich","Chiken",125),
                new Sandwich(6,"BeffSandwich","Beff",200),
                new Snus(7,"Göteborgs Rape",true,300),
                new Snus(8,"Göteborgs Rape mini",false,100),
                new Snus(9,"Ettan lös",true,500),
        };
        VendingMachine vm = new VendingMachine(products);


        for (String p :vm.getProducts()){
            System.out.println(p);
            System.out.println("------------------");
        }
        vm.addCurrency(1000);
        System.out.println(vm.getBalance());
        Product snus = vm.request(7);
        System.out.println(snus.use());
        System.out.println(vm.getBalance());
        System.out.println(vm.getDescription(9));


        vm.request(9);
        System.out.println(vm.request(8).use());
        System.out.println(vm.getBalance());
        vm.addCurrency(500);
        System.out.println(vm.request(6).use());
        System.out.println(vm.endSession());




    }
}
