package com.timbuchalka;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@gmail.com");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
