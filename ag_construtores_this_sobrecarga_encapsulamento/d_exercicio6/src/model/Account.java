package model;

public class Account {

    private static final double TAX = 5.00;

    private int number;
    private String name;
    private double balance;

    public Account() {

    }

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double deposit(double balance) {
        return balance += balance;
    }

    public double withdraw(double balance) {
        return balance -= balance + TAX;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + name + ", Balance: $" + String.format("%.2f", balance);
    }
}
