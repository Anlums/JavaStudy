package IOstream;
import  java.io.*;
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\java\\IdeaProjects\\new_study\\src\\main\\java\\IOstream\\input.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            // 1. 跳到文件的第 2 个字节处
            raf.seek(2);

            // 2. 在此处写入数据（会覆盖原有位置的数据）
            //raf.writeUTF("这是从第2字节开始插入的内容");
            String content = "这是从第2字节开始插入的内容";
            raf.write(content.getBytes("UTF-8"));

            // 3. 获取当前指针位置
            long pointer = raf.getFilePointer();
            System.out.println("当前文件指针位置: " + pointer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
