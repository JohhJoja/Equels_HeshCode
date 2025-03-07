public class Book {

    String auth;
    String name;

    Book(String a, String n){
        this.auth = a;
        this.name = n;
    }

    @Override
    public String toString() {
        return this.auth+" - "+this.name;
    }
}
