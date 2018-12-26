package main.stream.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 缓冲字节输入流
 * @author DELL
 *
 */
public class TestBufferedInputStream
{
    private static final int LEN = 5;

    public static void main(String[] args) throws IOException
    {

        bufferedInputStreamMethod();

    }

    /**
     *缓冲字节输入流
     * 
     * @throws IOException
     */
    public static void bufferedInputStreamMethod() throws IOException
    {
        //创建file类文件
        File bufferedFile = new File("D:" + File.separator + "ZZZZZip" + File.separator + "bufferedFile");
        if (!bufferedFile.exists())
        {
            bufferedFile.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(bufferedFile);
        //创建一个字节输入流对象
        BufferedInputStream in = new BufferedInputStream(fileInputStream);
        // 从字节流中读取5个字节。“abcde”，a对应0x61，b对应0x62，依次类推...
        for (int i = 0; i < LEN; i++)
        {
            // 若能继续读取下一个字节，则读取下一个字节
            if (in.available() >= 0)
            {
                // 读取“字节流的下一个字节”
                int temp = in.read();
                System.out.printf("%d : 0x%s\n", i, Integer.toHexString(temp));
            }
        }
        if (!in.markSupported())
        {
            System.out.println("make not supported!");
        }

        // 标记“当前索引位置”，即标记第6个位置的元素--“f”
        // 1024对应marklimit
        in.mark(1024);
        // 跳过22个字节
        in.skip(22);
        byte[] buf = new byte[LEN];
        in.read(buf, 0, LEN);
        // 将buf转换为String字符串
        String bufStr1 = new String(buf, "UTF-8");
        System.out.println(bufStr1);

        // 重置“输入流的索引”为mark()所标记的位置，即重置到“f”处
        in.reset();
        // 从“重置后的字节流”中读取5个字节到buf中。即读取“fghij”
        in.read(buf, 0, LEN);
        String bufStr2 = new String(buf, "UTF-8");
        System.out.println(bufStr2);

        //关闭流
        in.close();
        fileInputStream.close();
    }
}
