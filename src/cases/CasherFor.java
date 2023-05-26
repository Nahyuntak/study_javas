package cases;

import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try{
            Scanner myObj = new Scanner(System.in);
            int[] cart = new int[5]; // 장바구니 배열
            int total = 0; // 총합 변수

            System.out.println("장바구니에는 5개만 넣을 수 있습니다.");
            System.out.println("-----계산 시작-----");

            for (int first = 0; first < cart.length; first++) {
                System.out.print((first + 1) + "번째 가격: ");
                int price = Integer.parseInt(myObj.nextLine()); // 가격 입력

                if (price == 0) {
                    // 입력된 값이 0원이면 이전 값들 합산
                    break;
                } else if (price <= 100) {
                    // 입력된 값이 100원 이하면 합산
                    total += price;
                } else {
                    // 입력된 값이 100원을 초과하면 0원 적용
                    total += 0;
                }

                cart[first] = price; // 장바구니에 가격 저장
            }

            System.out.println("--- 담은 총합 ---");
            System.out.println("합계: " + total);
            System.out.println();
            System.out.println("--- 계산 종료 ---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
