public class MakingGamebyOneHand {
    public static void main(String[] args) {
        String a = "1";
        String b = "";
        String c = "2";
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        b = c;
        c = a;
        a = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
