package AllDemoExamples.InheritanceConcepts;

class Animal {
    Animal getObj(int x, float y) {
        System.out.println("sum of two numbers is = " + (x + y));
        return new Animal();
    }
}

class Dog extends Animal {
    Dog getObj(int x, float y)     //override
    {
        System.out.println("sub of the two numbers is = " + (x - y));
        return new Dog();
    }

    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.getObj(1024, 230.17f);
    }
}

