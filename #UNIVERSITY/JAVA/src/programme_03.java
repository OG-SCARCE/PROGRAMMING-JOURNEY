class Section52 {
    String name;

    Section52(String name) {
        this.name = name;
        System.out.println("Section52 constructor called. Name set to: " + name);
    }

    void Attendance() {
        System.out.println("Your Attendance has been Marked...");
    }
}

class Student extends Section52 {
    String RollNo;

    Student(String name, String RollNo) {
        super(name);
        this.RollNo = RollNo;
        System.out.println("Student constructor called. RollNo set to: " + RollNo);
    }

    @Override
    void Attendance() {
        super.Attendance();
        System.out.println("Thank you for attending the class !!!");
    }

    void displayInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("RollNo: " + this.RollNo);
    }
}

public class programme_3 {
    public static void main(String[] args) {
        Student d = new Student("Aman", "24SCSE1260003");
        d.Attendance();
        d.displayInfo();
    }
}
