# 72. Program demonstrating abstraction using abstract class

from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, r):
        self.r = r
    
    def area(self):
        return 3.14 * self.r * self.r

c = Circle(5)
print(f"Area of Circle: {c.area()}")

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
