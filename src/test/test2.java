package test;

import java.io.*;

public class test2 {

    public static void main(String[] args) {
        testPrintWriter();
    }

    public static void testPrintStream() {
        try {
            FileOutputStream fos = new FileOutputStream("G:/test/test/a.txt");
            PrintStream pt = new PrintStream(fos);
            pt.println("白日依山尽");
            pt.println("黄河入海流");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void testPrintWriter() {
        try {
            FileWriter writer = new FileWriter("G:/test/test/b.txt");
            PrintWriter pw = new PrintWriter(writer);
            pw.println("哈哈哈哈");
            pw.println("zzzz");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
