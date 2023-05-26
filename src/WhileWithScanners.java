import java.util.Scanner;

public class WhileWithScanners {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // try_catch문 사용
        try {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            String answer = "";

            System.out.println("안내입니다.");
            boolean loops = true;
            while (loops) {
                System.out.println("1-대출, 2-예금, 그 외 번호-종료");
                System.out.print("입력하세요: ");
                answer = myObj.nextLine(); // Read user input //입력값을 받아서 문자형 변수 answer로 사용
    
                // 문자는 조건절에서 "=="에 동작하지 않는다.
                // .equals("")로 문제해결 가능
                if (answer.equals("1")) {
                    System.out.println("대출 업무입니다.");
                } else if (answer.equals("2")) {
                    System.out.println("예금 업무입니다.");
                } else {
                    System.out.println("업무가 종료됩니다.");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;
    }
}
