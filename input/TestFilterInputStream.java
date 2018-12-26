package main.stream.input;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 过滤器字节输入流
 * @author DELL
 *
 */
public class TestFilterInputStream
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        filterInputStreamMethod();

    }

    /**
     *过滤器字节输入流
     * 
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void filterInputStreamMethod() throws IOException, ClassNotFoundException
    {
        //创建file类文件
        File filterFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "filterFile");
        if (!filterFile.exists())
        {
            filterFile.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(filterFile);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int a = dataInputStream.readInt();
        int x = dataInputStream.readInt();
        boolean b = dataInputStream.readBoolean();
        double c = dataInputStream.readDouble();
        String d = dataInputStream.readUTF();
        System.out.println("a int is " + a);
        System.out.println("x int is " + x);
        System.out.println("second string is " + b);
        System.out.println("third boolean is " + c);
        System.out.println("fourth utf is " + d);

        //关闭字节输入流
        dataInputStream.close();
        fileInputStream.close();
    }
}
