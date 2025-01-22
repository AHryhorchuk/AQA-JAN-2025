package org.prog.poly.homework;

public class Phone {

    public String type;

    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();

        phoneOne.type = "IOS";
        phoneTwo.type = "Android";

        phoneOne.unlock();
        phoneTwo.unlock();
        phoneOne.call();
        phoneTwo.call();

//        System.out.println("phone 1 is " + phoneOne.type);
//        System.out.println("phone 2 is " + phoneTwo.type);

    }
    public void unlock() {
        System.out.println(type + " is unlocked");
    }
    public void call() {
        System.out.println(type + " is calling");
    }
}
