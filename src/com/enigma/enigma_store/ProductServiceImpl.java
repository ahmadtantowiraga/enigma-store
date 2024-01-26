package com.enigma.enigma_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService{
    private final List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = new ArrayList<>();
    }


    private String helper(String data){
        Scanner scanner=new Scanner(System.in);
        System.out.print(data);
        String data2=scanner.nextLine();
        return data2;
    }

    @Override
    public void createMenu(Product product) {
        products.add(product);
    }

    @Override
    public void readMenu() {

    }

    @Override
    public void updateMenu() {

    }

    @Override
    public void deleteMenu() {

    }
}
