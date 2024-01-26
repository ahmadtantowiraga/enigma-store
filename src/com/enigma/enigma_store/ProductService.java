package com.enigma.enigma_store;

public interface ProductService {

    public void createMenu(Product product);
    public void readMenu(String key);
    public void updateMenu();
    public void deleteMenu(int id);

}
