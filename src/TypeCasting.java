// 수정하고자하는 문자에 커서를 가져다 두고 rename에서 수정할 수 있다.
public class TypeCasting {
    public static void main(String[] args) throws Exception {
        double myDouble = 9.78d; //d: 소숫점의 자리를 더 확장시켜준다. 램의 자원활용을 더 잘하기 위함.
        // casting 모양과 같아야 한다 ex) int = int
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        // return 0;
    }
}
