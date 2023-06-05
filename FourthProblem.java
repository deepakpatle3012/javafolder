import java.util.Scanner;
public class FourthProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter first num");
        int a=sc.nextInt();
        System.out.println("enter second num");
        int b= sc.nextInt();
        System.out.println("enter third num");
        int c = sc.nextInt(); 
           if(a>=b && a>=c)  
            System.out.println(a+" is the largest Number");  
//comparing b with a and b with c  
//if both conditions are true, prints b  
         else if (b>=a && b>=c)  
          System.out.println(b+" is the largest Number");  
          else  
//prints c if the above conditions are false  
          System.out.println(c+" is the largest number");  
          }
            }//object of the Scanner class  


