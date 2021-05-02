package at.ac.tuwien.ep2;

/**
 * An implementation of interface @link(Body).
 * Thus, it forces us to implement all methods declared in @link(Body), but also
 * all methods of the inherited interfaces -> @link(Comparable).
 */
public class NumberBody implements Body {

    private Integer number;

    public NumberBody(Integer number) {
        this.number = number;
    }

    @Override
    public String get() {
        return number.toString();
    }

    @Override
    public int compareTo(Object o) {
        return number.toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
