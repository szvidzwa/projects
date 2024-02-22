
package banking.system;
import java.util.Scanner;

public class BankingSystem {


    public static void main(String[] args) {
        //Welcome User
        System.out.println("Welcome to our private Online Banking System");
        //Initialize variables
        double checking = 0;
        String answer = "";
        //Output transaction options and read the answer
        Scanner input = new Scanner(System.in);
        answer = options();
        //Execute while answer is not d
        while (!answer.equalsIgnoreCase("d")) {
        if (answer.equalsIgnoreCase("a")) {
            System.out.println("How much do you want to deposit?");
            double deposit = input.nextDouble();
            checking = deposit;
            System.out.println("You have successfully deposited $" +deposit);    
        }
        else if (answer.equalsIgnoreCase("b")) {
            System.out.println("Please deposit money first!");
            System.out.println("How much do you want to deposit?: ");
            double deposit = input.nextDouble();
            checking = deposit;
            System.out.println("You have successfully deposited $" +deposit); 
        }
        else if (answer.equalsIgnoreCase("c")) {
            System.out.println("Please deposit money first!");
            System.out.println("How much money do you want to deposit?: ");
            double deposit = input.nextDouble();
            checking = deposit;
            System.out.println("You have successfully deposited $" +deposit); 
        } else {
            System.out.println("Invalid option. Please choose a valid option.");
        }
        //Keep looping until user selects to exit
        do {
            answer = options();
        if (answer.equalsIgnoreCase("a")) {
            System.out.println("How much do you want to deposit?");
            double deposit = input.nextDouble();
            checking += deposit;
            System.out.println("You have successfully deposited $" +deposit);
            System.out.println("Your checking balance is now $" +checking);
        }
        else if (answer.equalsIgnoreCase("b")) {
            System.out.println("How much do you want to withdraw?: ");
            double withdraw = input.nextDouble();
            checking = checking - withdraw;
            System.out.println("You have withdrawn $" +withdraw);
            System.out.println("Your checking balance is now $" +checking);
        }
        else if (answer.equalsIgnoreCase("c")) {
            System.out.println("How much do you want to send?");
            double send = input.nextDouble();
            checking = checking - send;
            System.out.println("You have sent $" +send);
            System.out.println("Your checking balance is now $" +checking);
        }
        }
        while (!answer.equalsIgnoreCase("d"));
        System.out.println("Thank you for using our online banking program. Goodbye!");
        }
    } //End of main

        //Transaction options method
        private static String options() {
        System.out.println("\nWhat would you like to do:");
        System.out.println("a. Deposit funds into the account");
        System.out.println("b. Withdraw funds from the account");
        System.out.println("c. Send money to someone/Pay bill");
        System.out.println("d. Exit");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return answer;
    }
}       //End of class
