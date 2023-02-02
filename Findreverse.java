package LOOPS;

import java.util.Scanner;

public class Findreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter N");
        int N = sc.nextInt();
        int Reverse=0;

        while (N>0){
            int lastdigit = N%10;
            Reverse=(Reverse*10)+lastdigit;
            N=N/10;
        }
        System.out.println(Reverse);
    }
}
