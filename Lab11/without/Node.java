class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        // n1->n2->n3->null
        Node head = n1;
        while(head != null){
            System.out.println("value: " + head.data);
            head = head.next;
        }
    }
}