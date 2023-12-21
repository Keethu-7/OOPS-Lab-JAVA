import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyList {
    Node head;

    // Insert at the end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete a given element
    void delete(int key) {
        Node current = head;
        
        while (current != null) {
            if (current.data == key) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                break;
            }
            current = current.next;
        }
    }

    // Display the contents of the list
    void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoubleList {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        Scanner sc = new Scanner(System.in);

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display(); // Display the original list
        
	System.out.print("Enter key to delete: ");
	int del=sc.nextInt();
        list.delete(del); // Delete element with value 2
        list.display(); // Display the list after deletion
    };
}
