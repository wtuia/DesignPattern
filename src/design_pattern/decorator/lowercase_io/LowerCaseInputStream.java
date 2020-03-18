package design_pattern.decorator.lowercase_io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream  extends FilterInputStream{

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * I/O 装饰器
     */
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
    
    /**
     * 重写的read
     */
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for(int i = offset ; i < offset + result; i ++ ) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
