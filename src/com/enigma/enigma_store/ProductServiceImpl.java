package com.enigma.enigma_store;

import java.util.ArrayList;
import java.util.Date;
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
    public void readMenu(String key) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(key) || products.get(i).getBrand().equals(key)){
                System.out.println("Product ID : "+ products.get(i).getId());
                System.out.println("Product Name : "+ products.get(i).getName());
                System.out.println("Product Brand : "+ products.get(i).getBrand());
                System.out.println("Product Price : "+ products.get(i).getPrice());
                System.out.println("Product Time : "+ products.get(i).getDate());
            }
        }
    }

    @Override
    public void updateMenu(Product product, int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                product.setId(products.get(i).getId());
                Date date=new Date();
                product.setDate(date);
                products.set(i,product);
            }
        }
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
            System.out.println();
        }
    }
}
