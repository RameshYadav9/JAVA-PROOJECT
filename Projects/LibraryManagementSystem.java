package org.Projects;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
      private String name;
      private String author;
      private int quantity;

      public Book(String name , String author){
          this.name = name;
          this.author = author;
          quantity = 1;

      }
      public String getName(){
          return name;

      }
      public String getAuthor(){
          return author;
      }

      public int getQuantity(){
          return quantity;
      }
      public void increaseQuantity(){
          quantity++;

      }
      public void decreaseQuantity(){
          quantity--;
      }

      public String toString(){
          return "Book Name" + name + "Auther " + author + "quantity" + quantity;
      }


}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        Map <String,Book> library = new HashMap<>();

        int choice;

        do {
            System.out.println("1.Add Book");
            System.out.println("2.Read Book");

            System.out.println("3.Remove Book");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            choice = Scan.nextInt();
            Scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book Name");
                    String bookName = Scan.nextLine();
                    System.out.println("Enter Author Name");
                    String arthorName = Scan.nextLine();
                    Book newBook = new Book(bookName, arthorName);
                    if (library.containsKey(bookName)) {
                        library.get(bookName).increaseQuantity();

                    } else {
                        library.put(bookName, newBook);
                    }
                    System.out.println("Book Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter Book Name");
                    String searchName = Scan.nextLine();
                    Book foundBook = library.get(searchName);
                    if (foundBook != null) {
                        System.out.println("foundBook");
                    } else {
                        System.out.println("Book Not Found");
                    }

                case 3:
                    System.out.println("Enter Book Name TO Remove");
                    String removeName = Scan.nextLine();
                    Book removeBook = library.get(removeName);
                    if(removeBook != null){
                        library.remove(removeBook);
                        System.out.println("Book Remove Successfully");

                    }else {
                        System.out.println("Book Not Found");
                        break;
                    }


                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice please enter again");
                    break;
            }
        }while(choice!=4);


    }
}
