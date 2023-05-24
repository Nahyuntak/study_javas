
public class LoopNestedLoops {
    public static void main(String[] args) {

        

        // if와 break문 사용하지 않고
        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("for" + first);
            for (int second = 1; second <= first; second = second + 1) {
                System.out.print("_?");
            }
            System.out.println();
        }
        System.out.println("end");


        // if와 break문 사용해서
        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("for" + first);
            for (int second = 1; second < 5; second = second + 1) {
                System.out.print("_?");
                if (second >= first) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("end");
        // return 0;
    }
}
