package main.stream.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流到字节流的桥接
 * @author fanwei
 *
 */
public class TestOutputStreamWriter
{
    private static final String CharsetName = "utf-8";

    //private static final String CharsetName = "gb2312";

    public static void main(String[] args)
    {
        testWrite();
    }

    /**
     * OutputStreamWriter 演示函数
     *
     */
    private static void testWrite()
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
            // 创建FileOutputStream对应OutputStreamWriter：将字节流转换为字符流，即写入out1的数据会自动由字节转换为字符。
            OutputStreamWriter out1 = new OutputStreamWriter(new FileOutputStream(inputStreamReaderFile), CharsetName);
            // 写入10个汉字
            out1.write("字节流转为字符流示例");
            // 向“文件中”写入"0123456789"+换行符
            out1.write("0123456789\n");

            out1.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
