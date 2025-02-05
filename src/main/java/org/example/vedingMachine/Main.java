package org.example.vedingMachine;

public class Main {
    public static void main(String args[]) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        Product coke = new Product("Coke",20);
        Product pepsi = new Product("Pepsi", 30);
        Product water = new Product("Water", 10);

        vendingMachine.inventory.addProduct(coke,10);
        vendingMachine.inventory.addProduct(pepsi,4);
        vendingMachine.inventory.addProduct(water,20);

        vendingMachine.selectProduct(coke);
        vendingMachine.insertNote(Note.TWENTY);
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();

        vendingMachine.selectProduct(pepsi);
        vendingMachine.insertNote(Note.FIFTY);
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();
    }
}
