import java.util.Objects;

public class Ticket {

    int number;
    Ticket(int n){
        this.number = n;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }


}
