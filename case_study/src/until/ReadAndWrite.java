package until;

import model.*;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static List<String> reader(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try {
            if (path.length() > 0) {
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

    public static void writeAll(String string, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(List<String> stringList, String path, boolean append){
        File file = new File(path);
        FileWriter fileWriter =null;
        try {
            fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s:stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomer(String path) {
        List<Customer> customers = new ArrayList<>();
        List<String> list = reader(path);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customers.add(new Customer(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]));
        }
        return customers;
    }


    public static void writerCustomer(List<Customer> list, String pathFile, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s : list) {
                bufferedWriter.write(s.getInfoToString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readEmployee(String path) {
        List<Employee> employees = new ArrayList<>();
        List<String> list = reader(path);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            employees.add(new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employees;
    }

    public static void writeEmployee(List<Employee> list, String pathFile, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee s : list) {
                bufferedWriter.write(s.getInfoToString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readFacilityToCSV(String path) {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<String> strings = reader(path);
        String[] arr;
        for (String string : strings) {
            arr = string.split(",");
            if (arr[0].contains("VL")) {
                facilityMap.put(new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8])),Integer.parseInt(arr[9]));
            }else if (arr[0].contains("HO")){
                facilityMap.put(new House(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],Integer.parseInt(arr[7])),Integer.parseInt(arr[8]));
            }else if (arr[0].contains("RO")){
                facilityMap.put(new Room(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6]),Integer.parseInt(arr[7]));
            }
        }
        return facilityMap;
    }

    public static void writeFacility(Map<Facility, Integer> facilityMap, String path, boolean append) {
            Set<Facility> set = facilityMap.keySet();
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility s : set) {
                bufferedWriter.write(s.getInForToString()+","+ facilityMap.get(s));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
