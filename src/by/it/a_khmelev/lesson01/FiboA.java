//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package by.it.a_khmelev.lesson01;

import java.math.BigInteger;

public class FiboA {
    private long startTime = System.currentTimeMillis();

    public FiboA() {
    }

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", Integer.valueOf(n), fibo.calc(n), fibo.time());
        fibo = new FiboA();
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", Integer.valueOf(n), fibo.slowA(Integer.valueOf(n)), fibo.time());
    }

    private long time() {
        long res = System.currentTimeMillis() - this.startTime;
        this.startTime = System.currentTimeMillis();
        return res;
    }

    private int calc(int n) {
        return 0;
    }

    BigInteger slowA(Integer n) {
        return BigInteger.ZERO;
    }
}
