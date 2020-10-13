import java.util.Arrays;
import java.util.Collection;

public class ExchangeThePosition {

    public static void main(String[] args) {
    String array[] = new String[]{ "something", "something", "dark", "side"};
    ExchangeThePosition exchangeThePosition = new ExchangeThePosition();
    System.out.println("Original Array: " + Arrays.toString(array));
    exchangeThePosition.positionExchange(array, 0, 2);
    System.out.println("Swapped Array: " + Arrays.toString(array));
    }

    public <T> void positionExchange(T[] thangs, int i, int j) {
        T tempThangs = thangs[i];
        thangs[i] = thangs[j];
        thangs[j] = tempThangs;
    }
}
