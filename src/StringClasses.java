public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Hyun tak NA";
            name.equalsIgnoreCase("Hyun tak NA"); // true
            name.equalsIgnoreCase("Hyun tak"); // false

            String name_second = new String("Ha young JEONG");
            name_second.equalsIgnoreCase("Ha young JEONG"); // true
            name_second.equalsIgnoreCase("Ha young"); // false
            name_second.length(); //14
            name_second.replaceAll("E", "U"); //"Ha young JUONG"
            name_second = name_second.replaceAll("E", "U"); //"Ha young JUONG"
            String[] arrays = name_second.split(" "); // String[3]@47 0: "Ha" 1: "young" 2: "JUONG"
            String name_substring = name_second.substring(3,11); // "young JU"

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
