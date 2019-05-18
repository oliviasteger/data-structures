class Main {
  public static void main(String[] args) {
    Nano droid = new Nano("Droid", "droid@nanohackers.org");
    Mentor mentor = new Mentor("Mentor", "mentor@nanohackers.org");
    Mentor mentor1 = new Mentor("Mentor 1", "mentor1@nanohackers.org");
    Mentor mentor2 = new Mentor("Mentor 2", "mentor2@nanohackers.org");
    Course course = new Course("Data Structures");
    Mentor[] mentors = new Mentor[2];
    mentors[0] = mentor1;
    mentors[1] = mentor2;
    course.addStudent(droid);
    course.getClassSize();
    course.addMentor(mentor);
    course.addMentors(mentors);
    course.getMentorSize();
    course.removeMentor(mentor1);
    course.removeStudent(droid);
    course.isNanoInTheClass(droid);
    course.rosterSortedAlphabetically();
  }
}
