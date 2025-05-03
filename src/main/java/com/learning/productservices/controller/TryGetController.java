//package com.learning.productservices.controller;
//
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/get")
//@AllArgsConstructor
//public class TryGetController {
//    @GetMapping("/getOrderDetails")
//    public static Map<String, Object> getOrderDetails() {
//        // สร้างข้อมูลตามที่กำหนด
//        Map<String, Object> errorDetails = new HashMap<>();
//        errorDetails.put("mobileNo", "082342345345");
//        errorDetails.put("mobileType", "mbRefCode");
//        errorDetails.put("mobileValue", "082342345345");
//
//        Map<String, Object> getOrder = new HashMap<>();
//        getOrder.put("orderState", "Y");
//
//        List<Map<String, String>> orderConfirm = new ArrayList<>();
//        Map<String, String> order1 = new HashMap<>();
//        order1.put("orderType", "rent");
//        order1.put("orderName", "Video Games");
//        order1.put("orderCode", "VG");
//        order1.put("quantity", "3");
//
//        Map<String, String> order2 = new HashMap<>();
//        order2.put("orderType", "sell");
//        order2.put("orderName", "CD Games");
//        order2.put("orderCode", "CDG");
//        order2.put("quantity", "1");
//
//        Map<String, String> order3 = new HashMap<>();
//        order3.put("orderType", "sell");
//        order3.put("orderName", "CD Games");
//        order3.put("orderCode", "CDG");
//        order3.put("quantity", "1");
//
//        orderConfirm.add(order1);
//        orderConfirm.add(order2);
//        orderConfirm.add(order3);
//
//        getOrder.put("orderConfirm", orderConfirm);
//        errorDetails.put("getOrder", getOrder);
//
//        // นับ orderTotal จาก quantity
//        int orderTotal = orderConfirm.stream().mapToInt(order -> Integer.parseInt(order.get("quantity"))).sum();
//
//        getOrder.put("orderTotal", String.valueOf(orderTotal));
//
//        System.out.println("total: = " + orderTotal);
//
//        // นับจำนวน orderName ที่เหมือนกัน
//        Map<String, Integer> orderNameCount = new HashMap<>();
//        for (Map<String, String> order : orderConfirm) {
//            String orderName = order.get("orderName");
//            orderNameCount.put(orderName, orderNameCount.getOrDefault(orderName, 0) + 1);
//        }
//
//        errorDetails.put("orderNameCount", orderNameCount);
//
//        return errorDetails;
//
//
//    }
//}
