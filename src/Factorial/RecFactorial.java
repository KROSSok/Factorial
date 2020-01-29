package Factorial;

public class RecFactorial implements Factorial{
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