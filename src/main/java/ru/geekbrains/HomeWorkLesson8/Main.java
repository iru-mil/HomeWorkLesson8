package ru.geekbrains.HomeWorkLesson8;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File f1 = new File("1.txt");
        FileOutputStream file1 = new FileOutputStream(f1, false);
        String s1 = "The Internet was invented in the late 1960s by the US DDAR Projects Agency.";
        file1.write(s1.getBytes());
        file1.close();

        File f2 = new File("2.txt");
        FileOutputStream file2 = new FileOutputStream(f2, false);
        String s2 = "The idea of the electronic mailbox was born when users looked for a way to talk to each other electronically.";
        file2.write(s2.getBytes());
        file2.close();

        join(f1, f2);
    }

    public static void join(File f1, File f2) throws IOException {
        FileInputStream f1In = new FileInputStream(f1);
        FileOutputStream joined = new FileOutputStream("joined.txt", false);
        int a;
        while ((a = f1In.read()) != -1) {
            joined.write(a);
        }
        FileInputStream f2In = new FileInputStream(f2);
        int b;
        while ((b = f2In.read()) != -1) {
            joined.write(b);
        }
        f1In.close();
        f1In.close();
        joined.close();
    }
}
