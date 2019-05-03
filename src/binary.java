class Bnode{
    int data;
    Bnode left;
    Bnode right;
}
public class binary {
    public static Bnode insert(int data)
    {   Bnode temp=new Bnode();
        temp.data=data;
        temp.left=null;
        temp.right=null;
        return temp;

    }
    public static void main(String args[])
    {   binary obj=new binary();
        Bnode root=obj.insert('A');
        root.left=obj.insert('B');
        root.right=obj.insert('C');
        root.left.left=obj.insert('D');
        root.left.right=obj.insert('E');
        inorderDisplay(root);
        preorderDisplay(root);
        postorderDisplay(root);

    }
    public static void inorderDisplay(Bnode root)
    {
                if(root==null)
                    return;
                else
                {  inorderDisplay(root.left);
                    System.out.println(root.data);
                    inorderDisplay(root.right);

                }
    }
    public static void preorderDisplay(Bnode root)
    {
        if(root==null)
            return;
        else
        { System.out.println(root.data);
            inorderDisplay(root.left);

            inorderDisplay(root.right);

        }
    }
    public static void postorderDisplay(Bnode root)
    {
        if(root==null)
            return;
        else
        {
            inorderDisplay(root.left);

            inorderDisplay(root.right);
            System.out.println(root.data);

        }
    }
}
