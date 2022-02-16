package com.knoldus;

public class ProductionOfAllNum {
    public static long getResult (long num1, long num2) {

        ProductionOfNumbers productionOfNumbers = ((x, y) -> {
            long result = 1;
            for (long i = y; i >= x; i--) {
                result = result * i;
            }
            return result;
        });

        return productionOfNumbers.getProduction(num1, num2);
    }

    public static void main(String[] args) {
        long output1 = ProductionOfAllNum.getResult(5, 15);
        long output2 = ProductionOfAllNum.getResult(2, 2);

        System.out.println(output1);
        System.out.println(output2);
    }
}
