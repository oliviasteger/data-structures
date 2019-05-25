public class DoubleLinkedList {
  public DoubleNode head;

  public DoubleLinkedList() {
    this.head = null;
  }

  public void add(String z) {
    DoubleNode node = new DoubleNode(z);
    DoubleNode last = this.head;
    node.next = null;
    if (head != null) {
      while (last.next != null) {
        last = last.next;
      }
      last.next = node;
      node.previous = last;
    } else {
      node.previous = null;
      this.head = node;
    }
  }

  public void remove(String z) {
    if (this.head == null || !contains(z)) {
      return;
    }

    if (this.head.getData() == z) {
      head = head.next;
      head.previous = null;
      return;
    }

    DoubleNode toBeDeleted = this.head;
    while (toBeDeleted != null) {
      if (toBeDeleted.getData() == z) {
        if (toBeDeleted.next != null) {
          toBeDeleted.next.previous = toBeDeleted.previous;
        }
        if (toBeDeleted.previous != null) {
          toBeDeleted.previous.next = toBeDeleted.next;
        }
        return;
      } else {
        toBeDeleted = toBeDeleted.next;
      }
    }
  }

  public String peek() {
    return head.getData();
  }

  public int length() {
    int len = 1;
    DoubleNode next = this.head;
    while (next.next != null) {
      len++;
      next = next.next;
    }
    return len;
  }

  public boolean contains(String z) {
    DoubleNode next = this.head;
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
