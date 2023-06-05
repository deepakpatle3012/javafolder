import java.util.Scanner;
public class NinthProblem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("firsty number");
      int x = sc.nextInt();
      System.out.println("second number");
      int y = sc.nextInt();
      System.out.println("third number");
      int z = sc.nextInt();
        if (x == y && y == z)
        System.out.println("Equilateral Triangle"); 
 
    // Check for isosceles triangle
        else if (x == y || y == z || z == x)
        System.out.println( "Isosceles Triangle");
 
    // Otherwise scalene triangle
    else
        System.out.println("Scalene Triangle");
    }
}
