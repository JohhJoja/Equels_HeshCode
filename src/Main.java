import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Den Brawn","Code Da'Vinci");

        Ticket tik1 = new Ticket(1123);
        Ticket tik1_copy = new Ticket(1123);

        Map<Ticket, Book> library = new HashMap<>();
        library.put(tik1,book1);

        System.out.println(library.get(tik1_copy).toString());

    }
}