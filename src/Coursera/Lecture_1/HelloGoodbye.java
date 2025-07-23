package Coursera.Lecture_1;

public class HelloGoodbye {

    private static String hello = "Hello";
    private static String goodBye = "Goodbye";
    private static String and = "and";

    public static void main(String[] args) {

        String nameOne = args[0];
        String nameTwo = args[1];

        System.out.println(hello + " " + nameOne + " " + and + " " + nameTwo);
        System.out.println(goodBye + " " + nameOne + " " + and + " " + nameTwo);
    }
}
