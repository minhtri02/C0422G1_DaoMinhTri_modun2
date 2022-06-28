package ss17_binary_file_serialization.exercise.ProductManagerment.util;

import ss17_binary_file_serialization.exercise.ProductManagerment.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> readDataFromFile(String path) {
        File file = new File(path);
        List<Product> products = new ArrayList<>();
        try {
            if (file.length()>0){
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                products = (List<Product>) ois.readObject();
                fis.close();
                ois.close();
            }else {
                System.err.println("File rỗng!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
