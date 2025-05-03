//package com.learning.productservices.java.Advance.JavaCollection;
//
//public class BreakCode {
//    @Service
//    public class OrderService {
//
//        @Autowired
//        private OrderRepository orderRepository;
//
//        public Map<String, Object> getOrderInfo(String mobileNo) {
//            Map<String, Object> errorDetails = new HashMap<>();
//            List<Order> orders = orderRepository.findByOrderName("Video Games");
//
//            int orderTotal = orders.stream().mapToInt(Order::getQuantity).sum();//####  นับ Total จาก Quantity
//
//            errorDetails.put("mobileNo", mobileNo);
//            errorDetails.put("mobileType", "mbRefCode");
//            errorDetails.put("mobileValue", mobileNo);
//            Map<String, Object> getOrder = new HashMap<>();
//            getOrder.put("orderState", "Y");
//            getOrder.put("orderTotal", orderTotal);
//            List<Map<String, Object>> orderConfirmList = new ArrayList<>();
//            for (Order order : orders) {
//                Map<String, Object> orderConfirm = new HashMap<>();
//                orderConfirm.put("orderType", order.getOrderType());
//                orderConfirm.put("orderName", order.getOrderName());
//                orderConfirm.put("orderCode", order.getOrderCode());
//                orderConfirm.put("quantity", order.getQuantity());
//                orderConfirmList.add(orderConfirm);
//            }
//            getOrder.put("orderConfirm", orderConfirmList);
//            errorDetails.put("getOrder", getOrder);
//            return errorDetails;
//        }
//
//    }
////----------------------------------------------------------------------------------------------------------------------
//    public ResponseEntity<Object> calculateOrderTotal(String mobileNo) {
//        Order order = orderRepository.findByMobileNo(mobileNo);
//        if (order == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
//        }
//
//        Map<String, Integer> orderTotalMap = new HashMap<>();
//        for (OrderConfirm orderConfirm : order.getOrderConfirmList()) {
//            String orderName = orderConfirm.getOrderName();
//            int quantity = orderConfirm.getQuantity();
//
//            orderTotalMap.put(orderName, orderTotalMap.getOrDefault(orderName, 0) + quantity);//####นับ Quantity จาก Name
//        }
//
//        return ResponseEntity.ok(orderTotalMap);
//    }
////----------------------------------------------------------------------------------------------------------------------
//    Map<String, String> order3 = new HashMap<>();
//order3.put("orderType", "sell");
//order3.put("orderName", "CD Games");
//order3.put("orderCode", "CDG");
//order3.put("quantity", "2");
//
//    String value = "";
//if (order3.containsValue("sellConfirm")) {
//        value = order3.get("orderType");
//    }
//if (order3.containsValue("rentCode")) {
//        value = order3.get("orderCode");
//    }
//
//order3.put("Value", value);
////----------------------------------------------------------------------------------------------------------------------
//    Map<String, String> order2 = new HashMap<>();
//        order2.put("orderType", "sell");
//        order2.put("orderName", "CD Games");
//        order2.put("orderCode", "CDG");
//        order2.put("quantity", "1");
//
//    Map<String, String> order3 = new HashMap<>();
//        order3.put("orderType", "sell");
//        order3.put("orderName", "CD Games");
//        order3.put("orderCode", "CDG");
//        order3.put("quantity", "1");
//
//    Map<String, Integer> orderCountMap = new HashMap<>();
//        for (Map<String, String> order : Arrays.asList(order2, order3)) {
//        String orderName = order.get("orderName");
//
//        int quantity = Integer.parseInt(order.get("quantity"));
//        orderCountMap.put(orderName, orderCountMap.getOrDefault(orderName, 0) + quantity);
//    }
//
//    // สร้าง List ของ Map ใหม่ที่มีข้อมูลที่รวมรายการ orderName ที่เหมือนกันเป็นรายการเดียว
//    List<Map<String, String>> mergedOrders = new ArrayList<>();
//        for (String orderName : orderCountMap.keySet()) {
//        Map<String, String> mergedOrder = new HashMap<>();
//        mergedOrder.put("orderType", "sell"); // กำหนดค่า orderType เป็น "sell" ตามที่ต้องการ
//        mergedOrder.put("orderName", orderName);
//        mergedOrder.put("orderCode", "CDG"); // กำหนดค่า orderCode เป็น "CDG" ตามที่ต้องการ
//        mergedOrder.put("quantity", String.valueOf(orderCountMap.get(orderName)));
//        mergedOrders.add(mergedOrder);
//    }
//
//// แสดงผลลัพธ์
//        for (Map<String, String> mergedOrder : mergedOrders) {
//        System.out.println(mergedOrder);
//    }
////----------------------------------------------------------------------------------------------------------------------
//
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
//        order1.put("quantity", "4");
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
