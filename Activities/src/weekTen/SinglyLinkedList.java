package weekTen;

public class SinglyLinkedList {private Node head;
    private Node tail;
    // number of elements in list
    private int size;

    // constructor
    public SinglyLinkedList()
    {
        // list is empty at instantiation
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // checks if list is empty; returns true or false
    public boolean isEmpty()
    {
        return head == null;
    }

    public int getSize()
    {
        return size;
    }

    // adds new item to tail of list -- same as addLast
    public void add(Object item)
    {
        Node newNode = new Node(item);
        size++; // increment number of elements in the list

        // if list is empty, then head is null, and it now holds new item
        // and since it is the only node, it is also the tail for now
        if (head == null)
        {
            head = newNode;
            tail = head;
        }
        // if head is not null, the current node at the tail has its link set to the new node
        // and then the new node becomes the tail
        else
        {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // adds new item to the head of the list
    public void addFirst(Object item)
    {
        Node newNode = new Node(item);
        size++;

        if (head == null)
        {
            head = newNode;
            tail = head;
        }
        // if there is a head node, then the new node becomes the head
        // and sets its link to the previous head node (which is shifted to second position)
        else
        {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    // inserts a new item at an index position
    public void addAtPosition(Object item, int index)
    {
        // new node to insert
        Node newNode = new Node(item);
        // we start at current node, which is the head
        Node currentNode = head;

        if (index >= size)
        {
            System.out.println("Invalid index");
        }
        // if index is 0, call addFirst() method to place in first position
        else if (index == 0)
        {
            this.addFirst(item);
        }
        else
        {
            index = index - 1;
            // loops through the size of the list
            for (int i = 0; i < size; i++)
            {
                // if i is equal to the index number...
                if (i == index)
                {
                    // then the current node's current link node is set to a temp node
                    Node tempNode = currentNode.getNextNode();
                    // the current node is given a new link node--the new node
                    currentNode.setNextNode(newNode);
                    // the new node's link is set to the temp node
                    newNode.setNextNode(tempNode);
                    break;
                }
                // if i is not equal to index number, then move to next node (starts at head)
                currentNode = currentNode.getNextNode();
            }
            size++;
        }
    }

    public void removeAtPosition(int index)
    {
        if (index >= size)
        {
            System.out.println("Invalid index");
        }
        // if index is 0, remove head by making it's next link node the head
        else if (index == 0)
        {
            head = head.getNextNode(); // head's link node becomes new head
            size--;
        }

        // if index is last node--what is the code doing?
        else if (index == size - 1)
        {
            Node s = head;
            Node t = head;
            while (s != tail)
            {
                t = s;
                s = s.getNextNode();
            }
            tail = t;
            tail.setNextNode(null);
            size--;
        }

        else
        {
            Node currentNode = head;
            for (int i = 1; i < size - 1; i++)
            {
                if (i == index)
                {
                    // temp node is set to current node's next link
                    Node temp = currentNode.getNextNode();
                    // temp now set to it's own next link
                    temp = temp.getNextNode();
                    // current node's next link is to temp
                    // --it's previous next link is "removed" since now no link to it
                    currentNode.setNextNode(temp);
                    break;
                }
                currentNode = currentNode.getNextNode();
            }
            size--;
        }
    }

    public void display()
    {
        if (size == 0)
        {
            System.out.println("List is empty");
        }

        // if head is pointing to null, it's the only node so print it
        else if (head.getNextNode() == null)
        {
            System.out.println(head.getItem());
        }

        else
        {
            //print head and a pointer to next node
            Node currentNode = head;
            System.out.print(head.getItem() + " -> ");
            currentNode = currentNode.getNextNode();
            // keep printing the next node after head until until
            // reach the the one that points to null (the tail)
            while (currentNode.getNextNode() != null)
            {
                System.out.print(currentNode.getItem() + " -> ");
                currentNode = currentNode.getNextNode();
            }
            // print tail
            System.out.print(currentNode.getItem() + "\n");
        }
    }

}
}
