package main.stream.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文本字符输入流
 * @author fanwei
 *
 */
public class TestFileReader
{

    public static void main(String[] args) throws IOException
    {
        fileReaderMethod();
    }

    private static void fileReaderMethod() throws IOException
    {
        //创建一个file类文件
        File readerFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "readerFile");
        if (!readerFile.exists())
        {
            readerFile.createNewFile();
        }
        FileReader fileReader = new FileReader(readerFile);
        char[] c = new char[1024];
        int len;
        while ((len = fileReader.read(c)) != -1)
        {
            System.out.println("内容为：" + new String(c));
        }
    }
}
