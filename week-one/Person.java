public class Person {
  private String myType;
  private String myName; 
  private String myEmail; 

  public Person(String type, String name, String email) {
    myType = type;
    myName = name;
    myEmail = email;
  }

  public String getType() {
    return myType;
  }

  public String getName() {
    return myName;
  }

  public String getEmail() {
    return myEmail;
  }

  public String getNameAndEmail() {
    return "Name: " + myName + " Email: " + myEmail;
  }
}
