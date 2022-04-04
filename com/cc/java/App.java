package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
     
        // Order order = new Order("order_1");
        // System.out.println(order.getName());

        ArrayList<Order> orders = new ArrayList<>();
        System.out.println("Orders: " + orders);
        orders.add(new Order("Auftrag_1"));
        System.out.println("Orders: " + orders);
        orders.add(new Order("Auftrag_2"));
        
        System.out.println("Orders: " + orders);
        System.out.println(orders.get(0));
        System.out.println(orders.get(orders.size()-1));
        

    }

}

