package com.example.inventorymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Inventory Management Application Started!");
        SpringApplication.run(InventoryManagementApplication.class, args);
    }
}