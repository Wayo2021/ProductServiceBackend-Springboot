package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.Compositions;

public class TestClass {
    public static void main(String[] args) {
        Author john = new Author("John Smith", "smith@gmail.com");
        System.out.println(john);

        Book book1 = new Book("Java Learning", john, 250);
        System.out.println(book1);

        Book book2 = new Book("Java EE", new Author("Robert", "robert@gmail.com"), 350);
        System.out.println(book2);
    }
}
