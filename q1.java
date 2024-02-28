/*import java.util.*;

//creatng account class....

class Account {
    Scanner sc = new Scanner(System.in);

    private long account_no;
    private String name;
    private double balance;

    public Account() {

    }

    public Account(long account_no, String name, double balance) {
        this.account_no = account_no;
        this.balance = balance;
        this.name = name;
    }

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

    public void get_name() {
        System.out.println("Account holder name is " + this.name);
    }

    public void get_balance() {

        System.out.println("Account balance is " + this.balance);

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
        return "Account Number: " + this.account_no +
                ", Holder: " + this.name +
                ", Balance: " + this.balance;

    }

}
// Creating bank app.....

class BankApp {
    ArrayList<Account> obj = new ArrayList<>();

    public void createaccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your account Number");
        long account_no = sc.nextLong();

        System.out.println("Enter your initial diposit balance...");
        double balance = sc.nextDouble();

        Account acc = new Account(account_no, name, balance);
        obj.add(acc);
        System.out.println("Account created succesfully.....");
        

    }

    public Account find_account(long number) {
        for (Account acc : obj) {

            if (acc.get_account_no() == number) {
                
                return acc;
            }

        }
        return null;

    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = find_account(accountNumber);

        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.diposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = find_account(accountNumber);

        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdral(amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.print("  ");
            System.out.println("Account not found!");
        }
    }

    public void checkbalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = find_account(accountNumber);

        if (account != null) {

            account.get_balance();
        } else {

            System.out.println("Account not found!");
        }

    }
    public void details(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        Account account = find_account(accountNumber);

        if (account != null) {

            System.out.println(account);
        } else {

            System.out.println("Account not found!");
        }
        
      
    }

}

public class q1 {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        BankApp obj = new BankApp();
        Account obj1 = new Account();
        do {
            System.out.println("\nBank Account Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. print all details");
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
                case 4:
                    obj.checkbalance();

                    break;
                case 6:
                    System.out.println("Exiting application...");
                    break;
                case 5:
                    obj.details();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

}*/
