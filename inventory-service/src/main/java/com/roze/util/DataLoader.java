//package com.roze.util;
//
//import com.roze.model.Inventory;
//import com.roze.repository.InventoryRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader {
//    private final InventoryRepository inventoryRepository;
//
//
//    public void run(String... arg) throws Exception {
//        Inventory inventory = new Inventory();
//        inventory.setSkuCode("iPhone_13");
//        inventory.setQuantity(100);
//
//        Inventory inventory1 = new Inventory();
//        inventory1.setSkuCode("iPhone_13_pro");
//        inventory1.setQuantity(0);
//
//        inventoryRepository.save(inventory);
//        inventoryRepository.save(inventory1);
//
//
//    }
//}
