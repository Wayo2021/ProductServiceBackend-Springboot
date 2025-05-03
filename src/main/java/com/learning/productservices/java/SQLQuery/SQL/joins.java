package com.learning.productservices.java.SQLQuery.SQL;

public class joins {

    public static void joinQuery(){
        String innerJoin = "" +
                "SELECT * " +
                "FROM orders" +
                "INNER JOIN customers ON orders.customers_id = customers.id";

        String leftJoin = "" +
                "SELECT *" +
                "FROM customers" +
                "LEFT JOIN orders ON customers.id = orders.customer_id";

        String rightJoin = "" +
                "SELECT *" +
                "FROM customers" +
                "RIGHT JOIN orders ON customers.id = orders.customer_id";

        String fullJoin = "" +
                "SELECT *" +
                "FROM customers" +
                "FULL JOIN orders ON customers.id = orders.customer_id";
    }
}
