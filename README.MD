# Neighborhood Library

It is a simple application for managing a neighborhood library system based on the honor system.Users can view available
books, check them out, and return them when done.

## Features

-View a list of available books (ID, ISBN, Title)
- Check out a book by entering the book ID and name
- View checked out books and see who has each one
- Check in a book using its ID

## How to Use

1. Run the program.
2. Choose from the main menu:
    - Option 1: Show Available Books
    - Option 2: Show Checked Out Books
    - Option 3: Exit
3. In Option 1:
    - Enter the ID of the book you want to check out
    - Enter your name
4. In Option 2:
    - Show a list of books that has been checked out 
    - Press 'C' to check in a book (you’ll enter the ID)
    - Press 'X' to return to the main menu
   
## Interesting Code Snippet

```java
if (book != null && !book.isCheckedOut()){
    System.out.println("Book ID: " + book.getId() + " | Book Title: " + book.getTitle() + 
        " | Book ISBN: " + book.getIsbn());
```

**Why it's interesting:**  
This snippet filters out all null book slots and only shows available books. It ensures the program doesn’t crash and 
the user only sees valid, check-out-able books. This whole program was a challenge as I had to trust the process and 
started over when there was a bug. 
