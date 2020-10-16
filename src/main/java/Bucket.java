/**
 * You created a bucket you can easily fill with water.
 * What if you wanted to fill with sand though?? Not possible, your bucket only accepts water.
 * To make your class more flexible you can use generics ...
 */

public class Bucket {

    public static void main(String[] args) {
        Water tapwata = new Water();
        Bucket niceBucket = new Bucket(tapwata);
    }

    private Water content;

    public Bucket(Water content){
        this.content = content;
    }

    public Water getContent() {
        return content;
    }

    private static class Water {
        public Water() {
        }
    }
}
