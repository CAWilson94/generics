/**
 * In addition to limiting the types you can use to instantiate a generic type ...
 * Bounded type parameters allow you to invoke methods defined in the bounds
 */
public class NaturalNumber<T extends Integer>{
    private T n;

    public NaturalNumber(T n){
        this.n = n;
    }

    public boolean isEven(){
        return n.intValue() % 2 == 0; // the isEven method invokes the intValue method defined in the integer class through n
    }
}
