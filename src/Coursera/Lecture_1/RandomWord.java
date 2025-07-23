package Coursera.Lecture_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;

public class RandomWord {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            list.add(word);
        }

        System.out.println(list.get(0));
    }

}
