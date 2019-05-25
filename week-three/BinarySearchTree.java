public class BinarySearchTree {
  BinarySearchNode root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void add(int key) { 
    root = addRec(root, key); 
  } 
      
  private BinarySearchNode addRec(BinarySearchNode root, int key) { 
    if (root == null) { 
      root = new BinarySearchNode(key); 
      return root; 
    } 
  
    if (key < root.data) {
      root.left = addRec(root.left, key); 
    } else if (key > root.data) {
      root.right = addRec(root.right, key); 
    }
    
    return root; 
  } 

  public int height(BinarySearchNode node) {
    if (node == null) {
      return 0;
    } else {
      int leftHeight = height(node.left);
      int rightHeight = height(node.right);

      if (leftHeight > rightHeight) {
        return (leftHeight + 1);
      } else {
        return (rightHeight + 1);
      }
    }
  }

  public int count() {
    return countHelper(this.root);
  }

  private int countHelper(BinarySearchNode node) {
    if (node == null) {
      return 0;
    } else {
      int counter = 1;
      counter += countHelper(node.left);
      counter += countHelper(node.right);
      return counter;
    }
  }

  public boolean includes(int data) {
    return includesHelper(this.root, data);
  }

  private boolean includesHelper(BinarySearchNode node, int data) {
    boolean response = false;
    while (node != null && !response) {
      if (data < node.data) {
        node = node.left;
      } else if (data > node.data) {
        node = node.right;
      } else {
        response = true;
        break;
      }
      response = includesHelper(node, data);
    }
    return response;
  }

  public int min() {
    return minHelper(this.root);
  }

  private int minHelper(BinarySearchNode node) {
    BinarySearchNode current = node;

    while (current.left != null) {
      current = current.left;
    }

    return current.data;
  }

  public int max() {
    return maxHelper(this.root);
  }

  private int maxHelper(BinarySearchNode node) {
    BinarySearchNode current = node;

    while (current.right != null) {
      current = current.right;
    }

    return current.data;
  }

  public void drawTree() {
    drawTreeHelper(this.root, 0, 2);
  }

  public void drawTreeHelper(BinarySearchNode node, int space, int count) {
    if (node == null) {
      return;
    }

    space += count;

    drawTreeHelper(node.right, space, 2);  
  
    for (int i = count; i < space; i++)  
        System.out.print(" ");  
    System.out.print(node.data + "\n");  
  
    drawTreeHelper(node.left, space, 2);  
  }
}
