package by.it.group251001.kulchinskiy.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        BigInteger[] fibo_nums = new BigInteger[n + 1];
        fibo_nums[0] = (BigInteger.ZERO);
        fibo_nums[1] = (BigInteger.ONE);

        int i = 2;
        while (i < n + 1){
            fibo_nums[i] = fibo_nums[i - 1].add(fibo_nums[i - 2]);
            i++;
        }
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        return fibo_nums[n];
    }

}
