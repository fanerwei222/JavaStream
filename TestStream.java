package main.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.FilterReader;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Stream测试类
 * @author DELL
 *
 */
public class TestStream
{

    /*** 字节输入流（抽象类）（读操作） **/
    private InputStream inputStream;
    /*** 字节输出流（抽象类）（读操作） **/
    private OutputStream outputStream;
    /*** 字符输入流（抽象类）（写操作） **/
    private Reader reader;
    /*** 字符输出流（抽象类）（写操作） **/
    private Writer writer;

    /*********************字节输入流start **********************************/
    /*** 文件字节输入流 **/
    private FileInputStream fileInputStream;
    /*** 对象字节输入流 **/
    private ObjectInputStream objectInputStream;
    /*** 过滤器字节输入流 **/
    private FilterInputStream filterInputStream;

    /*** 缓冲字节输入流 **/
    private BufferedInputStream bufferedInputStream;
    /*** 数据字节输入流 **/
    private DataInputStream dataInputStream;
    /*** 字节回退输入流 **/
    private PushbackInputStream pushbackInputStream;
    /*** 顺序字节输入流 **/
    private SequenceInputStream sequenceInputStream;
    /*** 字节数组输入流 **/
    private ByteArrayInputStream byteArrayInputStream;
    /*** 管道字节输入流 **/
    private PipedInputStream pipedInputStream;
    /*********************字节输入流end **********************************/

    /*********************字符输入流start **********************************/
    /*** 字符数组输入流 **/
    private CharArrayReader charArrayReader;
    /*** 字符缓冲输入流 **/
    private BufferedReader bufferedReader;
    /*** 字符行输入流 **/
    private LineNumberReader lineNumberReader;
    /*** 过滤字符输入流 **/
    private FilterReader filterReader;
    /*** 从字节流到字符流的桥接器 **/
    private InputStreamReader inputStreamReader;
    /*** 文本字符输入流 **/
    private FileReader fileReader;
    /*** 字符输入流**/
    private StringReader stringReader;
    /*** 管道字符输入流**/
    private PipedReader pipedReader;
    /*********************字符输入流end **********************************/

    /*********************字节输出流start **********************************/
    /*** 文件字节输出流 **/
    private FileOutputStream fileOutputStream;
    /*** 对象字节输出流 **/
    private ObjectOutputStream objectOutputStream;
    /*** 过滤器字节输出流 **/
    private FilterOutputStream filterOutputStream;

    /*** 缓冲字节输出流 **/
    private BufferedOutputStream bufferedOutputStream;
    /*** 数据字节输出流 **/
    private DataOutputStream dataOutputStream;
    /*** 字节数组输出流 **/
    private ByteArrayOutputStream byteArrayOutputStream;
    /*** 管道字节输出流 **/
    private PipedOutputStream pipedOutputStream;
    /*********************字节输出流end **********************************/

    /*********************字符输出流start **********************************/
    /*** 字符数组输出流 **/
    private CharArrayWriter charArrayWriter;
    /*** 字符缓冲输出流 **/
    private BufferedWriter bufferedWriter;
    /*** 过滤字符输出流 **/
    private FilterWriter filterWriter;
    /*** 文本字符输出流 **/
    private FileWriter fileWriter;
    /*** 字符流到字节流的桥接 **/
    private OutputStreamWriter outputStreamWriter;
    /*** 字符打印输出流 **/
    private PrintWriter printWriter;
    /*** API说明：在字符串缓冲区中收集输出的字符流，可用于构造字符串， 关闭流无效，关闭后调用其他方法不会报异常 **/
    private StringWriter stringWriter;
    /*** 管道字符输出流**/
    private PipedWriter pipedWriter;

    /*********************字符输出流end 
     * @throws IOException **********************************/

    public static void main(String[] args) throws IOException
    {

    }
}
