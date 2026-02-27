# 80. Shape Area Calculator: Use method overriding for different shapes

class Shape:
    def area(self):
        print("Calculating area...")

class Rectangle(Shape):
    def __init__(self, l, w):
        self.l = l
        self.w = w
    
    def area(self):
        return self.l * self.w

class Circle(Shape):
    def __init__(self, r):
        self.r = r
    
    def area(self):
        return 3.14 * self.r * self.r

r = Rectangle(10, 5)
c = Circle(7)

print(f"Rectangle Area: {r.area()}")
print(f"Circle Area: {c.area()}")

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
