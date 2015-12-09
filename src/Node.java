
public class Node{

    private int element, balance;
    private Node left, right, parent;

    /**
     * Creates a node with no children.
     * @param theElement the element to store in this node.
     */
    Node(int theElement, Node theParent)
    {
        element = theElement;
        left = right = null;
        parent = theParent;
    }

    /**
     * Get the current balance value stored in this node.
     * @return the balance
     */
    public int getBalance()
    {
        return balance;
    }
    /**
     * Set the current balance value stored in this node.
     * @param value the new balance value to set
     */
    public void setBalance(int value)
    {
        balance = value;
    }
    
    /**
     * Get the current data value stored in this node.
     * @return the element
     */
    public int getElement()
    {
        return element;
    }

    /**
     * Set the data value stored in this node.
     * @param value the new data value to set
     */
    public void setElement(int value)
    {
        element = value;
    }

    /**
     * Get the left child of this node.
     * @return a reference to the left child.
     */
    public Node getLeft()
    {
        return left;
    }

    /**
     * Set this node's left child.
     * @param value the node to point to as the left child.
     */
    public void setLeft(Node node)
    {
        left = node;
    }

    /**
     * Get the right child of this node.
     * @return a reference to the right child.
     */
    public Node getRight()
    {
        return right;
    }

    /**
     * Set this node's right child.
     * @param value the node to point to as the right child.
     */
    public void setRight(Node node)
    {
        right = node;
    }
    /**
     * Get the parent of this node.
     * @return a reference to the parent.
     */
    public Node getParent()
    {
        return parent;
    }

    /**
     * Set this node's parent.
     * @param value the node to point to as the parent.
     */
    public void setParent(Node node)
    {
        parent = node;
    }
}
