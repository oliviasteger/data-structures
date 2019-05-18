public class Nano extends Person {
  public Nano(String name, String email) {
    super("Nano", name, email);
  }

  public int compareTo(Nano nano) {
    if (this.getName().compareTo(nano.getName()) < 0) {
      return -1;
    } else if (this.getName().compareTo(nano.getName()) > 0) {
      return 1;
    } else {
      return 0;
    }
  }
}
