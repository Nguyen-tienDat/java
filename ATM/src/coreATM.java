import java.sql.SQLOutput;
import java.util.Scanner;

public class coreATM {
    private information info;
    public coreATM( information info) {
        this.info = info;
    }
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("_______DAZI ATM_______");
            System.out.println("__________________________________");
            System.out.println("WELCOME TO DAZI ATM");
            System.out.println("__________________________________");
            System.out.println("1. Cash out");
            System.out.println("2. Balance");
            System.out.println("3. Information query");
            System.out.println("4. Exit");

            System.out.println("Input your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if(info.deposit(amount)){
                        System.out.println("You have successfully deposited $"+amount);
                        System.out.println("Your new balance is $"+info.getBalance());
                    }
                    else{
                        System.out.println("You have not successfully deposited $"+amount+".Out of balance!");
                    }
                    break;

                case 2:
                    System.out.println("Your balance:  "+info.getBalance());
                    break;

                case 3:
                    System.out.println("Information query:");
                    System.out.println("ID: "+info.getId());
                    System.out.println("Name: "+info.getName());
                    System.out.println("__________________________________");
                    break;

                case 4:
                    System.out.println("Exit. Thank you for using DAZI ATM");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }
    }
}
