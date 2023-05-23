public class SetWandGetVariable {
        public static void main(String[] args) {
    
            int a = 1;
            int b = 3;
            int c = 5;
            int d = 7;
            int cb = 10;
            int nb = 5;
            int cd = 5;
            int nd = 200;
            int ca = 50;
            int na = 30;
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

            if (b == 3) {
                a = cb;
            } 
             if (d == 9 ) {
                b = cd;
             } else {
                b = nd;
             }
             if (a == 10) {
                c = ca;
             } else {
                d = na;
             }
            
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
             System.out.println(d);
    
            // return 0;
        }
    }

