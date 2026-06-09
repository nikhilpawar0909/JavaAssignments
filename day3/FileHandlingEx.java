package day3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingEx {
    public static void main(String[] args) throws Exception {
        File f = new File("student.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter("student.txt");
        fw.write("Hello Nikhil \n");
        fw.write("Welcome to file Handling");
        fw.close();

        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}
