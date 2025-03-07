import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Den Brawn","Code Da'Vinci");
        Book book2 = new Book("Alex Hersh","Gravity Falls");
        Book book3 = new Book("Poll Garden","How i grown potato");

        Ticket tik1 = new Ticket(1123);
        Ticket tik2 = new Ticket(4567);
        Ticket tik3 = new Ticket(8901);

        Map<Ticket, Book> library = new HashMap<>();
        library.put(tik1,book1);
        library.put(tik2,book2);
        library.put(tik3,book3);

        System.out.println(library.get(tik1).toString());

    }
}