# 67. Program using parameterized constructor

class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print("Parameterized constructor called")
    
    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

s = Student("Alice", 20)
s.display()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
