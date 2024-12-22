package ws;

import java.util.Date;

public class BankAccount {
    private int id;
    private double balance;
    private Date creationDate;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.creationDate = new Date();
    }

    public BankAccount() {
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
