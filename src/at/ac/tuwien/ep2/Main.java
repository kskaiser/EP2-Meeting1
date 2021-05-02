package at.ac.tuwien.ep2;

public class Main {

    // LinkedList starts here:
    private static LinkedListNode head = null;

    // DoubleLinkedList starts here:
    private static DoubleLinkedListNode doubleHead = null;
    private static DoubleLinkedListNode doubleTail = null;

    // Binary Tree starts here:
    private static TreeNode root;

    public static void main(String[] args) {

        System.out.println("\nUnsorted list: ");

        addListNode("Tini");
        addListNode("Judith");
        addListNode(27);
        addListNode("Fabian");
        addListNode("Adrian");
        addListNode(42);
        addListNode("Sarah");
        addListNode(73);

        printList(head);

        System.out.println("\n\nSorted list: ");

        addSortedListNode("Judith");
        addSortedListNode("Elsa");
        addSortedListNode(798);
        addSortedListNode("Julia");
        addSortedListNode("Sarah");
        addSortedListNode(2);
        addSortedListNode(5);
        addSortedListNode("Anna");

        printList(doubleHead);
    }

    private static void addSortedListNode(Object o) {
        Body body = null;
        if (o instanceof String)
            body = new StringBody((String) o);
        else if (o instanceof Integer)
            body = new NumberBody((Integer) o);
        if (doubleHead != null) {
            doubleHead.add(body);
            while (doubleHead.getPrev() != null) {
                doubleHead = (DoubleLinkedListNode) doubleHead.getPrev();
            }
            while (doubleTail.getNext() != null)
                doubleTail = (DoubleLinkedListNode) doubleTail.getNext();
        } else {
            doubleHead = new DoubleLinkedListNode(null, body, null);
            doubleTail = doubleHead;
        }
    }

    private static void addListNode(Object o) {
        Body body = null;
        if (o instanceof String)
            body = new StringBody((String) o);
        else if (o instanceof Integer)
            body = new NumberBody((Integer) o);
        LinkedListNode newNode = new LinkedListNode(body, null);
        if (head == null)
            head = newNode;
        else
            head.add(newNode);
    }

    /**
     * Prints a list by providing its <code>head</code>.
     * By using the interface @link(INode) we can use the
     * method for both the simple linked list and the double linked list.
     * @param head
     */
    private static void printList(INode head) {
        INode node = head;
        System.out.println("\n*** Print list ***");
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }

}
