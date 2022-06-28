package ss17_binary_file_serialization.exercise.ProductManagerment.service;

import ss17_binary_file_serialization.exercise.ProductManagerment.model.Product;
import ss17_binary_file_serialization.exercise.ProductManagerment.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ProductImplService implements Iservice {
    static Scanner scanner = new Scanner(System.in);
//    static List<Product> list = new ArrayList<>();

    @Override
    public void add() {
        List<Product> list = ReadAndWrite.readDataFromFile("src/ss17_binary_file_serialization/exercise/ProductManagerment/model/productData.csv");
        System.out.println("CHỨC NĂNG THÊM SẢN PHẨM");
        System.out.println("Nhập mã sản phẩm");
        String idProduct = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập hãn sản xuất");
        String productCompany = scanner.nextLine();
        System.out.println("Nhập giá");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(idProduct, name, productCompany, price);
        list.add(product);
        ReadAndWrite.writeToFile("src/ss17_binary_file_serialization/exercise/ProductManagerment/model/productData.csv", list);
        display();
    }

    @Override
    public void display() {
        List<Product> list = ReadAndWrite.readDataFromFile("src/ss17_binary_file_serialization/exercise/ProductManagerment/model/productData.csv");
        for (Product p : list)
            System.out.println(p);
    }

    @Override
    public void search() {
        List<Product> list = ReadAndWrite.readDataFromFile("src/ss17_binary_file_serialization/exercise/ProductManagerment/model/productData.csv");

        System.out.println("CHỨC NĂNG SEARCH");
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        boolean flag = true;
//        try{
//
//        }
        for (int i = 0; i < list.size()&&flag; i++) {
            if (name.equals(list.get(i).getName())) {
                System.out.println(list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.err.println("Không tìm thấy sản phẩm " + name);
        }
    }
}
