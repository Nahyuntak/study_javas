public class MethodSwitches {
    public String today (int day) {
        String str = "";
        try {
            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Tuesday";
                    break;
                case 3:
                    str = "Wednesday";
                    break;
                case 4:
                    str = "Thursday";
                    break; // 값이 true이면 멈춘다.
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            int day = 4; // It is possible to enter from 1 to 4
            String str = ""; // 자원을 사용할 때; 초기화 값 
            
            MethodSwitches methodswitches = new MethodSwitches();
            String ReturnResult = methodswitches.today(day);
            System.out.println(ReturnResult);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
