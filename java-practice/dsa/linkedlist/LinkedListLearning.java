package linkedlist;

class LinkedListLearning {
    public int count = 0;
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
        if (head == null || count == 0 || count < pos || pos <= 0){
            System.out.println("Invalid Position or List is Empty");
            return;
        } else if(pos == 1){
            insertAtFirst(data);
            return;
        }
        Node current = head;
        for(int i = 1; i < pos-1; i++){
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        count++;
    }
    public void deleteFirst(){
        if  (head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        count--;
    }
    public void deleteAtPosition(int pos){
        if(pos > count || pos <= 0 || count == 0){
            System.out.println("Invalid Position or List is Empty");
            return;
        }else if(pos == 1){
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
            return;
        }
        Node temp = current.next;
        current.next = temp.next;
        count--;
    }
    public void display() {
        Node current = head;
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
    }
    public static void main(String[] args) {
        LinkedListLearning ll1 = new LinkedListLearning();
        ll1.insertAtFirst(2);
        ll1.insertAtEnd(3);
        ll1.insertAtEnd(4);
        ll1.insertAtEnd(5);
        ll1.insertAtEnd(6);
        ll1.insertAtFirst(1);
        ll1.insertAtPosition(0, 6);

        ll1.display();
        ll1.displayCount();

        ll1.deleteFirst();
        ll1.display();
        ll1.displayCount();

        ll1.deleteAtPosition(6);
        ll1.display();
        ll1.displayCount();

        ll1.deleteAtPosition(3);
        ll1.display();
        ll1.displayCount();
    }
}
