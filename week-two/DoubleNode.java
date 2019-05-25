public class DoubleNode {
  public DoubleNode previous;
  private String data;
  public DoubleNode next;

  public DoubleNode(String data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public DoubleNode getNext() {
    return this.next;
  }

  public void setNext(DoubleNode next) {
    this.next = next;
  }

  public DoubleNode getPrevious() {
    return this.previous;
  }

  public void setPrevious(DoubleNode previous) {
    this.previous = previous;
  }
}
