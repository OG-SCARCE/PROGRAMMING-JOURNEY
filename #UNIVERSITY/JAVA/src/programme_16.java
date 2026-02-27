class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingAccount extends Account {

    SavingAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(10000);
        CurrentAccount ca = new CurrentAccount(10000);

        System.out.println("Saving Account Interest: " + sa.calculateInterest());
        System.out.println("Current Account Interest: " + ca.calculateInterest());
    }
}