package day3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();

        names.offer("Nikhil");
        names.offer("Yeshuuu");
        names.offer("Pokale");

        System.out.println("Queue :" +names);
        System.out.println("First name is :" +names.peek());
    }
}
