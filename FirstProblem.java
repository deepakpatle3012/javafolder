import java.time.Month;
import java.util.Scanner;

/**
 * FirstProblem
 */
public class FirstProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month=sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("fabruary");
                break;    
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("aprail");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("auguast");
                break;
            case 9:
                System.out.println("september");
                break; 
            case 10:
                System.out.println("octuber");
                break;
            case 11:
                System.out.println("november");
                break; 
            case 12:
                System.out.println("december");
                break;                                  
            default:
                break;
        }
    }
}