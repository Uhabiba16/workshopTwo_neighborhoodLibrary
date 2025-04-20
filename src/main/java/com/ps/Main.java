package com.ps;

import java.util.Scanner;

public class Main {
    public static void availableBooks(Book[] bookList, Scanner scanner) {
        System.out.println("Available Books");
        for (Book book : bookList) {
            if (book != null && !book.isCheckedOut()) {
                System.out.println("Book ID: " + book.getId() + " Book Title: " + book.getTitle() + " Book ISBN: " + book.getIsbn());
            }
        }
        System.out.print("\nEnter book ID to check out or \"0\" to return to Main menu: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        if (bookId==0){
            System.out.println("Loading Main Menu");
        return;
        }
        for (Book book: bookList){
            if (book != null && book.getId()== bookId && !book.isCheckedOut()){
                System.out.print("Enter Name to Check out: ");
                String name= scanner.nextLine();

                book.checkOut(name);
                System.out.println("Enjoy! "+name.toUpperCase());

                System.out.print("\nPress enter for Main Menu");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("\nBook is not available, press Enter to return to Main Menu");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] bookList = new Book[20];
        bookList[0] = new Book(1, "123-00001", "Harry Potter1", false, "");
        bookList[1] = new Book(2, "123-00002", "Harry Potter2", false, "");
        bookList[2] = new Book(3, "123-00003", "Harry Potter3", false, "");
        bookList[3] = new Book(4, "123-00004", "Harry Potter4", false, "");
        bookList[4] = new Book(5, "123-00004", "Harry Potter5", true, "");
        bookList[5] = new Book(6, "123-00005", "Harry Potter6", false, "");
        bookList[6] = new Book(7, "123-00007", "Harry Potter7", false, "");
        bookList[7] = new Book(8, "123-00008", "Game of Thrones1", false, "");
        bookList[8] = new Book(9, "123-00009", "Game of Thrones2", false, "");
        bookList[9] = new Book(10, "123-000010", "Game of Thrones3", false, "");
        bookList[10] = new Book(11, "123-000011", "Game of Thrones4", true, "");
        bookList[11] = new Book(12, "123-000012", "Game of Thrones5", false, "");
        bookList[12] = new Book(13, "123-000013", "The Lord of the Rings1", false, "");
        bookList[13] = new Book(14, "123-000014", "The Lord of the Rings2", false, "");
        bookList[14] = new Book(15, "123-000015", "The Lord of the Rings3", false, "");
        bookList[15] = new Book(16, "123-000016", "Java for Dummies", false, "");
        bookList[16] = new Book(17, "123-000017", "Python for Dummies", true, "");
        bookList[17] = new Book(18, "123-000018", "How to be a Software Engineer", false, "");
        bookList[18] = new Book(19, "123-000019", "Web Design 101", false, "");
        bookList[19] = new Book(20, "123-000020", "Artificial Intelligence", true, "");

        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("\nWelcome to Neighborhood Library!");
            System.out.println("\nShow Available Books option \"1\"");
            System.out.println("Show Checked Out Books option \"2\"");
            System.out.println("Exit option \"0\"");
            System.out.print("\nEnter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    availableBooks(bookList,scanner);
                    break;
                case 2:
                    // checked out books method
                    break;
                case 0:
                    mainMenu = false;
                    System.out.println("\nYou are exiting the Library, come again!");
                    break;
                default:
                    System.out.println("\nPlease enter \"1\", \"2\", or \"0\" for menu options");
            }
        }
    }
}