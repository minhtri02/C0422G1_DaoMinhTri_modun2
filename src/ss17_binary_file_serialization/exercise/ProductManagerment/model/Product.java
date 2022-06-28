package ss17_binary_file_serialization.exercise.ProductManagerment.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String idProduct;
    private String name;
    private String productCompany;
    private double price;

    public Product() {
    }

    public Product(String idProduct, String name, String productCompany, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.productCompany = productCompany;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", name='" + name + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", price=" + price +
                '}';
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
