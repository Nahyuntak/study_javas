import java.util.Scanner;

public class MethodIfs {
    public String classifyTime(int time) {
        String classification;

        if (time < 12) {
            classification = "오전입니다.";
        } else if (time < 18) {
            classification = "오후입니다.";
        } else if (time <= 24) {
            classification = "밤입니다.";
        } else {
            classification = "잘못된 시간입니다.";
        }

        return classification;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("시간 입력: ");
            int time = scanner.nextInt();

            MethodIfs methodIfs = new MethodIfs();
            String classification = methodIfs.classifyTime(time);

            System.out.println(classification);

            System.out.print("계속 입력하시겠습니까? (y/n): ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
