package com.tms.Shop;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Product orange = new Product(1, "Orange", 4);
        Product milk = new Product(2, "Milk Zdravishka", 2);
        Product cofe = new Product(3, "Cofe", 6);
        Product shokolad = new Product(4, "Shokolad Alenka", 1);
        Product orange2 = new Product(1, "Orange", 4);

        Shop shop = new Shop();
        shop.newProductAdd(orange);
        shop.newProductAdd(milk);
        shop.newProductAdd(cofe);
        shop.newProductAdd(shokolad);
        shop.newProductAdd(orange2);

        shop.sortProductPrice();
        shop.delProduct(orange);
        System.out.println();
        shop.sortAddProduct();
        shop.formatProductList(2, 5, "Milk Prostokvashino", 3);
        System.out.println();
        shop.allProduct();


    }
}
