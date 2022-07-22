// Java program to reverse a linked list
import java.util.*;

public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements? ");
        int ele = scanner.nextInt();

        for (int i = 0; i < ele; i++) {
            System.out.println("Enter element "+(i+1)+":");
            String str = scanner.next();
            linkedList.add(str);
        }
        System.out.println("Before reversing"+linkedList);

        linkedList = linkedListReversing(linkedList);
        System.out.println("After reversing"+linkedList);
    }

    public static LinkedList<String> linkedListReversing(LinkedList<String> linkedList)
    {
        for (int i = 0; i < linkedList.size() / 2; i++)
        {
            String str1 = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size() - i - 1));
            linkedList.set(linkedList.size() - i - 1, str1);
        }

        return linkedList;
    }
}
