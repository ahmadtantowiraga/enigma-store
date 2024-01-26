package com.enigma.enigma_store;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public ProductServiceImpl productServiceImpl;

    public Menu() {
        this.productServiceImpl = new ProductServiceImpl();
    }

    public void showMenu(){
        while (true) {
            String noMenu=null;
            boolean check=true;
            while(check){
                System.out.println("--------------------------------------");
                System.out.println("Main Menu");
                System.out.println("--------------------------------------");
                System.out.println("1. Add Product");
                System.out.println("2. Update Product");
                System.out.println("3. Delete Product");
                System.out.println("4. View All Product");
                System.out.println("5. Search Product");
                System.out.println("6. EXIT");
                System.out.println("Input menu Option (1-6) : ");
                noMenu = helper("");
                if (Integer.parseInt(noMenu) < 1 || Integer.parseInt(noMenu) > 6) {
                    System.out.println("Masukan NO MENU yang benar (1-6)");
                    System.out.println("Tekan ENTER untuk melanjutkan");
                    helper("");
                }else{
                    check=false;
                }
            }
            if (noMenu.equals("6")){
                break;
            }else {
                switch (noMenu) {
                    case "1":
                        String name="";
                        String brand="";
                        int price=0;
                        do{
                            name=helper("Input name of Produt : ");
                            if (name.length() < 2 || name.length() > 50) {
                                System.out.println("Name (min 3 characters, max 50 characters)");
                            }else {
                                break;
                            }
                        }while(true);
                        do{
                            brand=helper("Input brand of product : ");
                            if (brand.length() < 2 || brand.length() > 30) {
                                System.out.println("Name (min 3 characters, max 50 characters)");
                            }else {
                                break;
                            }
                        }while(true);
                        do{
                            price=Integer.parseInt(helper("Input Price of Product : "));
                            if (price < 0) {
                                System.out.println("Price (must be a positive number)");
                            }else {
                                break;
                            }
                        }while(true);
                        Date date=new Date();
                        Product product=new Product(name,brand,price);
                        product.setDate(date);
                        productServiceImpl.createMenu(product);
                        break;
                    case "2":
                        int idProduct=Integer.parseInt(helper("Enter the product ID to be deleted : "));
                        String name2="";
                        String brand2="";
                        int price2=0;
                        do{
                            name2=helper("Input name of Produt : ");
                            if (name2.length() < 2 || name2.length() > 50) {
                                System.out.println("Name (min 3 characters, max 50 characters)");
                            }else {
                                break;
                            }
                        }while(true);
                        do{
                            brand2=helper("Input brand of product : ");
                            if (brand2.length() < 2 || brand2.length() > 30) {
                                System.out.println("Name (min 3 characters, max 50 characters)");
                            }else {
                                break;
                            }
                        }while(true);
                        do{
                            price2=Integer.parseInt(helper("Input Price of Product : "));
                            if (price2 < 0) {
                                System.out.println("Price (must be a positive number)");
                            }else {
                                break;
                            }
                        }while(true);
                        Product product1=new Product(name2,brand2,price2);
                        productServiceImpl.updateMenu(product1, idProduct);
                        break;
                    case "3":
                        int id=Integer.parseInt(helper("Input ID : "));
                        productServiceImpl.deleteMenu(id);
                        break;
                    case "4":
                        productServiceImpl.showResult();
                        helper(" ENTER TO CONTINUE");
                        break;
                    case "5":
                        String data=helper("enter keywords : ");
                        productServiceImpl.readMenu(data);
                        helper(" ENTER TO CONTINUE");
                        break;
                }
            }
        }
    }
    private String helper(String data){
        Scanner scanner=new Scanner(System.in);
        System.out.print(data);
        String data2=scanner.nextLine();
        return data2;
    }
}
