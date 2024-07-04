public class BinarySearchTree {
    Node root;
    public  void insert(Node node)
    {
        root = insertHelper(root,node);
    }
    private Node insertHelper(Node root,Node node){
        int data = node.data;
        if(root==null){
            return node;
        } else if (data < root.data) {
            root.left = insertHelper(root.left,node);
        }
        else {
            root.right = insertHelper(root.right,node);
        }
        return  root;
    }
    public void display()
    {
   displayHelper(root);
    }
    private void displayHelper(Node root) {
        if(root!=null)
        {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);

        }
    }
    public boolean search(int data)
    {
        return searchHelper(root,data);
    }
    private boolean searchHelper(Node root,int data)
    {
        if(root==null)
            return false;
        else if(root.data==data) {
            return true;
        }
        else if (root.data<data) {
            return searchHelper(root.right,data);
        }
        else {
            return  searchHelper(root.left,data);
        }

    }
  public void remove(int data)
  {
   if(search(data)){
        removeHelper(root,data);
   }
   else {
       System.out.println(data + " could not be found ");
   }
  }
  public Node removeHelper(Node root,int data){
        if(root==null)
        {
            root = null;
        }
        else if(data< root.data){
            root.left=removeHelper(root.left,data);
        } else if (data>root.data) {
            root.right=removeHelper(root.right,data);

        }
        else {
            //case 1: no child;
            if(root.left==null && root.right==null){
                root=null;
            }
            //one node
            else if(root.right==null){
                root = root.left;
            }
            else if(root.left==null)
            {
                root =root.right;
            }
            else {
                //in case of two children,converted to one-children;
          Node temp=findMinHelper(root.right);
          root.data=temp.data;
          root.right=removeHelper(root.right,temp.data);

            }

        }
        return  root;
  }
public  Node findMin()
{
    return findMinHelper(root);
}
  public Node findMinHelper(Node root){
        if (root.left==null){
            return root;
        }
        return findMinHelper(root.left);
  }


}
