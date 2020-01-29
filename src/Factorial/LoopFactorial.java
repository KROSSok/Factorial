package Factorial;

public class LoopFactorial implements Factorial{
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
