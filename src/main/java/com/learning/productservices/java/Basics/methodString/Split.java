package com.learning.productservices.java.Basics.methodString;

public class Split {
    public static void main(String[] args) {

//        String[] name = "Hello,World".split(",");
//        for (int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//            //Hello
//            //World
//        }


//        qualify.getName().split(":")[0].equals("override");
//
//        //method split(String regex, int limit)
//        String str = "a d, m, i.n";
//        String delimiters = "\\s+|,\\s*|\\.\\s*";
//        String[] tokensValue = str.split(delimiters);
//        System.out.println("Count of tokens = " + tokensValue.length);
//        for (String token: tokensValue) {
//            System.out.print(token);
//        }

        String str = "package";
        String delimiters = "\\.\\s*|\\$\\s*";
        boolean tokensValue = false;
        if (str.split(delimiters)[0].equals("package")){
            tokensValue = str.split(delimiters)[0].equals("package");
            System.out.println("Count of tokens inside = " + tokensValue);
        } else
            {
                tokensValue = false;
                System.out.println("Count of tokens outside = " + tokensValue);
            }


//        tokensValue = str.split(delimiters, 3);
//        System.out.println("\nCount of tokens = " + tokensValue.length);
//        for (String token : tokensValue) {
//            System.out.print(token);
//        }
    }
}
