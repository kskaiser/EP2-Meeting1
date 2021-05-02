package at.ac.tuwien.ep2;

/**
 * Interface for all "node" classes.
 * Helps to print out all lists -- no matter what node type (LinkedListNode, DoubleLinkedListNode)
 */
public interface INode {

    String toString();

    INode getNext();
}
