package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
        //Ввожу слово
    }
    public static String reverseString(String s) {
        String u = "";
        // беру символы исходной строки с конца строки и до начала
        // добавляем ее в начало строки-результата (переменная r)
        for (int i = s.length() - 1; i >= 0; --i) u += s.charAt(i);//переворачиваем строку добавляя r по букве с конца
        return u;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){//Сравниваем нашу строку с перевернутой
            System.out.println("Полиндром");
        }else{
            System.out.println("Не Полиндром");
        }
        return s.equals(reverseString(s));
    }

}
