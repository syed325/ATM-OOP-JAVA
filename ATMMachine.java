package ATMMachine;

import java.util.*;

class ATM{
    float Balance;
    int PIN = 3245;

    public void checkpin(){
        System.out.println("Enter your PIN; ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN ){
            menu();
        }else {
            System.out.println("Entered wrong Pin, Please Enter a valid Pin");
        }

    }
    public void menu(){
        System.out.println("==== Enter Your Choice ====");
        System.out.println("1. check Balance");
        System.out.println("2. Withdraw Balance");
        System.out.println("3. Deposit Balance");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt==1){
            checkBalance();
        }else if(opt==2){
            withdrawMoney();
        }else if (opt==3){
            depositMoney();
        } else if (opt==4) {
            return ;

        }
    }
public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();

    }


public  void withdrawMoney(){
    System.out.println("Enter Amount: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
        if (amount > Balance){
            System.out.println(" Insufficient Balance ");
            menu();
        }else {
            Balance = Balance - amount;
            System.out.println("Amount withdrawn Successfully!");
        }
        menu();
}


public void depositMoney(){
    System.out.println("Enter Amount: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount;
    System.out.println("Amount Deposited Successfully!");
    menu();
}



}



public class ATMMachine {
    public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();
    }
}
