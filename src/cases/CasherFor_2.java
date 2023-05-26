package cases;

import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

public class CasherFor_2 {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            int[] cart = new int[5];

            System.out.println("장바구니엔 5가지 넣음");
            System.out.println("----- 계산 시작 -----");

            int sum = 0;
            for (int first = 0; first < cart.length; first++) {
                System.out.print((first + 1) + "번째 가격: ");
                cart[first] = myObj.nextInt();

                if (cart[first] == 0) {
                    break;
                } else if (cart[first] > 100) {
                    System.out.println("100 초과 0원 적용");
                    cart[first] = 0;
                }

                sum += cart[first];

            }

            System.out.println("----- 담은 총합 -----");
            System.out.println("합계: " + sum);
            System.out.println();
            System.out.println("----- 계산 종료 -----");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
    }

    private static int calculateSum(int[] cart) {
        return 0;
    }

    // return 0:
}
