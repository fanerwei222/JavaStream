package main.stream.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件字节输入流
 * @author fanwei
 *
 */
public class TestFileInputStream
{

    public static void main(String[] args) throws IOException
    {

        fileInputStreamMethod();

    }

    /**
     * 文件字节输入流
     * 
     * @throws IOException
     */
    public static void fileInputStreamMethod() throws IOException
    {
        //创建一个file类文件
        File file = new File("D:" + File.separator + "ZZZZZip" + File.separator + "file");
        if (!file.exists())
        {
            file.createNewFile();
        }
        //创建一个字节输入流对象
        FileInputStream fileInputStream = new FileInputStream(file);
        //read() 读取字节返回长度到len
        int len;
        byte[] b = new byte[1024 * 5];
        while ((len = fileInputStream.read(b)) != -1)
        {
            System.out.print(new String(b, "UTF-8"));
            System.out.print(len);
        }
        //关闭字节输入流
        fileInputStream.close();
    }
}
