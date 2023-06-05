import java.util.Scanner;
public class SeventhProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter first num");
        int a=sc.nextInt();
        System.out.println("enter second num");
        int b= sc.nextInt();
        System.out.println("enter third num");
        int c = sc.nextInt(); 
           if(a<=b && a<=c)  
            System.out.println(a+" is the smallest Number");  
//comparing b with a and b with c  
//if both conditions are true, prints b  
         else if (b<=a && b<=c)  
          System.out.println(b+" is the smallest Number");  
          else  
//prints c if the above conditions are false  
          System.out.println(c+" is the smallest number");  
          }
            }//object of the Scanner class  


    

