package org.example.vedingMachine;

public class VendingMachine {
    private static VendingMachine instance;
    Inventory inventory;
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispenseState;
    private final VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private Product product;
    private Integer totalPayment;

    private VendingMachine(){
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        product = null;
        totalPayment = 0;
    }

    public static synchronized VendingMachine getInstance() {
        if(instance == null)
            instance = new VendingMachine();
        return instance;
    }

    public void selectProduct(Product product) {
        System.out.println(currentState.toString());
        currentState.selectProduct(product);
    }
    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }
    public void insertNote(Note note){
        currentState.insertNote(note);
    }
    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
    public void returnChange(){
        currentState.returnChange();
    }
    void setState(VendingMachineState vendingMachineState) {
        currentState = vendingMachineState;
    }
    VendingMachineState getIdleState(){
        return idleState;
    }
    VendingMachineState getReadyState(){
        return readyState;
    }
    VendingMachineState getDispenseState(){
        return dispenseState;
    }
    VendingMachineState getReturnChangeState(){
        return returnChangeState;
    }
    Product getSelectedProduct() {
        return product;
    }
    void setSelectedProduct(Product product){
        this.product = product;
    }
    void resetSelectedProduct(){
        this.product = null;
    }
    Integer getTotalPayment(){
        return totalPayment;
    }
    void addCoin(Coin coin){
        totalPayment+=coin.getValue();
    }
    void addNote(Note note) {
        totalPayment+=note.getValue();
    }
    void resetPayment(){
        totalPayment = 0;
    }
}
