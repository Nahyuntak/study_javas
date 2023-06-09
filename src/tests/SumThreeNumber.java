package tests;
import java.util.Scanner;

public class SumThreeNumber {
    public static void main(String[] args) {
        // A + B + C를 계산
        // 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
        Scanner myObj = new Scanner(System.in);

        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int C = myObj.nextInt();

        int product = A + B + C; // 세 수의 합 계산

        // 출력
        System.out.println(product);
    }
}
