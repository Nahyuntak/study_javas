package tests;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int A = myObj.nextInt();
        int B = myObj.nextInt();

        int product = A * B; // 두 수의 곱 계산

         // (3), (4), (5), (6) 위치에 들어갈 값을 계산하여 출력
         int digit1 = A * (B % 10); // 첫 번째 자리 수 계산
         int digit2 = A * ((B / 10) % 10); // 두 번째 자리 수 계산
         int digit3 = A * (B / 100); // 세 번째 자리 수 계산

        // 출력
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(product);
    }
}