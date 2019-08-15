//package LinkedList;

//A complete working Java program to demonstrate all
// Doubly Linked list Node
class Node<T> {

   // Constructor to create a new node
   // next and prev is by default initialized as null
   Node(T data) {
      this.data = data;
   }

   public T getData() {
      return this.data;
   }
   public void setData(T data) {
      this.data = data;
   }
   public Node getPrev() {
      return this.prev;
   }
   public void setPrev(Node prev) {
      this.prev = prev;
   }
   public Node getNext() {
      return this.next;
   }
   public void setNext(Node next) {
      this.next = next;
   }

   private T data;
   private Node prev;
   private Node next;
}

//Class for Doubly Linked List
public class DLL<T> {
   // Adding a node at the front of the list
   public void push(T new_data) {
      // 1. allocate node
      // 2. put in the data
      Node new_Node = new Node(new_data);

      // 3. Make next of new node as head and previous as NULL
      new_Node.setNext(head);
      new_Node.setPrev(null);

      // 4. change prev of head node to new node
      if (head != null) {
         head.setPrev(new_Node);
      }

      // 5. move the head to point to the new node
      head = new_Node;
   }

   // Given a node as prev_node, insert a new node after the given node
   public void InsertAfter(Node prev_Node, T new_data) {

      // 1. check if the given prev_node is NULL
      if (prev_Node == null) {
         System.out.println("The given previous node cannot be NULL ");
         return;
      }

      // 2. allocate node
      // 3. put in the data
      Node new_node = new Node(new_data);

      // 4. Make next of new node as next of prev_node
      new_node.setNext(prev_Node.getNext());

      // 5. Make the next of prev_node as new_node
      prev_Node.setNext(new_node);

      // 6. Make prev_node as previous of new_node
      new_node.setPrev(prev_Node);

      // 7. Change previous of new_node's next node
      if (new_node.getNext() != null) {
         new_node.getNext().setPrev(new_node);
      }
   }

   // Add a node at the end of the list
   void append(T new_data) {
      // 1. allocate node
      // 2. put in the data
      Node new_node = new Node(new_data);

      Node last = head; // used in step 5

      // 3. This new node is going to be the last node, so make next of it as NULL
      new_node.setNext(null);

      // 4. If the Linked List is empty, then make the new node as head
      if (head == null) {
         new_node.setPrev(null);
         head = new_node;
         return;
      }

      // 5. Else traverse till the last node
      while (last.getNext() != null) {
         last = last.getNext();
      }

      // 6. Change the next of last node
      last.setNext(new_node);

      // 7. Make last node as previous of new node
      new_node.setPrev(last);
   }

   // This function prints contents of linked list starting from the given node
   public void printlist(Node node) {
      Node last = null;
      System.out.println("Traversal in forward Direction");
      while (node != null) {
         System.out.print(node.getData() + " ");
         last = node;
         node = node.getNext();
      }
      System.out.println();
      System.out.println("Traversal in reverse direction");
      while (last != null) {
         System.out.print(last.getData() + " ");
         last = last.getPrev();
      }
   }

   /* Drier program to test above functions */
   public static void main(String[] args) {
      /* Start with the empty list */
      DLL dll = new DLL();

      // Insert 6. So linked list becomes 6->NULL
      dll.append(6);

      // Insert 7 at the beginning. So linked list becomes 7->6->NULL
      dll.push(7);

      // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL
      dll.push(1);

      // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL
      dll.append(4);

      // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL
      dll.InsertAfter(dll.head.getNext(), 8);

      System.out.println("Created DLL is: ");
      dll.printlist(dll.head);
   }

   public Node head; // head of list
}
