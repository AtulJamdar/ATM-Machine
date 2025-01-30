import java.util.*;


 class ATM {

    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }else{
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            WithdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if (opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance = Balance - amount;
            System.out.println("Money withdrawl successful");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited successfully.");
        menu();
    }
}
public class ATMMachine {

    public static void main(String args[]){

        ATM obj = new ATM();
        obj.checkpin();
        
    }
}