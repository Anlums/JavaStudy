package IOstream;
import java.io.*;
public class BufferedInputStreamDemo {
    // 二进制文件拷贝（字节流 + 缓冲区）
    // 处理图片、音乐或视频时，必须使用字节流。
    // 为了速度，我们会套上一层 Buffered。
    public static void main(String[] args) {
        File src = new File("D:\\java\\IdeaProjects\\new_study\\src\\main\\resources\\API\\String.png");
        File dest = new File("D:\\java\\IdeaProjects\\new_study\\src\\main\\resources\\API\\String_copy.jpg");
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[1024];  // 创建缓冲区数组，大小1024字节（1KB）
            int len;                          // 用于存储每次实际读取的字节数
            while((len = bis.read(buffer)) != -1){  // 循环读取，直到文件末尾
                bos.write(buffer, 0, len);   // 将读取到的数据写入目标文件
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
