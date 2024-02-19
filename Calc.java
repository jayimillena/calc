public class SumCalc
{
  public static void main(String[] args)
  {
    System.out.println("The sum is: "+ getSum(22132131, 777));
    System.out.println("The difference is: "+ getDiff(32131, 777));
    System.out.println("The difference is: "+ getDiff(32131, 12));
  }

  public static double getSum(double firstNumber, double secondNumber)  
  {
    return firstNumber + secondNumber;
  }

  public static double getDiff(double firstNumber, double secondNumber)  
  {
    return firstNumber - secondNumber;
  }
}