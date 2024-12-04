
package oop_exercise8;

import java.util.ArrayList;
import java.util.Scanner;


public class BookList {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book add successful.");
    }
    
    public boolean deleteBookById(String id){
        for(Book book : books){
            if(book.getId().equals(id)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
    
    public boolean updateBookById(String id){
        Scanner sc = new Scanner(System.in);
        for(Book book : books){
            if(book.getId().equals(id)){
                if(book instanceof TextBook){
                    System.out.println("Enter new title :");
                    book.setTitle(sc.nextLine());
                    System.out.println("Enter new base price :");
                    book.setBasePrice(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Enter new subject :");
                    ((TextBook) book).setSubject(sc.nextLine());
                    
                }else if(book instanceof ReferenceBook){
                    System.out.println("Enter new title :");
                    book.setTitle(sc.nextLine());
                    System.out.println("Enter new base price :");
                    book.setBasePrice(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Enter new publisher :");
                    ((ReferenceBook) book).setPublisher(sc.nextLine());
                }
                return true;
            }
        }
        return false;
    }
    
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No book in list");
        }else{
            for(Book book : books){
                book.displayDetails();
                System.out.println("------------");
            }
        }
    }
    
    public boolean findBookById(String id){
        for(Book book : books){
            if(book.getId().equals(id)){
                book.displayDetails();
                return true;
            }
        }
        return false;
    }
    
    public Book findMostExpensiveBook(){
        Book expensiveBook = null;
        for(Book book : books){
            if(expensiveBook == null || book.getBasePrice() > expensiveBook.getBasePrice()){
                expensiveBook = book;
            }
        }
        return expensiveBook;
    }
    
    public void countBook(){
        int countTextBook = 0;
        int countReferenceBook = 0;
        for(Book book : books ){
            if(book instanceof TextBook){
                countTextBook ++;
            }else if(book instanceof ReferenceBook){
                countReferenceBook++;
            }
        }
        System.out.println("Total number of TextBook in the list " + countTextBook);
        System.out.println("Total number of ReferenceBook in the list " + countReferenceBook);
    }
    
    
    
    
    
}
