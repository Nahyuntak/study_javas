import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};

            ArrayList arrayList = new ArrayList();
            arrayList.add(1); // true                        
            arrayList.add(2); // true 
            arrayList.add(3); // true 
            arrayList.size(); // 3
            arrayList.set(1, 5);
            arrayList.remove(0);
            arrayList.clear(); //(void)
            
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
