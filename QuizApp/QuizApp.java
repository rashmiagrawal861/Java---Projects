import java.util.*;
public class quizapp {
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int score = 0;
    System.out.println(" Welcome to the Quiz! Wishing yo all the very best");

    // Question 1
    System.out.println(" 1) Which planet is known as Red Planet?");
    //Options
    System.out.println(" a) Venus\n  b) Mars \n  c) Jupiter\n  d) Saturn");
    System.out.println(" Your answer: ");
    char ans1 = 
    scn.next().toLowerCase().charAt(0);
    if(ans1 == 'b') score++;

    // Question 2 
    System.out.println(" \n 2) Who is the current CEO of Tesla(as of 2025)? ");

    System.out.println(" a) Elon Musk\n b) Sundar Pichai\n c) Jeff Bezos\n d) Tim Cook");
    char ans2 =
    scn.next().toLowerCase().charAt(0);
    if(ans2 == 'a') score++;

    // Question 3
    System.out.println("\n 3) Which country won the FIFA World Cup in 2022?");
    System.out.println(" a) France\n b) Argentina\n c) Brazil\n d) Germany");
    char ans3 =
    scn.next().toLowerCase().charAt(0);
    if(ans3 == 'b') score++;

    // Question 4
    System.out.println("\n Who is known as the father of Computer?");
    System.out.println(" a) Charles Babbage\n b) Albert Einstein\n c) Alan Turing\n d) Henry Moseley");
    char ans4 =
    scn.next().toLowerCase().charAt(0);
    if(ans4 == 'a') score++;

    // Qestion 5 
    System.out.println(" \n Which language is used for Android development?");
    System.out.println(" a) Python\n b) Java\n c) C++\n d) C");
    char ans5 =
    scn.next().toLowerCase().charAt(0);
    if(ans5 == 'b') score++;

    // Final result
    System.out.println("\n Quiz Over! Good Job!");
    System.out.println(" Your final score: " + score + "/5");
     scn.close();

   } 
    
}  
