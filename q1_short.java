import java.util.*;
import java.util.*;

//creatng account class....

class Account {
    Scanner sc = new Scanner(System.in);

    private long account_no;
    private String name;
    private double balance;

    // public Account() {

    // }

    // public Account(long account_no, String name, double balance) {
    // this.account_no = account_no;
    // this.balance = balance;
    // this.name = name;
    // }

    public void set_account_no(long account_no) {
        this.account_no = account_no;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_balance(double balance) {
        this.balance = balance;
    }

    public long get_account_no() {

        return this.account_no;
    }

    public String get_name() {
        return this.name;
    }

    public double get_balance() {

        return this.balance;

    }

    public void diposit(double amount) {

        this.balance = this.balance + amount;
        set_balance(this.balance);
        System.out.println("Amount diposited successfully");

    }

    public void withdral(double amount) {

        if (amount > this.balance) {
            System.out.println("Insufficient Balance...");
        } else {
            this.balance = this.balance - amount;
            set_balance(this.balance);
            System.out.println("Amount successfully withdrawn ! keep smiling");

        }
    }

    @Override
    public String toString() {
        return "Account Number: " + get_account_no() +
                ", Holder: " + get_name() +
                ", Balance: " + get_balance();

    }

}
// Creating bank app.....

class BankApp extends Account {

    public void createaccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your account Number");
        long account_no = sc.nextLong();

        System.out.println("Enter your initial diposit balance...");
        double balance = sc.nextDouble();

        set_account_no(account_no);
        set_balance(balance);
        set_name(name);

        System.out.println("Account created succesfully.....");

    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        diposit(amount);
        System.out.println("Deposit successful!");

    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        withdral(amount);
        System.out.println("Withdrawal successful!");

    }

    public void details() {

        System.out.println(toString());

    }

}

public class q1_short {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        BankApp obj = new BankApp();

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
                    obj.deposit();
                    break;
                case 3:
                    obj.withdraw();
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;
                case 4:
                    obj.details();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

}
