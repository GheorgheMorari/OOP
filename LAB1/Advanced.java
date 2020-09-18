//Advanced 1 si 2 Morari Gheorghe
import java.util.ArrayList;
import java.util.List;

public class Advanced
{
  public static void main (String[]args)
  {
    University utm = new University ("UTM", 1964);
      utm.add (new Student ("Ion", 20, 7.2f));
      utm.add (new Student ("Vasile", 23, 10f));
      utm.add (new Student ("Mihai", 24, 10f));
      utm.printAverage ();

    University usm = new University ("USM", 1946);
      usm.add (new Student ("Bogdan", 20, 7.1f));
      usm.add (new Student ("Dumitru", 29, 10f));
      usm.add (new Student ("Alexandru", 24, 5.9f));
      usm.printAverage ();

    University ust = new University ("UST", 1955);
      ust.add (new Student ("Ghenadie", 19, 7.5f));
      ust.add (new Student ("Tudor", 29, 8f));
      ust.add (new Student ("Dinu", 21, 7.9f));
      ust.printAverage ();
  }
}

class University
{
  String name;
  int foundationYear;
    List < Student > students;
    University (String name, int foundationYear)
  {
    this.name = name;
    this.foundationYear = foundationYear;
    this.students = new ArrayList < Student > ();
  }
  void add (Student student)
  {
    students.add (student);
  }
  float getAverage ()
  {
    float ret = 0f;
  for (Student individ:students)
      {
	ret += individ.mark;
      }
    ret /= students.size ();
    return ret;
  }

  void printAverage ()
  {
    float average = getAverage ();

    System.out.printf ("Universitatea %s, media: %f\n", name, average);
  }

}

class Student
{
  String name;
  int age;
  public float mark;
    Student (String name, int age, float mark)
  {
    this.name = name;
    this.age = age;
    this.mark = mark;
  }
}
