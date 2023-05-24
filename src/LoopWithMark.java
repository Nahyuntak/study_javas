public class LoopWithMark {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i = i + 1) {
            String line = "for" + i;
            // code block to be executed
            System.out.println(line);
        }
        System.out.println("end");
        // return 0;
    }
}
