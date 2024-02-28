import java.util.*;
import java.util.*;

//creatng account class....

// Creating bank app.....

public class q4aa {
    public static long account;
    public static String nam;
    public static double bal;

    public q4aa() {

    }

    public q4aa(long account_no, String name, double balance) {
        this.account = account_no;
        this.bal = balance;
        this.nam = name;
    }

    public void createaccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your account Number");
        long account_no = sc.nextLong();

        System.out.println("Enter your initial diposit balance...");
        double balance = sc.nextDouble();

        q4aa obj = new q4aa(account_no, name, balance);

        System.out.println("Account created succesfully.....");

    }

    public long get_account_no() {

        return this.account;
    }

    public String get_name() {
        return this.nam;
    }

    public double get_balance() {

        return this.bal;

    }

    public static void diposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        bal = bal + amount;

        System.out.println("Amount diposited successfully");

    }

    public static void withdral() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > bal) {
            System.out.println("Insufficient Balance...");
        } else {
            bal = bal - amount;

            System.out.println("Amount successfully withdrawn ! keep smiling");

        }
    }

    @Override
    public String toString() {
        return "Account Number: " + account +
                ", Holder: " + nam +
                ", Balance: " + bal;

    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        q4aa obj = new q4aa();

        do {
            System.out.println("\nBank Account Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");

            System.out.println("4. print all details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.createaccount();
                    break;
                case 2:

                    diposit();
                    break;
                case 3:
                    withdral();
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;
                case 4:
                    System.out.println(obj.toString());

                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

}
