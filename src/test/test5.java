package test;

import java.io.*;

public class test5 {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("G:/test/b.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String msg = null;
        msg = reader.readLine();
        while (msg != null) {
            System.out.println(msg);
            msg = reader.readLine();
        }
    }
}
