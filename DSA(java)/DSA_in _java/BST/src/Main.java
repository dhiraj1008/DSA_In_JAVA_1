public class Main {
    public static void main(String[] args) {
        //Binary Search tree - BST is a binary tree with nodes arranged in some order (left<root  && right>=root,for tree and its subtree)..
        System.out.println("Binary Search Tree !");
        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(51));
        tree.insert(new Node(15));
        tree.insert(new Node(15));
        tree.insert(new Node(8));
        tree.insert(new Node(7));
        tree.insert(new Node(2));


        tree.display();

        System.out.println(tree.search(7));

        System.out.println("Minimum element in a tree "+tree.findMin());

        tree.remove(8);
        tree.remove(51);

        tree.display();
    }
}