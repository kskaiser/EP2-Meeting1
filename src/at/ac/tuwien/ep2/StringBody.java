package at.ac.tuwien.ep2;

/**
 * An implementation of interface @link(Body).
 * Thus, it forces us to implement all methods declared in @link(Body), but also
 * all methods of the inherited interfaces -> @link(Comparable).
 */
public class StringBody implements Body {

    private String text;

    public StringBody(String text) {
        this.text = text;
    }

    @Override
    public String get() {
        return text;
    }

    @Override
    public int compareTo(Object o) {
        return this.text.compareTo(o.toString());
    }

    @Override
    public String toString() {
        return text;
    }

}
