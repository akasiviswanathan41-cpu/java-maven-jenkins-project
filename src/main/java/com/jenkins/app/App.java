package com.jenkins.app;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String greeting() {
        return "Welcome to Jenkins Maven Project!";
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.greeting());
        System.out.println("Addition: " + app.add(10, 20));
        System.out.println("Multiplication: " + app.multiply(5, 4));
    }
}
