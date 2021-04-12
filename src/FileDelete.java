/**
 * @author shystart
 * @create 2021-04-12 下午 15:15
 */
import java.io.File;
import java.util.Scanner;

public class FileDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要清理的文件夹路径：");
        String path = scanner.next();
        System.out.println("请输入要清理文件夹的后缀：");
        String endWith = scanner.next();
        File file = new File(path);
        Delete(file,endWith);

    }

    /**
     * 删除指定文件后缀的文件
     * @param file
     */
    public static void Delete(File file,String endWith){
        if(file.isDirectory()){
            File[] all =file.listFiles();
            for (File f:all) {
                Delete(f,endWith);
            }
        }
        else if(file.isFile() && (file.toString().endsWith(endWith))){
            file.delete();
        }
    }
}
