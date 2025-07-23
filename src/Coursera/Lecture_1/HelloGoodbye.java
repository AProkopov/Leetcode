package Coursera.Lecture_1;

public class HelloGoodbye {

    public static void main(String[] args) {

        String hello = "Hello";
        String goodBye = "Goodbye";
        String and = "and";

        String nameOne = args[0];
        String nameTwo = args[1];

        System.out.println(hello + " " + nameOne + " " + and + " " + nameTwo + ".");
        System.out.println(goodBye + " " + nameTwo + " " + and + " " + nameOne + ".");
    }
}
