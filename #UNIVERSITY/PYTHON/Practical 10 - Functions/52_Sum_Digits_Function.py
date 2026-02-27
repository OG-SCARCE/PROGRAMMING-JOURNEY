# 52. Program to find sum of digits using function

def sum_of_digits(n):
    return sum(int(digit) for digit in str(n))

num = 12345
print(f"Number: {num}")
print(f"Sum of digits: {sum_of_digits(num)}")

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
