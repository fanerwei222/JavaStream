package main.stream.output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲字节输出流
 * @author fanwei
 *
 */
public class TestBufferedOutputStream
{
    // 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
    private static final byte[] ArrayLetters =
    { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72, 0x73,
            0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };

    public static void main(String[] args) throws IOException
    {

        bufferedOutputStreamMethod();

    }

    /**
     *缓冲字节输出流
     * 
     * @throws IOException
     */
    public static void bufferedOutputStreamMethod() throws IOException
    {
        //创建file类文件
        File bufferedFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "bufferedFile");
        if (!bufferedFile.exists())
        {
            bufferedFile.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedFile);
        //创建一个字节输出流对象
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(ArrayLetters);
        bufferedOutputStream.write('\n');

        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        fileOutputStream.close();
    }
}
