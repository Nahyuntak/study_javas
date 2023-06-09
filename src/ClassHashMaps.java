import java.util.HashMap;

public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); // null
            hashMap.put("second", 2); // null
            hashMap.put("third", 3); // null
            hashMap.get("third"); // Integer@53 "3"
            hashMap.size(); // 3
            hashMap.put("second", 5); // Integer@47 "2"
            hashMap.remove("second"); // Integer@501 "5"
            hashMap.keySet(); // HashMap$KeySet@507 size=2
            hashMap.values(); // HashMap$Values@506 size=2
            // class단위에 해당하는 list에 hashMap을 넣을 수 있고 hashMAp에 List를 넣을 수 있다.

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
