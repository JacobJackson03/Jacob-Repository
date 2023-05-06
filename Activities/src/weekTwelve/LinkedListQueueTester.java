package weekTwelve;

public class LinkedListQueueTester {public static void main(String[] args)
{
    LinkedListQueue names = new LinkedListQueue();

    names.enqueue("Tom");
    names.enqueue("Jane");
    names.enqueue("Beth");

    System.out.println(names.displayQueue());

    names.enqueue("John");
    names.enqueue("Mary");

    System.out.println(names.displayQueue());
    System.out.println("Queue is empty: " + names.isEmpty());
    System.out.println("Number of items in queue is " + names.size());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();

    System.out.println("Remove " + names.dequeue());
    System.out.println();
    System.out.println(names.displayQueue());
    System.out.println("Queue is empty: " + names.isEmpty());
    System.out.println("Number of items in queue is " + names.size());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();

    System.out.println("Remove " + names.dequeue());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();
    System.out.println("Remove " + names.dequeue());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();
    System.out.println("Remove " + names.dequeue());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();
    System.out.println("Remove " + names.dequeue());
    System.out.println("The head of the queue is: " + names.peek());
    System.out.println();
    System.out.println("Queue is empty: " + names.isEmpty());

}

}
}
