package HackerRank;//package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String[] lista1=A.split("");
        String[] lista2=new String[lista1.length];
        String B="";
        for(int i=0;i<lista1.length;i++){
            lista2[i]=lista1[lista1.length-(i+1)];
            B+=lista2[i];
        }
        if(A.equals(B)) System.out.println("Yes");
        else System.out.println("No");

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(B);
    }
}
