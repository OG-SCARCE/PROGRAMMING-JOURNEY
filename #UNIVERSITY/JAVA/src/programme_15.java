class programme_15 {
    String name;
    int rollNo;
    String address;

    programme_15() {
        name = "Unknown";
        rollNo = 0;
        address = "Not Provided";
    }

    programme_15(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        programme_15 s1 = new programme_15();
        programme_15 s2 = new programme_15("Aman", 101, "Delhi");

        s1.display();
        System.out.println();
        s2.display();
    }
}