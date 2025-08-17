package com.example.javamavenjunithelloworld;

public class Utility {

    // a. odd/even
    public static boolean isEven(int n) { return n % 2 == 0; }

    // b. divisibility 2..9
    public static boolean isDivisibleBy2(int x){ return x % 2 == 0; }
    public static boolean isDivisibleBy3(int x){ return x % 3 == 0; }
    public static boolean isDivisibleBy4(int x){ return x % 4 == 0; }
    public static boolean isDivisibleBy5(int x){ return x % 5 == 0; }
    public static boolean isDivisibleBy6(int x){ return x % 6 == 0; }
    public static boolean isDivisibleBy7(int x){ return x % 7 == 0; }
    public static boolean isDivisibleBy8(int x){ return x % 8 == 0; }
    public static boolean isDivisibleBy9(int x){ return x % 9 == 0; }

    // c. bigger of two
    public static int maxOfTwo(int a, int b){ return (a > b) ? a : b; }

    // d. biggest of three
    public static int maxOfThree(int a, int b, int c){ return Math.max(a, Math.max(b, c)); }

    // e. numbers 1..10
    public static int[] numbersOneToTen(){
        int[] out = new int[10];
        for(int i=0;i<10;i++) out[i] = i + 1;
        return out;
    }

    // f. leap year
    public static boolean isLeapYear(int year){
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // g/h/i/j. arithmetic
    public static int add(int a, int b){ return a + b; }
    public static int multiply(int a, int b){ return a * b; }
    public static double divide(int a, int b){
        if (b == 0) throw new IllegalArgumentException("b must not be 0");
        return (double)a / b;
    }
    public static int squareOfSum(int a, int b){
        long s = (long)a + b;
        long r = s * s;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) throw new ArithmeticException("overflow");
        return (int) r;
    }

    // k/l/m/n/o. geometry & sqrt
    public static double areaOfCircle(double r){
        if (r < 0) throw new IllegalArgumentException("r >= 0");
        return Math.PI * r * r;
    }
    public static double areaOfSquare(double side){
        if (side < 0) throw new IllegalArgumentException("side >= 0");
        return side * side;
    }
    public static double areaOfRectangle(double w, double h){
        if (w < 0 || h < 0) throw new IllegalArgumentException("w,h >= 0");
        return w * h;
    }
    public static double areaOfTriangle(double base, double height){
        if (base < 0 || height < 0) throw new IllegalArgumentException("base,height >= 0");
        return 0.5 * base * height;
    }
    public static double squareRoot(double x){
        if (x < 0) throw new IllegalArgumentException("x >= 0");
        return Math.sqrt(x);
    }

    // Your name function
    public static void bikkina(){
        System.out.println("I am Bikkina");
    }
}
