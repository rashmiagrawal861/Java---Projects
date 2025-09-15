import java.util.*;
public class Library {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Five books in the library
        String book1 = " Java Basics";
        String book2 = " Data Structures";
        String book3 = " Algorithms";
        String book4 = " Python";
        String book5 = " C ";
        boolean b1Available = true, b2Available = true, b3Available = true, b4Available = true, b5Available = true;
        int choice;
        System.out.println(" Welcome to the library!");
        do {
            System.out.println("\n 1) Show Available Books \n 2) Borrow a Book \n 3) Return a Book \n 4) Exit");
            System.out.println(" Choose an option: ");
            choice = scn.nextInt();
            switch(choice) {
                case 1:
                System.out.println(" Avialable Books:");
                if(b1Available)
                System.out.println(book1);
                if(b2Available)
                System.out.println(book2);
                if(b3Available)
                System.out.println(book3);
                if(b4Available)
                System.out.println(book4);
                if(b5Available)
                System.out.println(book5);
                break;
                case 2:
                System.out.println(" Choose a book to borrow: ");
                if (b1Available) System.out.println("1)" + book1);
                 if (b2Available) System.out.println("2)" + book2);
                  if (b3Available) System.out.println("3)" + book3);
                   if (b4Available) System.out.println("4)" + book4);
                    if (b5Available) System.out.println("5)" + book5);
                    System.out.println(" Enter book number");
                int borrow = scn.nextInt();
                if(borrow == 1 && b1Available) { b1Available = false;
                System.out.println(" You borrowed" + book1);}
            else if (borrow == 2 && b2Available) { b2Available = false;
                System.out.println(" You borrowed" + book2);}
                else if (borrow == 3 && b3Available) { b3Available = false;
                System.out.println(" You borrowed" + book3);}
                else if (borrow == 4 && b4Available) { b4Available = false;
                System.out.println(" You borrowed" + book4);}
                else if (borrow == 5 && b5Available) { b5Available = false;
                System.out.println(" You borrowed" + book5);}
                else
                System.out.println("Book not available!");
                break;
                case 3:
                 System.out.println(" Choose a book to return: ");
                if (b1Available) System.out.println("1)" + book1);
                 if (b2Available) System.out.println("2)" + book2);
                  if (b3Available) System.out.println("3)" + book3);
                   if (b4Available) System.out.println("4)" + book4);
                    if (b5Available) System.out.println("5)" + book5);
                System.out.println(" Enter book number ");
                int ret= scn.nextInt();
                if(ret == 1 && !b1Available) { b1Available = true;
                System.out.println(book1 + " was never borrowed!");}
                else if (ret == 2 && !b2Available) { b2Available = true;
                System.out.println( book2 + " was never borrowed!");}
                else if (ret == 3 && !b3Available) { b3Available = true;
                System.out.println(book3 + " was never borrowed!");}
                else if (ret == 4 && !b4Available) { b4Available = true;
                System.out.println(book4 + " was never borrowed!");}
                else if (ret == 5 && !b5Available) { b5Available = true;
                System.out.println(book5 + " was never borrowed!");}
                else
                System.out.println(" Invalid return!");
                break;
                case 4:
                System.out.println(" Goodbye! Have a good day.");
                break;
                default:
                System.out.println(" Invalid choice!");

            }
        } 
        while(choice!=4);
        scn.close();
    }
    
}
