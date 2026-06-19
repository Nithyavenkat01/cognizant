package com.cognizant.singleton;

public class TestLogger {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");

        System.out.println("Are both objects same?");

        if (logger1 == logger2) {
            System.out.println("Yes, only one Logger object exists.");
        } else {
            System.out.println("No, multiple Logger objects exist.");
        }
    }
}