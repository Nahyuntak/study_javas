package tests;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int A = myObj.nextInt();
        int B = myObj.nextInt();

        int product = A * B; // 두 수의 곱 계산

         // (3), (4), (5), (6) 위치에 들어갈 값을 계산하여 출력
         int digit1 = (A*(product % 10)); // 십의 자리 수
         int digit2 = (A*((product/10) % 10)); // 백의 자리 수
         int digit3 = (A*((product/100) % 100)); // 천의 자리 수

        //
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(product);
    }
}