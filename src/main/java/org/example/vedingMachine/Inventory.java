package org.example.vedingMachine;

import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private final ConcurrentHashMap<Product,Integer> productList;
    Inventory(){
        productList = new ConcurrentHashMap<>();
    }
    public void addProduct(Product product, Integer quantity) {
        productList.put(product,quantity);
    }
    public void removeProduct(Product product) {
        productList.remove(product);
    }
    public void updateProduct(Product product) {
        productList.put(product,productList.getOrDefault(product,1)-1);
        if(productList.get(product)==0)
            productList.remove(product);
    }
    public int getQuantity(Product product) {
        return productList.get(product);
    }
    public boolean isAvailable(Product product) {
        return productList.containsKey(product) && productList.get(product)>0;
    }
}
