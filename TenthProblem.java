import java.util.Scanner;
public class TenthProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
        if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("1"); 
		}
		else
		{
			System.out.println("0"); 
		}	
    }
}
