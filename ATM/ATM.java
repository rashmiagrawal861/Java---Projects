import java.util.*;
public class ATM {
    public static void main(String[]args) {
Scanner scn = new Scanner(System.in);
int balance = 5000;  // starting balance
int choice;
System.out.println(" Welcome to the ATM!");
do {
    System.out.println("\n 1) Check balance \n 2) Deposit \n 3) Withdraw \n 4) Exit ");
    System.out.println(" Choose an option: ");
    choice = scn.nextInt();
    switch(choice) {
        case 1:
        System.out.println(" Your balance is : " + balance);
        break;
        case 2:
        System.out.println(" Enter the amount to deposit: ");
        int deposit = scn.nextInt();
        balance+=deposit;
        System.out.println(" Successfully deposited" + deposit);
        break;
        case 3:
        System.out.println(" Enter the amount to withdraw: ");
        int withdraw = scn.nextInt();
        if(withdraw<=balance) {
            balance-=withdraw;
            System.out.println(" Successfully withdrew " + withdraw);
        }
        else {
            System.out.println(" Insufficient balance!");
        }
        break;
        case 4:
        System.out.println(" Thankyou for using the ATM! Have a good day. ");
        break;
        default:
        System.out.println(" Invalid option! Try again" );
    }
}while (choice!=4);
scn.close();
    }
    
}
