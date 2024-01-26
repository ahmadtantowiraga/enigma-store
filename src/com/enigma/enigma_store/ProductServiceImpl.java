package com.enigma.enigma_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService{
    private final List<Product> products;

    public ProductServiceImpl() {
        this.products = new ArrayList<>();
    }


    @Override
    public void createMenu(Product product) {
        product.setId(this.products.size()+1);
        products.add(product);
    }

    @Override
    public void readMenu() {

    }

    @Override
    public void updateMenu() {

    }

    @Override
    public void deleteMenu(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                products.remove(i);
            }
        }

    }


    public void showResult() {
        for (int i = 0; i < products.size(); i++) {
            Product product=products.get(i);
            System.out.println("Product ID : "+ product.getId());
            System.out.println("Product Name : "+ product.getName());
            System.out.println("Product Brand : "+ product.getBrand());
            System.out.println("Product Price : "+ product.getPrice());
            System.out.println("Product Time : "+ product.getDate());
        }
    }
}
