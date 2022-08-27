package InterView.BinaryTree;


public class Runner {

    private static int getHeight(BTree.Node root){
        if(root == null)
            return 0 ;
        int left = getHeight(root.getLeft()) +1;
        int right = getHeight(root.getRight()) + 1;
        if(Math.abs(left-right) > 1)
            return -1;
        return Math.abs(left-right) + 1;
    }
    public static boolean isBalanced(BTree.Node root){
       if(getHeight(root) == -1)
           return false;
    return true;
    }
    public static void printBS(BTree.Node root){

        if( root == null){
            return;
        }

        printBS(root.getLeft());
        System.out.print(root.getVal()+", ");
        printBS(root.getRight());
    }

    public static void main(String [] args){
        System.out.println("Hello World");
        BTree root = new BTree();
        root.insertNode(5);
//        root.insertNode(3);
        root.insertNode(7);
//        root.insertNode(2);
//        root.insertNode(4);
        root.insertNode(6);
        root.insertNode(8);
        root.insertNode(9);
        printBS(root.getHead());
        System.out.println(isBalanced(root.getHead()));







    }
}
