package IOstream;
import java.io.*;

public class BufferedReaderDemo {
    //文本文件读写（字符流 + 缓冲区）
    //这是处理 .txt, .java, .html 等文件的首选方式。
    //使用 BufferedReader 可以按行读取，效率极高。
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\IdeaProjects\\new_study\\src\\main\\resources\\input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\IdeaProjects\\new_study\\src\\main\\resources\\output.txt")))
        {
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
