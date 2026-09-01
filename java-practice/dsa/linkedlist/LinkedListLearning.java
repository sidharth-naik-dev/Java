package linkedlist;

class LinkedListLearning {
    private int count = 0;

    static class  Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertAtFirst(int data){
        System.out.println("Inserting at First");
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            tail = newNode;
            count++;
            return;
        }
        newNode.next = head;
        head = newNode;
        count++;
    }

    public void insertAtEnd(int data){
        System.out.println("Inserting at End");
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            tail = temp;
            count++;
            return;
        }
        tail.next = temp;
        tail = tail.next;
        count++;
    }

    public void insertAtPosition(int data, int pos){
        System.out.println("Inserting at Position: " + pos);

        if (count == 0 || count + 1 < pos || pos <= 0){
            System.out.println("Invalid Position or List is Empty");
            return;
        }
        if(pos == 1){
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        
        if (pos == count + 1){
            tail.next = newNode;
            tail = newNode;
            count++;
            return;
        }
        Node current = head;
        
        for(int i = 1; i < pos-1; i++){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        count++;
    }

    public void deleteFirst(){
        System.out.println("Deleting first Element");

        if  (head == null){
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
        count--;

        if  (head == null){
            tail = null;
        }

        System.out.println("Deleted Successfully");
    }

    public void deleteAtPosition(int pos){
        System.out.println("Deleting Element at Position: " + pos);

        if(pos > count || pos <= 0 || count == 0){
            System.out.println("Invalid Position or List is Empty");
            return;
        }

        if(pos == 1){
            deleteFirst();
            return;
        }

        Node current = head;

        for(int i = 1; i < pos-1; i++){
            current = current.next;
        }

        if(pos == count){
            tail = current;
            tail.next = null;
            count--;
            System.out.println("Deleted Successfully");
            return;
        }

        Node temp = current.next;
        current.next = temp.next;
        count--;
        System.out.println("Deleted Successfully");
    }

    public void display() {
        Node current = head;
        System.out.println("List:");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("Null");
        System.out.println();

        if (head == null) {
            System.out.println("Empty List");
        } else {
            System.out.println("Head = " + head.data);
            System.out.println("Tail = " + tail.data);
        }
    }

    public void displayCount(){
        System.out.println("Count : " + count);
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListLearning ll = new LinkedListLearning();
        ll.insertAtFirst(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtPosition(4, 40);

        ll.display();
        ll.displayCount();

        ll.deleteFirst();
        ll.display();
        ll.displayCount();

        ll.deleteAtPosition(3);
        ll.display();
        ll.displayCount();

        ll.deleteAtPosition(3);
        ll.display();
        ll.displayCount();

        ll.deleteFirst();
        ll.display();
        ll.displayCount();

        ll.deleteAtPosition(1);
        ll.display();
        ll.displayCount();

        ll.deleteFirst();
        ll.display();
        ll.displayCount();
    }
}
