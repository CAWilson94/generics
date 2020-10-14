import java.util.List;


public final class AlgoCompile {

    public static void main(String[] args) {
        AlgoCompile ac = new AlgoCompile();
        List bob = List.of(1, 2, 3, 4, 5);
        ac.print(bob);
    }

    public static <T> T max(T x, T y) {
        //return x > y ? x : y; // basically won't compile as we cannot apply a logical operator to generic type
        return x;
    }

    public static void print(List<? extends Number> list) { // yes this compiles ...
        for (Number n : list)
            System.out.println(n + " ");
        System.out.println();
    }
}
