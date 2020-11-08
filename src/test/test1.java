package test;

import java.io.File;
import java.io.FileFilter;
import java.sql.SQLOutput;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {
        File dir = new File("G:/test/test");
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                System.out.println(file);
                return true;
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
