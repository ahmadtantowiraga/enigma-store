package com.enigma.enigma_store;

import java.util.List;

public class Menu {
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
                System.out.println("Input menu Option (1-6) : ");
                noMenu = inputData();
                if (Integer.parseInt(noMenu) < 1 || Integer.parseInt(noMenu) > 4) {
                    System.out.println("Masukan NO MENU yang benar");
                    System.out.println("Tekan ENTER untuk melanjutkan");
                    inputData();
                }else{
                    check=false;
                }
            }
            if (noMenu.equals("4")){
                break;
            }else {
                switch (noMenu) {
                    case "1":
                        addCollegeStudent();
                        break;
                    case "2":
                        deleteCollegeStudent();
                        break;
                    case "3":
                        viewAllCollegeStudent();
                        break;
                }
            }
        }
    }
}
