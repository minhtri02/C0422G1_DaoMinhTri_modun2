package ss16_io_text_file.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sum_File_Text {
    public static void main(String[] args) {
        String path = "src/ss16_io_text_file/practice/number.txt";
        readFileText(path);
    }
    public static void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br =new BufferedReader(new FileReader(file));
            String line = "";
            int sum=0;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng = "+sum);
        } catch (Exception e){
            System.out.println("File ko tồn tại hoăc nội dung có lỗi!");
        }
    }
}
