# 64. Program to create a student class and display details

class Student:
    def __init__(self, name, roll_no):
        self.name = name
        self.roll_no = roll_no
    
    def display(self):
        print(f"Student Name: {self.name}")
        print(f"Roll No: {self.roll_no}")

s = Student("Bob", 101)
s.display()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
