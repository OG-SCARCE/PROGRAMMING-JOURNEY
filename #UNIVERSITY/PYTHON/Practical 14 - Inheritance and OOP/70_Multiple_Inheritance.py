# 70. Program demonstrating multiple inheritance

class Father:
    def gardening(self):
        print("Father enjoys gardening")

class Mother:
    def cooking(self):
        print("Mother enjoys cooking")

class Child(Father, Mother):
    def playing(self):
        print("Child enjoys playing")

c = Child()
c.gardening()
c.cooking()
c.playing()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
