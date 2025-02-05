package org.example.vedingMachine;

public class DispenseState  implements VendingMachineState{
    private final VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(Product product){
        System.out.println("Product already selected. Make Payment!!!");
    }
    @Override
    public void insertCoin(Coin coin){
        System.out.println("Payment already done. Please collect the dispensed product!!!");
    }
    @Override
    public void insertNote(Note note){
        System.out.println("Payment already done. Please collect the dispensed product!!!");
    }
    @Override
    public void dispenseProduct(){
        vendingMachine.setState(vendingMachine.getReadyState());

        Product product = vendingMachine.getSelectedProduct();
        vendingMachine.inventory.updateProduct(product);
        System.out.println("Product dispensed!!!");
        vendingMachine.setState(vendingMachine.getReturnChangeState());
    }
    @Override
    public void returnChange(){
        System.out.println("First collect the dispensed product!!!");
    }
}
