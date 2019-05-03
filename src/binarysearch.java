import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
public class binarysearch {
    static Scanner sc=new Scanner(System.in);

    static Node insert(Node root,Node newnode) {
        if(root==null) {
            root =newnode;
        }
        else if(root.data>newnode.data) {
            if(root.right==null)
                root.right=newnode;
            else
                insert(root.right,newnode);
        }
        else {
            {
                if(root.left==null)
                    root.left=newnode;
                else
                    insert(root.left,newnode);
            }
        }
        return root;
    }

    public static void inorderDisplay(Node root)
    {
        if(root==null)
            return;
        else
        {  inorderDisplay(root.left);
            System.out.println(root.data);
            inorderDisplay(root.right);

        }
    }
    public static void preorderDisplay(Node root)
    {
        if(root==null)
            return;
        else
        { System.out.println(root.data);
            inorderDisplay(root.left);

            inorderDisplay(root.right);

        }
    }

    public static boolean search(Node root,int data) {
        if(root==null)
            return false;
        else if(root.data==data)
            return true;
        else if(root.data>data)
            return search(root.left,data);
        else
            return search(root.right,data);
    }

    public static void main(String[] args) {
        Node root=null;
       for(int i=1;i<=10;i++) {
           root=insert(root,new Node(i));
       }
       inorderDisplay(root);
       System.out.println(search(root,3));

    }


}
