import java.util.Scanner;
public class ElevanthProblem {
    public static void main(String[] args) {
        int currbal = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("type 1 for add money"+"type 2 for withdraw ");
        int type = sc.nextInt();
        if (type==1) {
            System.out.println("enter amount");
            int amount =sc.nextInt();
            currbal=currbal+amount;
        } else if (type==2) {
            System.out.println("enter amount");
            int amount =sc.nextInt();
            if (amount>currbal) {
                System.out.println("insufficient fund");
                
            }else{
                currbal=currbal-amount;
            }}
             else {
                System.out.println("invalid input");
            
        }System.out.println(currbal);

    } 
}     
