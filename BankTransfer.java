class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void transfer(Account receiver, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transfer successful!");
            System.out.println("Transferred: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println(name + " Balance: ₹" + balance);
    }
}

public class BankTransfer {
    public static void main(String[] args) {
        Account a1 = new Account("Rahul", 5000);
        Account a2 = new Account("Amit", 2000);

        a1.transfer(a2, 1500);

        a1.display();
        a2.display();
    }
}
