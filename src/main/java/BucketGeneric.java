public class BucketGeneric<T> { // bucket is an object that can hold a reference to an object, T, which has not been specified yet.

    private T content; // T stands for generic which tells the compiler what type of content the bucket will have

    public BucketGeneric(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Sand sandEverywhere = new Sand();
        Water tapwata = new Water();
        BucketGeneric bg = new BucketGeneric(sandEverywhere);// you can now fill the bucket with w/e e.g. sand
        BucketGeneric wb = new BucketGeneric(tapwata);// or fill with water as well ...
    }

    public T getContent() {
        return content;
    }

    private static class Sand {
    }

    private static class Water {
    }
}
