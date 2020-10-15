public class GreaterCountBound {
    // you cannot use > operator to compare objects such as T, must be primitive type subclass number
    // fix this by using a type parameter bounded by a ComparableExample interface ...
    public static <T extends ComparableExample<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
