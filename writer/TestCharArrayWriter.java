package main.stream.writer;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * 字符数组输出流
 * @author fanwei
 *
 */
public class TestCharArrayWriter
{
    // 对应英文字母“abcdefghijklmnopqrstuvwxyz”
    private static final char[] ArrayLetters = new char[]
    { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };

    public static void main(String[] args) throws IOException
    {

        charArrayWriterMethod();
    }

    private static void charArrayWriterMethod() throws IOException
    {
        CharArrayWriter caw = new CharArrayWriter();
        // 写入“A”个字符
        caw.write("A");
        // 写入字符串“BC”个字符
        caw.write("BC");
        //System.out.printf("caw=%s\n", caw);
        // 将ArrayLetters数组中从“3”开始的后5个字符(defgh)写入到caw中。
        caw.write(ArrayLetters, 3, 5);
        //System.out.printf("caw=%s\n", caw);

        // (01) 写入字符0
        // (02) 然后接着写入“123456789”
        // (03) 再接着写入ArrayLetters中第8-12个字符(ijkl)
        caw.append("0").append("123456789").append(String.valueOf(ArrayLetters), 8, 12);
        System.out.printf("caw=%s\n", caw);

        // 计算长度
        int size = caw.size();
        System.out.printf("size=%s\n", size);

        // 转换成char[]数组
        char[] chf = caw.toCharArray();
        System.out.printf("buf=%s\n", String.valueOf(chf));

        // 将caw写入到另一个输出流中
        CharArrayWriter caw2 = new CharArrayWriter();
        caw.writeTo(caw2);
        System.out.printf("caw2=%s\n", caw2);

        caw2.close();
        caw.close();
    }
}
