package weekTen;

public class Node {private Node nextNode;
    // item stored in the node--of type Object so any type can be stored
    private Object item;

    // default constructor sets variables to null
    public Node()
    {
        nextNode = null;
        this.item = null;
    }

    // overloaded constructor takes item object as a parameter to set the value of item
    public Node(Object item)
    {
        this.item = item;
    }

    // getters and setters for next and item
    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setNextNode(Node next)
    {
        this.nextNode = next;
    }

    public Object getItem()
    {
        return this.item;
    }

    public void setItem(Object item)
    {
        this.item = item;
    }
}
}
