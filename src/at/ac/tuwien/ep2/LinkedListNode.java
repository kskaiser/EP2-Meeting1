package at.ac.tuwien.ep2;

public class LinkedListNode implements INode {

    // Data definitions go there
    private Body body;
    private LinkedListNode next;


    // Constructors go there
    public LinkedListNode(Body body, LinkedListNode next) {
        this.body = body;
        this.next = next;
    }

    // Methods go there ...
    public boolean add(LinkedListNode newNode) {
        if (next == null) {
            next = newNode;
            return true;
        }
        return next.add(newNode);
    }

    public boolean addSorted(LinkedListNode newNode) {
        // TODO: implement code here

        return false;
    }

    public void remove() {
        // TODO: implement code here
    }

    @Override
    public String toString() {
        return body.toString();
    }

    public INode getNext() {
        return next;
    }
}
