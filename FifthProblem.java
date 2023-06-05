import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class FifthProblem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("0");
        else
            System.out.println("1");
    }
}
