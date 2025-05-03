package com.learning.productservices.java.javaBasics.java_string;

public class split {
    public static void main(String[] args) {
        //method split(String regex)

        //return String

//        String[] name = "Hello,World".split(",");
        String check = "World";
//        for (int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//            //Hello
//            //World
//            if (name[i].equals(check)) {
//                System.out.println(name[i]);
//            }
//        }
//
//
//        //method split(String regex, int limit)
//        String str = "a d, m, i.n";
//        String delimiters = "\\s+|,\\s*|\\.\\s*";
//        String[] tokensValue = str.split(delimiters);
//        System.out.println("Count of tokens = " + tokensValue.length);
//        for (String token: tokensValue) {
//            System.out.print(token);
//        }
//
//        tokensValue = str.split(delimiters, 3);
//        System.out.println("\nCount of tokens = " + tokensValue.length);
//        for (String token : tokensValue) {
//            System.out.print(token);
//        }


        String str = "Disconnect - Terminate";
        int index = str.indexOf('-');
        String result = str.substring(0, index).trim();
        System.out.println(result);




//        String[] arrOfStr = str.split("-");
//        for (String a : arrOfStr) {
//            System.out.println(a.trim());
//            if (a.startsWith("Disconnect")) {
//                System.out.println(a);
//            }
//        }
    }
}
