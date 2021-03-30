package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",10.0 ,"Bob Brown", "email@email.com","(543) 123-4567");
        System.out.println(bobsAccount.getBalance());
        //bobsAccount.deposit(100.0);
        //bobsAccount.withdrawal(10.5);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@hola.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());

    }
}
