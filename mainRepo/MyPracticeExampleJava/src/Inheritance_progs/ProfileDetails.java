package Inheritance_progs;

class Profile {
    String name;
    int age;
    String college;
    long mobilenumnber;

    Profile() {
        name = "";
        age = 0;
        college = "";
        mobilenumnber = 0;
    }

    Profile(String name, int age, String college, Long mobilenumnber) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.mobilenumnber = mobilenumnber;
    }

    public void profileDetails() {
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
        System.out.println("My college is = " + college);
        System.out.println("My mobilenumber is = " + mobilenumnber);

    }

}

public class ProfileDetails extends Profile {
    public static void main(String[] args) {
        Profile obj = new Profile("V.vishnu", 25, "Gist", 8919209082L);
        obj.profileDetails();

    }

}
