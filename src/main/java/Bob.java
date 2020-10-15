public class Bob {

    public static void main(String[] args) {
        Bob bob = new Bob();
        int exampleNumber = 10;
        String exampleErrorNumber = "10";
        bob.BobIntPlain(exampleErrorNumber);
    }

    public int BobIntPlain(int a){
        int count = 0;
        count = count + a;
        return count;
    }

    public <T extends Integer> int bobIntNumber(T a){ // obviously this proves that there is no actual use case for
        int count = 0; // generic methods to be used on a non collection input
        count = a + count;
        return count;
    }
}
