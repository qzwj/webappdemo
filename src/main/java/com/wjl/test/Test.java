package main.java.com.wjl.test;

public class Test {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = add(a,b);
        System.out.println("a == "+a);
        System.out.println("b == "+b);
        System.out.println("sum == "+sum);

    }

    public static int add(int a, int b){
        return a+b;
    }
}
