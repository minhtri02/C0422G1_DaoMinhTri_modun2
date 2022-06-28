package ss16_io_text_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public static void main(String[] args) {
        String sourtPath = "src/ss16_io_text_file/exercise/source.txt";
        String targerPath = "src/ss16_io_text_file/exercise/target.txt";
        List<String> list = new ArrayList<>();
        list=readerFile(sourtPath);
        System.out.println(writeFile(list,targerPath));
    }
    public static int writeFile(List<String> list, String targetPath){
        File file = new File(targetPath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        int sum =0;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String[] strings ;
            String str;
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
                str = list.get(i);
                strings = str.split(" ");
                for (int j = 0; j < strings.length; j++) {
                    sum+= strings[j].length();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
public static List<String> readerFile(String sourcePath){
    List<String> list = new ArrayList<>();
    File file = null;
    BufferedReader bufferedReader = null;
    try {
        file = new File(sourcePath);
        FileReader fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        String str = "";
        while ((str = bufferedReader.readLine()) != null){
            list.add(str);
        }
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return list;
}
}
