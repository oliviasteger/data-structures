class Main {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(1);
    tree.add(0);
    tree.add(2);
    tree.add(3);
    tree.add(7);
    tree.add(6);
    tree.add(5);
    tree.add(300);
    tree.add(270);
    tree.add(365);
    System.out.println(tree.height(tree.root));
    System.out.println(tree.count());
    System.out.println(tree.includes(2));
    System.out.println(tree.min());
    System.out.println(tree.max());
    tree.drawTree();
  }
}
