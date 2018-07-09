public class BinarySearchTree {
 
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(30);
        int[] a = { 35, 57, 15, 63, 49, 89, 77, 67, 98, 91 };
        for (int n : a)
            bst.insert(n);
        System.out.println("Preorder Traversal :");
        bst.traversePreOrder();
 
        System.out.println("\nInorder Traversal :");
        bst.traverseInOrder();
 
        System.out.println("\nPostorder Traversal :");
        bst.traversePostOrder();
    }
 
    int data;
    BinarySearchTree left;
    BinarySearchTree right;
 
    public BinarySearchTree(int i) {
        this.data = i;
        this.left = null;
        this.right = null;
    }
 
    public void insert(int i) {
        if (i < this.data) {
            if (this.left != null)
                this.left.insert(i);
            else
                this.left = new BinarySearchTree(i);
        } else {
            if (this.right != null) {
                this.right.insert(i);
            } else {
                this.right = new BinarySearchTree(i);
            }
        }
    }
 
    // PreOrder Traversal : visit the node first, then left and right sub-trees
    public void traversePreOrder() {
        System.out.print(this.data + " ");
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }
 
    // InOrder Traversal : Visit left sub-tree, then node and then, right sub-tree
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.print(this.data + " ");
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }
 
    // PostOrder Traversal : Visit left sub-tree, then right sub-tree and then the node
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.print(this.data + " ");
    }
 
}
