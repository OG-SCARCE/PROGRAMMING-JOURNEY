# 66. Program using default constructor

class Student:
    def __init__(self):
        self.name = "Unknown"
        self.age = 0
        print("Default constructor called")
    
    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

s = Student()
s.display()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
