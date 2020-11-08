package test;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class test3 {

    public static void main(String[] args) {
        testRedirectOutput();
    }

    public static void testRedirectOutput() {
        try{
            PrintStream ps = new PrintStream(new FileOutputStream(
                    "G:/test/test/c.txt"));
            System.setOut(ps);
            System.out.println("ttt");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
