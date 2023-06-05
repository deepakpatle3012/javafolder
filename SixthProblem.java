 import java.util.Scanner;
 public class SixthProblem {
    public static void main(String[] args) {
        int numberOne, numberTwo, smallest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = scan.nextInt();
      
      if(numberOne<numberTwo)
         smallest = numberOne;
      else
         smallest = numberTwo;
      
      System.out.println("\nLargest = " +smallest);
    }
}

    

