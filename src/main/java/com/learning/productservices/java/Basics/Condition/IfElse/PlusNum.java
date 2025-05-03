package com.learning.productservices.java.Basics.Condition.IfElse;

public class PlusNum {
    public static void main(String[] args) {
        int conNum = 1112;
        int serNum = 2;
        int conReq[] = new int[]{2};
        int result = 0;

        for (int i = 0; i < conReq.length; i++) {
            result = serNum + conReq[i];
        }
        System.out.println(result);

}}
