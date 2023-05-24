package tests;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        // 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
        Scanner myObj = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a = myObj.nextInt(); // Read user input
        b = myObj.nextInt(); // Read user input1
  
        System.out.println(a+b);  // Output user input
        System.out.println(a-b);  // Output user input
        System.out.println(a*b);  // Output user input
        System.out.println(a/b);  // Output user input
        System.out.println(a%b);  // Output user input
          // return 0;

    }
    
}
