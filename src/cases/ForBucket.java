package cases;

import java.util.Scanner;

public class ForBucket {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언
            String[] bucket = { "", "", "" };

            Scanner myObj = new Scanner(System.in);
            for (int first = 0; first < bucket.length; first ++) {
                System.out.print((first + 1) + "번째 담기: ");
                bucket[first] = myObj.nextLine();
            }

            System.out.println("-----담은 내용물-----");

            System.out.print(bucket[0] + ",");
            System.out.print(bucket[1] + ",");
            System.out.print(bucket[2]);

            System.out.println("-----장보기 종료-----");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }

        System.out.println();
        // return 0;
    }
}
