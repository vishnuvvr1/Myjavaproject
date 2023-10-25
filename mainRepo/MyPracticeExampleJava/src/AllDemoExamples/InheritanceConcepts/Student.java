package AllDemoExamples.InheritanceConcepts;

class Demo5 {
    public void student(String name, int id) {
        System.out.println("student name is = " + name);
        System.out.println("student id is = " + id);
        System.out.println("my name is saif");
    }
}

public class Student {
    public void student(String name1, int id1) {        // super class method override the sub class
        System.out.println("student1 name is = " + name1);
        System.out.println("student1 id is = " + id1);
        System.out.println("my name is vishnu");
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.student("saif", 1250);

    }
}

