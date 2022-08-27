package InterView.BinaryTree;


public class BTree {
    private Node head;

    public BTree() {
        head = null;
    }

    void insertNode( int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp!= null){

            if(temp.getLeft() == null && temp.getRight() == null)
            {
                if(temp.getVal() < val){
                    temp.setRight(newNode);
                }else if(temp.getVal() > val){
                    temp.setLeft(newNode);
                }
                return;
            }

            if(temp.getVal() == val){
                System.out.println("The value is already exists");
                return;
            }else if(temp.getVal() < val){
                if(temp.right == null)
                {
                    temp.setRight(newNode);
                    return;
                }
                temp = temp.right;
            }else{
                if(temp.left == null)
                {
                    temp.setLeft(newNode);
                    return;
                }
                temp = temp.left;
            }
        }




    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    public class Node {
        private int val;
        private Node left,right;

        public Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
