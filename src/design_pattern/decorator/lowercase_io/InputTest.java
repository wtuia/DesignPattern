package design_pattern.decorator.lowercase_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;
        String file = "F:/ME2018WorkSpace/DesignPattern/src/decorator_pattern/lowercase_io/test.txt";
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
            
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
