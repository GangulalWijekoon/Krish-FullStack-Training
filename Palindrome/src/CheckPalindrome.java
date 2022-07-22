/*
This approach uses stack to check if a linked list is palindrome
*/
import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class CheckPalindrome {
    public static void main(String[] args) {
        CheckPalindrome linkedlist = new CheckPalindrome();
        linkedlist.head = new Node(1);
        linkedlist.insert(2);
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(1);

        linkedlist.List(linkedlist.head);
        if (linkedlist.isPalindrome(linkedlist.head)) {
            System.out.println("This is Palindrome LinkedList");
        } else {
            System.out.println("This is not a Palindrome LinkedList");
        }

        CheckPalindrome linkedlist1 = new CheckPalindrome();
        linkedlist1.head = new Node(4);
        linkedlist1.insert(2);
        linkedlist1.insert(5);
        linkedlist1.insert(6);
        linkedlist1.List(linkedlist1.head);
        if (linkedlist1.isPalindrome(linkedlist1.head)) {
            System.out.println("This is Palindrome LinkedList");
        } else {
            System.out.println("This is not Palindrome LinkedList");
        }

    }
    Node head;

    public void insert(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;

        // if it's not the first node, then traverse the
        // complete linked list till the end
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void List(Node head) {
        System.out.println("Printing the linked list");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    public boolean isPalindrome(Node head) {
        Stack<Integer> myStack = new Stack<>();
        Node temp = head;
        boolean status = false;


        while (temp != null) {
            myStack.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            int element = myStack.pop();
            if (temp.data == element) {
                status = true;
                temp = temp.next;
            } else {
                status = false;
                break;
            }
        }

        return status;

    }


}

