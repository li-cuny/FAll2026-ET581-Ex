class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<String> s1 = new Node<>("a");
        Node<String> s2 = new Node<>("b");
        Node<String> s3 = new Node<> ("c");
        n1.next = n2;
        n2.next = n3;
        s1.next = s2;
        s2.next = s3;
        // n1->n2->n3->null
        Node<Integer> head = n1;
        Node<String> headString = s1;
        while(head != null|| headString!= null){
            System.out.println("value: " + head.data);
            System.out.println("valueString: " + headString.data);
            head = head.next;
            headString = headString.next;
        }
    }
}