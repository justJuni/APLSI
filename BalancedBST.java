import java.util.ArrayList;

/*
 * Taken from rosettacode.org
 * No author attributed where we pulled this from.
 */
public class BalancedBST {
	private Node root;
//    private int key;
 
//    private class Node {
//        private int key;
//        private int balance;
//        private Node left, right, parent;
// 
//        Node(int k, Node p) {
//            key = k;
//            parent = p;
//        }
//    }
//    
//    public BalancedBST(){
//    	root = new Node(key, null);
//    }
    
    public boolean insert(int key) {
        if (root == null)
            root = new Node(key, null);
        else {
            Node n = root;
            Node parent;
            while (true) {
                if (n.getElement() == key)
                    return false;
 
                parent = n;
 
                boolean goLeft = n.getElement() > key;
                n = goLeft ? n.getLeft() : n.getRight();
 
                if (n == null) {
                    if (goLeft) {
                        parent.setLeft(new Node(key, parent));
                    } else {
                        parent.setRight(new Node(key, parent));
                    }
                    rebalance(parent);
                    break;
                }
            }
        }
        return true;
    }
 
    public void delete(int delKey) {
        if (root == null)
            return;
        Node n = root;
        Node parent = root;
        Node delNode = null;
        Node child = root;
 
        while (child != null) {
            parent = n;
            n = child;
            child = delKey >= n.getElement() ? n.getRight() : n.getLeft();
            if (delKey == n.getElement())
                delNode = n;
        }
 
        if (delNode != null) {
            delNode.setElement(n.getElement());
 
            child = n.getLeft() != null ? n.getLeft(): n.getRight();
 
            if (root.getElement() == delKey) {
                root = child;
            } else {
                if (parent.getLeft() == n) {
                    parent.setLeft(child);
                } else {
                    parent.setRight(child);
                }
                rebalance(parent);
            }
        }
    }
    
    public int find(int findKey){
    	return findKey(findKey, root);
    }
 
    private void rebalance(Node n) {
        setBalance(n);
 
        if (n.getBalance() == -2) {
            if (height(n.getLeft().getLeft()) >= height(n.getLeft().getRight()))
                n = rotateRight(n);
            else
                n = rotateLeftThenRight(n);
 
        } else if (n.getBalance() == 2) {
            if (height(n.getRight().getRight()) >= height(n.getRight().getLeft()))
                n = rotateLeft(n);
            else
                n = rotateRightThenLeft(n);
        }
 
        if (n.getParent() != null) {
            rebalance(n.getParent());
        } else {
            root = n;
        }
    }
 
    private Node rotateLeft(Node a) {
 
        Node b = a.getRight();
        b.setParent(a.getParent());
 
        a.setRight(b.getLeft());
 
        if (a.getRight() != null)
            a.getRight().setParent(a);
 
        b.setLeft(a);
        a.setParent(b);
 
        if (b.getParent() != null) {
            if (b.getParent().getRight() == a) {
                b.getParent().setRight(b);
            } else {
                b.getParent().setLeft(b);
            }
        }
        setBalance(a, b);
        return b;
    }
 
    private Node rotateRight(Node a) {
 
        Node b = a.getLeft();
        b.setParent(a.getParent());
        a.setLeft(b.getRight());
 
        if (a.getLeft() != null)
            a.getLeft().setParent(a);
 
        b.setRight(a);
        a.setParent(b);
 
        if (b.getParent() != null) {
            if (b.getParent().getRight() == a) {
                b.getParent().setRight(b);
            } else {
                b.getParent().setLeft(b);
            }
        }
        setBalance(a, b);
        return b;
    }
 
    private Node rotateLeftThenRight(Node n) {
        n.setLeft(rotateLeft(n.getLeft()));
        return rotateRight(n);
    }
 
    private Node rotateRightThenLeft(Node n) {
        n.setRight(rotateRight(n.getRight()));
        return rotateLeft(n);
    }
 
    private int height(Node n) {
        if (n == null)
            return -1;
        return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
    }
 
    private void setBalance(Node... nodes) {
        for (Node n : nodes)
            n.setBalance(height(n.getRight()) - height(n.getLeft()));
    }
 
    public void printBalance() {
        printBalance(root);
    }
 
    private void printBalance(Node n) {
        if (n != null) {
            printBalance(n.getLeft());
            System.out.printf("%s ", n.getBalance());
            printBalance(n.getRight());
        }
    } 
    
    private int findKey( int x, Node sRoot)
    {
    	//if the root is null
    	if(sRoot == null)
    		//return null because nothing is there
    		return 0;
    	//value of the compare to
    	int compareResult = Integer.compare(x, sRoot.getElement());
    	//if the compare result is less than 0
    	if(compareResult<0)
    		//recursively run find on the left node
    		return findKey(x, sRoot.getLeft());
    	//if the compare result is greater than 0
    	else if(compareResult > 0)
    		//recursively run find on the right node
    		return findKey( x, sRoot.getRight());
    	//else x has been found
    	else
    		//return element at root
    		return sRoot.getElement();
    }
 }