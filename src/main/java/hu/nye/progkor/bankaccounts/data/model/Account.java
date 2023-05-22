package hu.nye.progkor.bankaccounts.data.model;

import java.util.Objects;

public class Account {

    private Long id;
    private String owner;
    private Type type;
    private String openDate;
    private int balance;

    public Account(Long id, String owner, Type type, String openDate, int balance) {
        this.id = id;
        this.owner = owner;
        this.type = type;
        this.openDate = openDate;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(id, account.id) && Objects.equals(owner, account.owner) && type == account.type && Objects.equals(openDate, account.openDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, type, openDate, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", type=" + type +
                ", openDate='" + openDate + '\'' +
                ", balance=" + balance +
                '}';
    }
}
