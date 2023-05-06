package weekSeven;

public class ArrayDemo3 { public static void main(String[] args) {
    String[][] names = { {"Ann", "Andy", "Andrea"},
            {"John", "Joan", "Joanna"} };
    for (String[] row : names) {
        for (String col : row) {
            System.out.printf("%s ", col);
        }
        System.out.println();
    }
}
}
}
