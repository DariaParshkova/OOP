package com.company;
public class Primes {
    public static void main(String[] args) {
        // определяю и печатаю простые числа от 2 до 100
        for (int i=2;i<=100;i++) {
            if (isPrime(i) == true) {
                System.out.printf("%d ", i);
            }
        }
    }
    // функция определяющая - простое ли число или нет
    public static boolean isPrime(int n)
    {
        // начальное значение того - простое ли число
        boolean Prime = true;
        for(int i=2;i<n;i++){
            // если есть хоть одно число , на которое n делится без остатка - то число не простое
            if (n%i == 0) {
                Prime = false;
            }
        }
        // вернула результат
        return Prime;
    }
}





