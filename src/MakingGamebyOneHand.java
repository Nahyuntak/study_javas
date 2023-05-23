public class MakingGamebyOneHand {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String c = "3";
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
