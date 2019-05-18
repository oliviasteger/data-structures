class Main {
  public static void main(String[] args) {
    Node n = new Node("H");
    Node z = new Node("Y");
    System.out.println(n.getData());
    n.setData("Z");
    System.out.println(n.getData());
    System.out.println(n.getNext());
    n.setNext(z);
    System.out.println(n.getNext());
    LinkedList y = new LinkedList();
    y.add("1");
    y.add("2");
    y.add("3");
    y.add("4");
    System.out.println(y.peek());
    y.remove("3");
    System.out.println(y.length());
    System.out.println(y.contains("5"));
  }
}
