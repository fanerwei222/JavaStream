package main.stream.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文本字符输出流
 * @author fanwei
 *
 */
public class TestFileWriter
{
    public static void main(String[] args) throws IOException
    {
        fileWriterMethod();
    }

    private static void fileWriterMethod() throws IOException
    {
        //创建一个file类文件
        File writerFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "writerFile");
        if (!writerFile.exists())
        {
            writerFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(writerFile);
        String c = "hello world";
        fileWriter.write(c);

        fileWriter.close();
    }
}
