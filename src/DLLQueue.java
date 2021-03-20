import java.util.EmptyStackException;

public class DLLQueue<T extends Comparable<T>> implements Queue<T> {
    private Node tail, head;

    public DLLQueue() {
        //Creating header and trailer nodes (head and tail)
        head = new Node(null, null, null);
        tail = new Node(null, null, head);
        head.next = tail;

    }

    public void enqueue(T it) {
        //Adding new node to the back of the queue.
        //Next node is always the tail or trailer.
        Node node = new Node(it, tail, null);

        //If the queue is empty, the node will go between the head and tail.
        if (isEmpty()) {
            node.prev = head;
            head.next = node;
        }
        //If queue is not empty, new node goes between the last item added and the tail
        else {
            tail.prev.next = node;
            node.prev = tail.prev;

        }

        tail.prev = node; //Tail will always come after the last item entered
    }


    public T dequeue() {
        if (isEmpty()) {
            //The stack is empty
            throw new EmptyStackException();
        }
        //Return the frontValue or first entered value and then make the
        //front node equal to the one before it
        else {
            T temp = frontValue();
            head.next = head.next.next;
            return temp;

        }
    }


    public T frontValue() {
        //Front node in the queue is always right after the head
        T temp = head.next.data;
        return temp;
    }


    public int length() {
        //Use temp node to check each node in the queue for nullness and get a count
        Node temp = head.next;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }


    public boolean contains(T it) {
        //Use temp node to check each node and determine if it contains the generic object
        Node temp = head.next;

        while (temp.data != null) {
            if (temp.data.compareTo(it) == 0) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    //Nested Node class
    private class Node {
        Node prev, next;
        T data;

        public Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    //Queue is empty if it only contains the head and tail nodes
    @Override
    public boolean isEmpty() {
        return (head.next == tail);
    }

    //Loop through the queue and add to the string.
    public String toString() {
        if (isEmpty()) {
            return "Empty Queue.";
        } else {
            StringBuilder sb = new StringBuilder();
            Node temp = head.next;

            while (temp.data != null) {
                sb.append(temp.data);
                sb.append("\n");
                temp = temp.next;
            }

            return sb.toString();
        }
    }
}