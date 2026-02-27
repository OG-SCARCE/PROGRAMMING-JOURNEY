# 65. Program to create an employee class and calculate salary

class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary
    
    def calculate_bonus(self):
        return self.salary * 0.10

emp = Employee("Charlie", 50000)
print(f"Employee: {emp.name}")
print(f"Salary: {emp.salary}")
print(f"Bonus: {emp.calculate_bonus()}")

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
