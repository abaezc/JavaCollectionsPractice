package org.unosquare.shopping;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    String productName;
    Double productPrice;
    boolean itemExist = false;

    ArrayList<String> shoppingList;
    HashMap<String, Double> shoppingCartList;

    public ShoppingCart(ArrayList<String> shoppingList) {
        this.shoppingList = new ArrayList<String>();
        this.shoppingList = shoppingList;
        shoppingCartList = new HashMap<String, Double>();
    }

    public void addItems(String article, Double price) {
        productName = article.toUpperCase();
        productPrice = price;
        itemExist = shoppingList.contains(productName);
        Double amountItem = shoppingCartList.get(productName);

        if (amountItem != null) {
            productPrice =  productPrice +amountItem;
        }

        if (itemExist) {
            shoppingCartList.put(productName, productPrice);
        }else{
            try {
                productPrice =  productPrice +amountItem;
            } catch (Exception e) {
                System.out.println(e);
            }finally{
                System.out.println(productName + " - Article not found.");
            }
        }
    }

    public void deleteItem(String article) {
        productName = article.toUpperCase();
        shoppingCartList.remove(productName);
    }

    public void printTotal(){
        double subtotal = 0.0;
        double tax = 0.0;
        double total = 0.0;

        for (String item : shoppingCartList.keySet()) {
            System.out.println(item + " - " + shoppingCartList.get(item));
            subtotal = subtotal + shoppingCartList.get(item);
        }

        tax = (15 * subtotal) / 100;
        total = subtotal + tax;
        
        System.out.println("----------------------");

        System.out.println("Subtotal: $" + subtotal);
        System.out.printf("Taxes: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
