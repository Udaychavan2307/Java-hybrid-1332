package com.tka.june26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // List to store products
        List<Product> products = new ArrayList<>();

        int choice;

        // Menu starts
        do {

            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Calculate Total Inventory Value");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                // Add Product

                System.out.print("Enter Product ID : ");
                int id = sc.nextInt();

                System.out.print("Enter Product Name : ");
                String name = sc.next();

                System.out.print("Enter Product Price : ");
                double price = sc.nextDouble();

                System.out.print("Enter Product Quantity : ");
                int quantity = sc.nextInt();

                System.out.print("Enter Product Category : ");
                String category = sc.next();

                products.add(new Product(id, name, price, quantity, category));

                System.out.println("Product Added Successfully.");

                break;

            case 2:

                // Display Products

                System.out.println("\nProduct List");

                for (int i = 0; i < products.size(); i++) {

                    System.out.println(
                            "ID : " + products.get(i).id +
                            " Name : " + products.get(i).name +
                            " Price : " + products.get(i).price +
                            " Quantity : " + products.get(i).quantity +
                            " Category : " + products.get(i).category);

                }

                break;

            case 3:

                // Search Product by ID

                System.out.print("Enter Product ID : ");
                int searchId = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {

                    if (products.get(i).id == searchId) {

                        System.out.println(
                                "ID : " + products.get(i).id +
                                " Name : " + products.get(i).name +
                                " Price : " + products.get(i).price +
                                " Quantity : " + products.get(i).quantity +
                                " Category : " + products.get(i).category);

                    }

                }

                break;

            case 4:

                // Update Quantity

                System.out.print("Enter Product ID : ");
                int updateId = sc.nextInt();

                System.out.print("Enter New Quantity : ");
                int newQuantity = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {

                    if (products.get(i).id == updateId) {

                        products.get(i).quantity = newQuantity;

                    }

                }

                System.out.println("Quantity Updated Successfully.");

                break;

            case 5:

                // Calculate Total Inventory Value

                double total = 0;

                for (int i = 0; i < products.size(); i++) {

                    total = total + (products.get(i).price * products.get(i).quantity);

                }

                System.out.println("Total Inventory Value : " + total);

                break;

            case 6:

                // Exit Program

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
