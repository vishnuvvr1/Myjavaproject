package Methodoverloading;

class College {
    String principal;
    String Name;
    String Address;
    String noofBranches;

    public College() {

    }

    College(String principal, String Name, String Address, String noofBranches) {
        this.principal = principal;
        this.Name = Name;
        this.Address = Address;
        this.noofBranches = noofBranches;
    }

    public void Details() {
        System.out.println("Principal = " + principal);
        System.out.println("Name = " + Name);
        System.out.println("Address = " + Address);
        System.out.println("No.of Branches = " + noofBranches);
    }
}

    class Gist extends College {
        int CollegeId;

        Gist(String principal, String Name, String Address, String noofBranches, int CollegeId) {
            super(principal, Name, Address, noofBranches);
            this.CollegeId = CollegeId;
        }

        @Override
        public void Details() {
            System.out.println("Principal = " + principal);
            System.out.println("Name = " + Name);
            System.out.println("Address = " + Address);
            System.out.println("No.of Branches = " + noofBranches);
            System.out.println("CollegeId = " + CollegeId);

        }

        public static void main(String[] args) {

        }

    }

