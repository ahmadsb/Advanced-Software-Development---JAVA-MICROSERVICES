package InterView.LinkedList;

import java.io.File;

public class Runner {
    public static void printList(LinkedList.Node root){
        if(root == null){
            System.out.println();
            return ;

        }
        File f = new File("");
        System.out.print(root.getVal()+"->");
        printList(root.getNext());

    }
    public static void main(String[] args){
        LinkedList lnklst = new LinkedList();
        lnklst.addFirst(10);
        lnklst.addFirst(20);

        lnklst.addFirst(30);
        lnklst.addFirst(40);
        printList(lnklst.getHead());
        lnklst.reverse();
        printList(lnklst.getHead());

    }
}
