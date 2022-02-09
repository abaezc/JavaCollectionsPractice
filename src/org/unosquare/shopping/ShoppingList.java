package org.unosquare.shopping;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] Strings) throws Exception {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("HAT");
        shoppingList.add("GLOVES");
        shoppingList.add("JACKET");
        shoppingList.add("JEANS");
        shoppingList.add("T-SHIRT");
        
        ShoppingCart sc = new ShoppingCart(shoppingList);

        sc.addItems("hat", 5.5);
        sc.addItems("gloves", 5.5);
        sc.addItems("jacket", 5.5);
        sc.addItems("jeans", 5.5);
        sc.addItems("t-shirt", 5.5);
        sc.addItems("hat", 5.5);
        sc.addItems("snickers", 5.5);

        sc.deleteItem("jeans");

        sc.printTotal();
    }
}