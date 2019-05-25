public class BinarySearchNode {
  BinarySearchNode left;
  BinarySearchNode right;
  BinarySearchNode parent;
  int data = 0;
  
  public BinarySearchNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
    this.parent = null;
  }
}
