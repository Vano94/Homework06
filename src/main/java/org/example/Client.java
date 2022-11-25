package org.example;

public class Client {
    private String name;
    private double balance;
    private Integer personalCode;

    public Client(String name, double balance, Integer personalCode) {
        this.name = name;
        this.balance = balance;
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    public double difference (double firstAmount, double secondAmount) {
        return firstAmount - secondAmount;
    }

    public String sayTere(String i) {
        return i;
    }
}