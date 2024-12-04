
package oop_exercise8;

import java.util.Scanner;


public class TextBook extends Book {
    private String subject;
    
    public TextBook(String id, String title, double basePrice ){
        super(id, title, basePrice);
        this.subject = subject;
    }
    
    public TextBook(){};
    
    @Override
    public double calculatePrice(){
        return getBasePrice() * 1.1;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("ID : " + getId() + ", Title :" + getTitle() + ", BasePrice : " + calculatePrice() + ", Subject :" + subject);
        
    }
    
    Scanner sc = new Scanner(System.in);
    public void addBook(){
        while (true) {
            try {
                System.out.println("Enter id: ");
                String id = sc.nextLine();
                setId(id);

                System.out.println("Enter title book: ");
                String title = sc.nextLine();
                setTitle(title);

                System.out.println("Enter base price: ");
                double price = sc.nextDouble();
                setBasePrice(price);

                sc.nextLine();
                System.out.println("Enter subject: ");
                subject = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid.Try again");
                sc.nextLine();
            }
        }
    }
   
}
