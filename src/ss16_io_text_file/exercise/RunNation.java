package ss16_io_text_file.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunNation {
    public static void main(String[] args) {
        String path = "src/ss16_io_text_file/exercise/nation.csv";
        List<String> list =ReadNation(path);
        for (int i = 0; i < list.size(); i++) {
            Nation nation = new Nation(Integer.parseInt(list.get(i).split(",")[0]),list.get(i).split(",")[1],list.get(i).split(",")[2]);
            System.out.println(nation);
        }
    }
    public static List<String> ReadNation(String path){
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str="";
            while ((str = bufferedReader.readLine())!=null){
                list.add(str);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
