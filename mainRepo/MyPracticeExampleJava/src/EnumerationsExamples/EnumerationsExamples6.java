package EnumerationsExamples;

enum Student {
    John(11), Bella(10), Sam(13), Viraaj(9);
    private int age;

    int getage() {
        return age;
    }

    private Student(int age)  //constructor defined in enum Student
    {
        this.age = age;
    }
}

public class EnumerationsExamples6 {
    public static void main(String args[]) {
        Student S;

        System.out.println("Age of Viraaj is " + Student.Viraaj.getage() + " years");
    }
}
