# 53. Program to check palindrome using function

def is_palindrome(s):
    return s == s[::-1]

text = "racecar"
if is_palindrome(text):
    print(f"'{text}' is a palindrome.")
else:
    print(f"'{text}' is not a palindrome.")

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
