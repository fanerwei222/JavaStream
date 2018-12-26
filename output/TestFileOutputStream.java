package main.stream.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流
 * 
 * @author DELL
 *
 */
public class TestFileOutputStream
{
    public static void main(String[] args) throws IOException
    {

        fileOutputStreamMethod();

    }

    /**
     * 文件字节输出流
     * 
     * @throws IOException
     */
    public static void fileOutputStreamMethod() throws IOException
    {
        //创建一个file类文件
        File file = new File("D:" + File.separator + "ZZZZZip" + File.separator + "file");
        if (!file.exists())
        {
            file.createNewFile();
        }
        //创建一个字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //写入字符串数据
        fileOutputStream.write(new String("i love java ").getBytes());

        //关闭字节输出流
        fileOutputStream.close();
    }
}
