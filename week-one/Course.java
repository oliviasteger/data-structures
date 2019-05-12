import java.util.ArrayList;

public class Course {
  String myName;
  ArrayList<Nano> myStudents = new ArrayList<Nano>();
  private ArrayList<Mentor> myMentors = new ArrayList<Mentor>();

  public Course(String name) {
    myName = name;
  }
  public void addStudent(Nano nano) {
    myStudents.add(nano);
  }

  public void setMentor(Mentor mentor) {
    if (myMentors.size() != 0) {
      while (myMentors.size() != 0) {
        myMentors.remove(0);
      }
    }
    myMentors.add(0, mentor);
  }

  public void setMentors(Mentor[] mentors) {
    if (myMentors.size() != 0) {
      while (myMentors.size() != 0) {
        myMentors.remove(0);
      }
    }
    for (int i = 0; i < mentors.length; i++) {
      myMentors.add(mentors[i]);
    }
  }

  public int getClassSize() {
    return myStudents.size();
  }

  public int getMentorSize() {
    return myMentors.size();
  }

  public void removeMentor(Mentor mentor) {
    for (int i = 0; i < myMentors.size(); i++) {
      if (myMentors.get(i) == mentor) {
        myMentors.remove(i);
      }
    }
  }

  public void removeStudent(Nano student) {
    for (int i = 0; i < myStudents.size(); i++) {
      if (myStudents.get(i) == student) {
        myStudents.remove(i);
      }
    }
  }

  public boolean isNanoInTheClass(Nano student) {
    for (int i = 0; i < myStudents.size(); i++) {
      if (myStudents.get(i) == student) {
        return true;
      }
    }
    return false;
  }

  public ArrayList<Nano> rosterSortedAlphabetically() {
    if (myStudents.size()!=0) {
      ArrayList<Nano> newRoster = new ArrayList<Nano>();
      Nano student = myStudents.get(0);
      int index = 0;
      while (myStudents.size() > 0) {
        for (int x = 0; x < myStudents.size(); x++) {
          if (myStudents.get(x).compareTo(student) == 1) {
            student = myStudents.get(x);
            index = x;
          }
        }
        myStudents.remove(index);
        newRoster.add(newRoster.size()-1, student);
      }
      for (int i = 0; i < newRoster.size(); i++) {
        myStudents.set(i, newRoster.get(i));
      }
      return myStudents;
    } else {
      throw new NullPointerException("No students in this class!");
    }
  }
}
