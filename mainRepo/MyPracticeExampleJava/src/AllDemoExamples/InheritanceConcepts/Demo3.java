package AllDemoExamples.InheritanceConcepts;

class Demo3 {
    public void vishnu(String name, int id) {
        System.out.println("company name = " + name);
        System.out.println("company id = " + id);
    }

    public void vishnu(int id, String name) {   //both parameter name are sam
        System.out.println("company id is = " + id);
        System.out.println("company name is = " + name);
    }
}

class method {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.vishnu(120, "TCS");
        obj.vishnu("Nexzera", 1253);
    }
}
