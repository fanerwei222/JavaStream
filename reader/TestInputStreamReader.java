package main.stream.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从字节流到字符流的桥接器
 * @author fanwei
 *
 */
public class TestInputStreamReader
{
    private static final String CharsetName = "utf-8";

    //private static final String CharsetName = "gb2312";

    public static void main(String[] args)
    {
        testRead();
    }

    /**
     * InputStreamReader 演示程序
     */
    private static void testRead()
    {
        try
        {
            //创建一个file类文件
            File inputStreamReaderFile = new File("D:" + File.separator + "ZZZZZip" + File.separator
                    + "inputStreamReaderFile");
            if (!inputStreamReaderFile.exists())
            {
                inputStreamReaderFile.createNewFile();
            }
            InputStreamReader in1 = new InputStreamReader(new FileInputStream(inputStreamReaderFile), CharsetName);

            // 测试read()，从中读取一个字符
            char c1 = (char) in1.read();
            System.out.println("c1=" + c1);

            // 测试skip(long byteCount)，跳过4个字符
            in1.skip(6);

            // 测试read(char[] cbuf, int off, int len)
            char[] buf = new char[10];
            in1.read(buf, 0, buf.length);
            System.out.println("buf=" + (new String(buf)));

            in1.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
