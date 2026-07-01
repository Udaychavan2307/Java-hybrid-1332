package com.tka.june26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Quantity");
            System.out.println("5. Calculate Total Inventory Value");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter ID : ");
                int id = sc.nextInt();

                System.out.print("Enter Name : ");
                String name = sc.next();

                System.out.print("Enter Price : ");
                double price = sc.nextDouble();

                System.out.print("Enter Quantity : ");
                int quantity = sc.nextInt();

                System.out.print("Enter Category : ");
                String category = sc.next();

                Product p = new Product(id, name, price, quantity, category);
                products.add(p);

                System.out.println("Product Added Successfully.");
                break;

            case 2:

                System.out.println("\nProduct List");

                for (int i = 0; i < products.size(); i++) {

                    Product p1 = products.get(i);

                    System.out.println("ID : " + p1.getId());
                    System.out.println("Name : " + p1.getName());
                    System.out.println("Price : " + p1.getPrice());
                    System.out.println("Quantity : " + p1.getQuantity());
                    System.out.println("Category : " + p1.getCategory());
                    System.out.println();
                }

                break;

            case 3:

                System.out.print("Enter Product ID : ");
                int searchId = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {

                    Product p2 = products.get(i);

                    if (p2.getId() == searchId) {

                        System.out.println("ID : " + p2.getId());
                        System.out.println("Name : " + p2.getName());
                        System.out.println("Price : " + p2.getPrice());
                        System.out.println("Quantity : " + p2.getQuantity());
                        System.out.println("Category : " + p2.getCategory());
                    }
                }

                break;

            case 4:

                System.out.print("Enter Product ID : ");
                int updateId = sc.nextInt();

                System.out.print("Enter New Quantity : ");
                int newQuantity = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {

                    Product p3 = products.get(i);

                    if (p3.getId() == updateId) {

                        p3.setQuantity(newQuantity);

                        System.out.println("Quantity Updated Successfully.");
                    }
                }

                break;

            case 5:

                double total = 0;

                for (int i = 0; i < products.size(); i++) {

                    Product p4 = products.get(i);

                    total = total + (p4.getPrice() * p4.getQuantity());
                }

                System.out.println("Total Inventory Value : " + total);

                break;

            case 6:

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
