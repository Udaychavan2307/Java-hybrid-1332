package com.tka.june16;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        int choice = 0;

        while(choice != 7) {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Add Student Member");
            System.out.println("6. Add Teacher Member");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            // ADD BOOK
            if(choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // FIX

                System.out.print("Enter Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                lib.addBook(new Book(id, title, author));
            }

            // VIEW BOOKS
            else if(choice == 2) {
                lib.viewBooks();
            }

            // ISSUE BOOK
            else if(choice == 3) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                lib.issueBook(id);
            }

            // RETURN BOOK
            else if(choice == 4) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                lib.returnBook(id);
            }

            // STUDENT MEMBER
            else if(choice == 5) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // FIX

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                StudentMember s = new StudentMember(id, name);
                s.display();
                System.out.println("Limit: " + s.getLimit());
            }

            // TEACHER MEMBER
            else if(choice == 6) {

                System.out.print("Enter Teacher ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // FIX

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                TeacherMember t = new TeacherMember(id, name);
                t.display();
                System.out.println("Limit: " + t.getLimit());
            }
        }

        System.out.println("System Exit...");
    }
}