package at.ac.tuwien.ep2;

/**
 * Interface for the node's body.
 * In our example, all node body classes (StringBody, NumberBody) must implement this interface.
 * Furthermore, the interface "extends" interface <code>Comparable</code> and
 * thus forces us to implement the <code>compareTo</code> method.
 */
public interface Body extends Comparable {

    String get();
    String toString();
}
