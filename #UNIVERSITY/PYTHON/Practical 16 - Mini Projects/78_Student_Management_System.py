# 78. Student Class Management System: Use class, object, constructor.

class Student:
    def __init__(self, roll_no, name, marks):
        self.roll_no = roll_no
        self.name = name
        self.marks = marks
    
    def display(self):
        print(f"Roll No: {self.roll_no}, Name: {self.name}, Marks: {self.marks}")

students = []
students.append(Student(1, "Alice", 85))
students.append(Student(2, "Bob", 90))
students.append(Student(3, "Charlie", 78))

print("Student Details:")
for s in students:
    s.display()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
