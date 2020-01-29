package com.company;

public interface Factorials {
    int factorial(int number) throws Exception;
}

class Factorial implements Factorials{
    public int factorial(int number) throws Exception{
        int result = 1;
        if(number < 0){
            throw new IllegalArgumentException("Invalid number");
        } else {
            for (int i = 1; i <= number; i++){ result *= i; }
        }
        return result;
    }
}

class RecFactorial implements Factorials{
    public int factorial(int number) throws Exception{
        int result = 1;
        if(number < 0){
            throw new IllegalArgumentException("Invalid number");
        }
        if (number == 0 || number == 1){
            return result;
        }
        else {
            result = number * factorial(number - 1);
        }
        return result;
    }
}
