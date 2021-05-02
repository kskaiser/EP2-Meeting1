package at.ac.tuwien.ep2;

public class DoubleLinkedListNode implements INode {

    private DoubleLinkedListNode prev;
    private Body body;
    private DoubleLinkedListNode next;

    public DoubleLinkedListNode(DoubleLinkedListNode prev, Body body, DoubleLinkedListNode next) {
        this.prev = prev;
        this.body = body;
        this.next = next;
    }

    public boolean add(Body body) {
        // TODO:
        if (this.body.compareTo(body) == 0)
            return false;
        if (this.body.compareTo(body) > 0) {
            // wenn Knoten erreicht, dann erstelle neuen DoubleLinkedListNode mit "prev" und "next"
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(this.prev, body, this);
            if (this.prev != null)
                this.prev.next = newNode;
            this.prev = newNode;
            return true;
        }
        if (next == null) {
            // add a new Node past the current node
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(this, body, null);
            this.next = newNode;
            return true;
        }
        return this.next.add(body);
    }

    public INode getPrev() {
        return prev;
    }

    public INode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return body.toString();
    }
}
