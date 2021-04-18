package com.tms.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Shop {
    private static ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    // Добавляем продукт

    public void newProductAdd(Product product) {
        for (Product xx : productList) {
            if (product.getId() == xx.getId()) {
                return;
            }
        }
        productList.add(product);
    }

    // Выводим список продуктов

    public void allProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    //Удаляем продукт

    public void delProduct(Product product) {
        productList.remove(product.getId());
    }

    //Редактируем продукт

    public void formatProductList(int id, int newId, String newName, int newPrice) {
        for (Product xx : productList) {
            if (xx.getId() == id) {
                xx.setId(newId);
                xx.setName(newName);
                xx.setPrice(newPrice);
            }
        }
    }

    // Сортировка по цене

    public void sortProductPrice() {
        productList.sort(Comparator.comparing(product -> product.getPrice()));
        for (Product xx : productList) {
            System.out.println(xx);
        }
    }

    //Сортировка продуктов по добавлению

    public void sortAddProduct() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(productList.size() - 1 - i));
        }
    }
}

