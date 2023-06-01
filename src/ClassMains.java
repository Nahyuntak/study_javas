import cases.ClassSeconds;

public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classfirsts = new ClassFirsts(); // no param
            ClassFirsts classfirstsWithVar = new ClassFirsts(5); //
            int second = classfirstsWithVar.getSecond();
            ClassSeconds classSeconds= new ClassSeconds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
