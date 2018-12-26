package main.stream.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 字符打印输出流
 * @author fanwei
 *
 */
public class TestPrintWriter
{
    public static void main(String[] args)
    {

        // 下面3个函数的作用都是一样：都是将字母“abcde”写入到文件“file.txt”中。
        // 任选一个执行即可！
        testPrintWriterConstrutor1();
        //testPrintWriterConstrutor2() ;
        //testPrintWriterConstrutor3() ;

        // 测试write(), print(), println(), printf()等接口。
        testPrintWriterAPIS();
    }

    /**
     * PrintWriter(OutputStream out) 的测试函数
     *
     * 函数的作用，就是将字母“abcde”写入到文件“file.txt”中
     */
    private static void testPrintWriterConstrutor1()
    {
        final char[] arr =
        { 'a', 'b', 'c', 'd', 'e' };
        try
        {
            // 创建文件“file.txt”的File对象
            File file = new File("D:" + File.separator + "ZZZZZip" + File.separator + "printWriterFile");
            // 创建文件对应FileOutputStream
            PrintWriter out = new PrintWriter(new FileOutputStream(file));
            // 将“字节数组arr”全部写入到输出流中
            out.write(arr);
            // 关闭输出流
            out.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * PrintWriter(File file) 的测试函数
     *
     * 函数的作用，就是将字母“abcde”写入到文件“file.txt”中
     */
    private static void testPrintWriterConstrutor2()
    {
        final char[] arr =
        { 'a', 'b', 'c', 'd', 'e' };
        try
        {
            File file = new File("D:" + File.separator + "ZZZZZip" + File.separator + "printWriterFile");
            PrintWriter out = new PrintWriter(file);
            out.write(arr);
            out.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * PrintWriter(String fileName) 的测试函数
     *
     * 函数的作用，就是将字母“abcde”写入到文件“file.txt”中
     */
    private static void testPrintWriterConstrutor3()
    {
        final char[] arr =
        { 'a', 'b', 'c', 'd', 'e' };
        try
        {
            PrintWriter out = new PrintWriter("D:" + File.separator + "ZZZZZip" + File.separator + "printWriterFile");
            out.write(arr);
            out.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 测试write(), print(), println(), printf()等接口。
     */
    private static void testPrintWriterAPIS()
    {
        final char[] arr =
        { 'a', 'b', 'c', 'd', 'e' };
        try
        {
            // 创建文件对应FileOutputStream
            PrintWriter out = new PrintWriter("D:" + File.separator + "ZZZZZip" + File.separator
                    + "printWriterOtherFile");

            // 将字符串“hello PrintWriter”+回车符，写入到输出流中
            out.println("hello PrintWriter");
            // 将0x41写入到输出流中
            // 0x41对应ASCII码的字母'A'，也就是写入字符'A'
            out.write(0x41);
            // 将字符串"65"写入到输出流中。
            // out.print(0x41); 等价于 out.write(String.valueOf(0x41));
            out.print(0x41);
            // 将字符'B'追加到输出流中
            out.append('B').append("CDEF");

            // 将"CDE is 5" + 回车  写入到输出流中
            String str = "GHI";
            int num = 5;
            out.printf("%s is %d\n", str, num);

            out.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
