public final class  AlgoCompile {
    public static <T> T max(T x, T y){
        //return x > y ? x : y; // basically won't compile as we cannot apply a logical operator to generic type
        return x;
    }
}
