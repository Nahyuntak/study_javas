package tests;
import java.util.Scanner;

public class ConvertToYear {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int input = myObj.nextInt();
        int output = input - (2541-1998);
        System.out.println(output);

    }
}
