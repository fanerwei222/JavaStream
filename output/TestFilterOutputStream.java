package main.stream.output;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 过滤器字节输出流
 * @author fanwei
 *
 */
public class TestFilterOutputStream
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        filterOutputStreamMethod();

    }

    /**
     *过滤器字节输出流
     * 
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void filterOutputStreamMethod() throws IOException, ClassNotFoundException
    {
        //创建file类文件
        File filterFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "filterFile");
        if (!filterFile.exists())
        {
            filterFile.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(filterFile);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(199);
        dataOutputStream.writeInt(299);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeDouble(99.336);
        dataOutputStream.writeUTF("hello dataoutputstream!");

        dataOutputStream.flush();

        //关闭字节输出流
        dataOutputStream.close();
        fileOutputStream.close();
    }
}
