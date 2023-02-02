package LOOPS;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i; int fact=1;
        System.out.println("Enter number");
        int Number = sc.nextInt();

        for(i=1;i<=Number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of" + Number + " is "+ fact );
    }
}
