package org.example.vedingMachine;

public class ReturnChangeState implements VendingMachineState{
    private final VendingMachine vendingMachine;
    public ReturnChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(Product product){
        System.out.println("Please collect the change first");
    }
    @Override
    public void insertCoin(Coin coin){
        System.out.println("Please collect the change first");
    }
    @Override
    public void insertNote(Note note){
        System.out.println("Please collect the change first");
    }
    @Override
    public void dispenseProduct(){
        System.out.println("Please collect the change first");
    }
    @Override
    public void returnChange(){
        Integer change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().getPrice();
        if(change > 0){
            System.out.println("Chnage returned: "+change);
            vendingMachine.resetPayment();
        } else{
            System.out.println("No change to return");
        }
        vendingMachine.resetSelectedProduct();
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
