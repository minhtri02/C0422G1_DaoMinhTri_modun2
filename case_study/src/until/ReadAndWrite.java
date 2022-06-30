package until;

import model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> reader(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try {
            if (path.length()>0){
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String str = "";
                while ((str = bufferedReader.readLine()) != null) {
                    list.add(str);
                }
                bufferedReader.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void write(List<String> list , String path, boolean flag){
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,flag);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomer(){
        List<Customer> customers = new ArrayList<>();
        List<String> list = reader("case_study/src/controrler/data/customer.csv");
        String[] arr ;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customers.add(new Customer(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],arr[7],arr[8] ));
        }
        return customers;
    }

    public static void writerCustomer(List<Customer> list, String pathFile, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s : list) {
                bufferedWriter.write(s.getInfoToString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
