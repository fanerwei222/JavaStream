package main.stream.reader;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 字符串缓冲区中收集输出的字符流，可用于构造字符串
 * @author fanwei
 *
 */
public class TestStringReaderWriter
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            StringReader sr = new StringReader("just a test~");
            StringWriter sw = new StringWriter();
            int len;
            while ((len = sr.read()) != -1)
            {
                sw.write(len);
            }

            //这里展示了即使关闭了StringWriter流，但仍然能获取到数据，因为其close方法是一个空实现。
            sw.close();
            sr.close();
            System.out.println(sw.getBuffer().toString());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
