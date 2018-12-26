package main.stream.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import main.stream.object.Person;

/**
 * 对象字节输出流
 * @author fanwei
 *
 */
public class TestObjectOutputStream
{
    public static void main(String[] args) throws IOException
    {

        objectOutputStreamMethod();

    }

    /**
     *对象字节输出流
     * 
     * @throws IOException
     */
    public static void objectOutputStreamMethod() throws IOException
    {
        //创建file类文件
        File objFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "objFile");
        if (!objFile.exists())
        {
            objFile.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(objFile);
        //创建一个字节输出流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Tom", 22, "0002"));
        list.add(new Person("Jack", 22, "0003"));
        objectOutputStream.writeObject(list);

        //关闭字节输出流
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
