package com.tka.june16;

public class Library {

    Book books[] = new Book[10];
    int count = 0;

    // ADD BOOK
    public void addBook(Book b) {
        books[count] = b;
        count++;
        System.out.println("Book Added");
    }

    // VIEW BOOKS
    public void viewBooks() {
        for(int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    // ISSUE BOOK
    public void issueBook(int id) {
        for(int i = 0; i < count; i++) {
            if(books[i].id == id) {
                System.out.println("Book Issued: " + books[i].title);
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    // RETURN BOOK
    public void returnBook(int id) {
        for(int i = 0; i < count; i++) {
            if(books[i].id == id) {
                System.out.println("Book Returned: " + books[i].title);
                return;
            }
        }
        System.out.println("Book Not Found");
    }
}