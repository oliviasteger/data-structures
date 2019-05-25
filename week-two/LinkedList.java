public class LinkedList {
  public Node head;

  public LinkedList() {
    this.head = null;
  }

  public void add(String z) {
    Node node = new Node(z);
    if (this.head == null) {
      this.head = node;
    } else {
      Node last = this.head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = node;
    }
  }

  public void remove(String z) {
    Node current = this.head;
    Node prev = null;
    if (current != null && current.getData() == z) {
      this.head = current.next;
    } 
  }

  public String peek() {
    return head.getData();
  }

  public int length() {
    int len = 1;
    Node next = this.head;
    while (next.next != null) {
      len++;
      next = next.next;
    }
    return len;
  }

  public boolean contains(String z) {
    Node next = this.head;
    while (next != null) {
      if (next.getData() == z) {
        return true;
      } else {
        next = next.next;
      }
    }
    return false;
  }
}
