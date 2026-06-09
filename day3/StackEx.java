package day3;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("Btter Call Soul");
        books.push("Arkhem Night");
        books.push("Breaking Bad");

        System.out.println("Books :" +books);
        System.out.println("First Book is :" +books.peek());
        System.out.println("Deleting one book :"+" " +books.pop());;
        System.out.println(books);
    }
}
