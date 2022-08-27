package InterView.LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
    }
    public void reverse(){
        Node prev = null;
        Node next = head;
        Node curr = head;

        while (curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
