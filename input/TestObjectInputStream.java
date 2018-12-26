package main.stream.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import main.stream.object.Person;

/**
 * 对象字节输入流
 * @author fanwei
 *
 */
public class TestObjectInputStream
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        objectInputStreamMethod();

    }

    /**
     *对象字节输入流
     * 
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void objectInputStreamMethod() throws IOException, ClassNotFoundException
    {
        //创建file类文件
        File objFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "objFile");
        if (!objFile.exists())
        {
            objFile.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(objFile);
        //创建一个字节输入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        @SuppressWarnings("unchecked")
        List<Person> list = (List<Person>) objectInputStream.readObject();
        for (Person p : list)
        {
            System.out.println(p);
        }

        //关闭字节输入流
        objectInputStream.close();
        fileInputStream.close();
    }
}
