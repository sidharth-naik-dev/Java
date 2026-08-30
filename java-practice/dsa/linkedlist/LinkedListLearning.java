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
        tail.next = tail;
        count++;
    }
    public void insertAtPosition(int data, int pos){
        if (head == null || count == 0 || count < pos || pos <= 0){
            System.out.println("Invalid Position");
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
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        LinkedListLearning ll1 = new LinkedListLearning();
        ll1.insertAtFirst(1);
        ll1.insertAtFirst(2);
        ll1.insertAtFirst(3);
        ll1.insertAtFirst(4);
        ll1.insertAtFirst(5);

        ll1.display();
    }
}
