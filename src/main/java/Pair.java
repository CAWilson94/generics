/**
 * What is this class converted to after type erasure?
 * Type erasure - the process of (1) enforcing type constraints only at compile time
 *                               (2) discarding element type information at runtime
 * @param <K>
 * @param <V>
 */
public class Pair {

    private Object  key;
    private Object  value; // replacing unbound types with type object, ensuring type safety of our code.


    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public  Object getKey() {
        return key;
    }

    public void setKey(Object  key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object  value) {
        this.value = value;
    }
}
