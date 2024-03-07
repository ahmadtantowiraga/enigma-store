package com.enigma.enigma_store;

public interface ProductService {

    public void createMenu(Product product);
    public void readMenu(String key);
    public void updateMenu(Product product, int id);
    public void deleteMenu(int id);
    public void showResult();

}
