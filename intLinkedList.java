/**
 * @author David Ogunbanjo
 */

public class intLinkedList {
    private Node head;

    public intLinkedList(){
        this.head = null;
    }

    public void addToEnd(int data){
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
            return;
       }

        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Add an insert method
    /*
    public void insert(int data, int position){
        Node newNode = new Node(data);
        if (position == 0){
            this.head = newNode;
            return;
        }
        Node current = this.head;
        int num = 1;
        while(current.next != null){
            current = current.next;
            num += 1;
        }
    }
     */

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        }

        Node current = this.head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            } else {
                current = current.next;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder SBL = new StringBuilder();
        SBL.append("[");
        Node head = this.head;
        while(head.next != null){
            SBL.append("-");
            SBL.append(head.data);
            SBL.append("-");
            head = head.next;
        }
        SBL.append("-");
        SBL.append(head.data);
        SBL.append("-]");
        return SBL.toString();
    }
}
