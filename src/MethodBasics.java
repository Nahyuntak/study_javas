public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // body
    // }
    // x에 +1
    public int F(int x) {
        int result = x + 1;
        return result;
    }

    public int Y(int y) {
        int result = y + 1;
        return result;
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);

            // y = y + 1; // 변수에 + 1
            y = methodBasics.Y(x);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
