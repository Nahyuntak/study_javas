package tests;
import java.util.Scanner;

public class Leftovers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
