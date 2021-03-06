package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"oto","https://vcdn-vnexpress.vnecdn.net/2021/12/07/rush1-1638865158-9684-1638866077.jpg"));
        products.add(new Product(2,"oto","https://danviet.mediacdn.vn/upload/3-2019/images/2019-09-09/5-ly-do-vi-sao-khong-nen-mua-xe-hoi-bang-gia-xe-o-to-moi-nhat-hom-nay-thang-1568002119-width800height450.jpg"));
    }

    public static void createProduct(Product product){
        products.add(product);
    }

    public static void editProduct(int index, Product product){
        products.set(index, product);
    }

    public static void deleteProduct(int id){
        products.remove(id);
    }

    public static int findIndexById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                return i;

            }
        }
        return -1;
    }

    public static Product getProduct(int id){
//        return products.get(findIndexById(id));
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


}
