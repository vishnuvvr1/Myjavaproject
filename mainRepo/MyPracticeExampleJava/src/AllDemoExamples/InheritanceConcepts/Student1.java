package AllDemoExamples.InheritanceConcepts;


    class Demo6 {
        protected void student(String name, int id) {   // we can put the protected output will be worked
            System.out.println("student name is = " + name);
            System.out.println("student id is = " + id);
            System.out.println("my name is saif");
        }
    }

    class Student1 extends Animal {
        public void student(String name1, int id1) {      // we can put the private output will be error
            System.out.println("student1 name is = " + name1);
            System.out.println("student1 id is = " + id1);
            System.out.println("my name is vishnu");
        }

        public static void main(String[] args) {
            AllDemoExamples.InheritanceConcepts.Student obj = new AllDemoExamples.InheritanceConcepts.Student();
            obj.student("saif", 1250);

        }
    }


