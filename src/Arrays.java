public class Arrays {
    public String[] initialArrays() {
        String[] carBrands = { "Volvo", "BMW", "Ford", "Mazda", "Kia" }; // 초기화를 해야하기때문에 아무것도 없는 값으로
        return carBrands;
    }

    public static void main(String[] args) {
        // String[][] numbers = { { "10", "20", "30", "40" }, { "50", "60", "70" } }; //
        // row와 row의 차이를 ","로 구분
        // for (int second = 0; second < numbers.length; second = second + 1) {
        // for (int third = 0; third < numbers[second].length; third = third + 1) {
        // System.out.print(numbers[second][third] + ",");
        // }
        // System.out.println();
        // }

        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Kia"};
        // System.out.println(cars.length);
        // for (int first = 0; first < cars.length; first = first + 1) {
        // System.out.print(cars[first] + ",");
        // }
        // System.out.println();
        // return 0;

        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for (int first = 0; first < cars.length; first = first + 1) {
            System.out.print(cars[first] + ",");
        }
        System.out.println();
    }
}
