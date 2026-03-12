package Array;
import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        int num[] = new int[50];
        Scanner sc = new Scanner(System.in);
        
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        
        System.out.println("phy : " +num[0]);
        System.out.println("chem : " +num[1]);
        System.out.println("math : " +num[2]);
    }
}