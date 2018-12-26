package main.stream.inoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输入输出流
 * @author DELL
 *
 */
public class TestFileInOutputStream
{
    public static void main(String[] args) throws IOException
    {

        fileInOutputStreamMethod();

    }

    /**
     * 文件字节输入输出流
     * 
     * @throws IOException
     */
    public static void fileInOutputStreamMethod() throws IOException
    {
        //创建file类文件
        File fileIn = new File("D:" + File.separator + "ZZZZZip" + File.separator + "fileIn");
        File fileOut = new File("D:" + File.separator + "ZZZZZip" + File.separator + "fileOut");
        if (!fileIn.exists())
        {
            fileIn.createNewFile();
        }
        //字节输入流对象
        FileInputStream fileInputStream = new FileInputStream(fileIn);
        //字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream(fileOut, true);
        fileOutputStream.write(System.getProperty("line.separator").getBytes());
        //read()读取字节返回长度给len
        int len;
        byte[] b = new byte[1024];
        while ((len = fileInputStream.read(b)) != -1)
        {
            //数据写入
            fileOutputStream.write(b, 0, len);
            System.out.println(new String(b, "UTF-8"));
        }

        //关闭流
        fileOutputStream.close();
        fileInputStream.close();
    }
}
