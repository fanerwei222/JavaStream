package main.stream.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输出流
 * @author fanwei
 *
 */
public class TestByteArrayOutputStream
{
    // 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
    private static final byte[] ArrayLetters =
    { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72, 0x73,
            0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };

    public static void main(String[] args) throws IOException
    {

        byteArrayOutputStreamMethod();

    }

    /**
     *字节数组输出流
     * 
     * @throws IOException
     */
    public static void byteArrayOutputStreamMethod() throws IOException
    {
        //创建一个字节数组输出流对象
        ByteArrayOutputStream bao1 = new ByteArrayOutputStream();
        bao1.write(0x41);
        bao1.write(0x42);
        bao1.write(0x43);
        bao1.write('\n');
        // 将ArrayLetters数组中从“3”开始的后5个字节写入到baos中
        // 即对应写入“0x64, 0x65, 0x66, 0x67, 0x68”，即“defgh”
        bao1.write(ArrayLetters, 3, 5);

        // 计算长度
        int size = bao1.size();
        System.out.println("输出流长度 :" + size);

        //转换成byte[]数组
        byte[] buf = bao1.toByteArray();
        String bufStr = new String(buf, "UTF-8");
        System.out.println("bufStr :" + bufStr);

        // 将baos写入到另一个输出流中
        ByteArrayOutputStream bao2 = new ByteArrayOutputStream();
        bao1.writeTo(bao2);
        System.out.println("bao2 :" + bao2);

        bao1.flush();

        bao1.close();
    }
}
