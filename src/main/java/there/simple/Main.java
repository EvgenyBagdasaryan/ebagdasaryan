package there.simple;

import there.simple.invocationHandler.Man;

public class Main {
    public static void main(String[] args) {

        Man df = new Man("Bob", 23, "Los-Angeles", "USA");

        df.introduce("Sam");

        System.out.println("Hello world!");
    }
}