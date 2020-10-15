import java.net.Inet4Address;

/**
 * Bounded type parameters - restricting the types that are used as arguments in parameterized type.
 * E.g. a method that operates on numbers might want to only accept instances of Number or its subclasses.
 * This is what bounded type parameters are for.
 * <p>
 * To declare a bounded type parameter - (1) list the type parameters name
 * (2) followed by the extends keyword
 * (3) followed by its UPPER BOUND
 *
 * In addition to limiting the types you can use to instantiate a generic type ...
 * Bounded type parameters allow you to invoke methods defined in the bounds
 */
public class Box<T> {

    private T t;

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(10);
        integerBox.inspect(10);
        //integerBox.inspect("some text"); // this is a strong therefore error ...
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
