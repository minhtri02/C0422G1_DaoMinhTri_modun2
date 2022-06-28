package ss17_binary_file_serialization.exercise.copyFile;

import ss17_binary_file_serialization.practice.Main;

import java.io.*;

public class CopyFile{
    public static void main(String[] args) {
        final String source = "src/ss17_binary_file_serialization/practice/file1.csv";
        final String target ="src/ss17_binary_file_serialization/exercise/copyFile/target.csv";
        File file = new File(source);
        File file2 = new File(target);

        try {
            copyFileUsingStream(file,file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[102412312];
            int sum=0;
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                sum+=length;
            }
            System.out.println(sum);
        } finally {
            is.close();
            os.close();
        }
    }
}
