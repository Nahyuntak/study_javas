import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            String answer = "";

            boolean loops = true;
            while (loops) {
                System.out.println("선택에 따라 안내글을 보여드립니다.");
                System.out.println("--------작동 key--------");
                System.out.println("(E)xit: 종료");
                System.out.println("(P)oll: 설문 시작");
                System.out.println("(S)tatistic: 설문 통계");
                System.out.println();
                System.out.print("선택 입력: ");
                answer = myObj.nextLine(); // Read user input //입력값을 받아서 문자형 변수 answer로 사용
    
                // 문자는 조건절에서 "=="에 동작하지 않는다.
                // .equals("")로 문제해결 가능

                if (answer.equals("S") || answer.equals("Statistic")){
                    System.out.println("-------설문 통계-------");
                    break;
                } else if (answer.equals("P") || answer.equals("Poll")) {
                    System.out.println("-------설문 시작-------"); 
                    break;
                }  else if (answer.equals("E") || answer.equals("Exit")) {
                    System.out.println("-------설문 종료-------");
                    break;
                }  else {
                    System.out.println("-------처음으로 돌아갑니다. 다시 입력해주세요.-------");
                }
                System.out.println();
            }









        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }

        // return 0;
    }
}
