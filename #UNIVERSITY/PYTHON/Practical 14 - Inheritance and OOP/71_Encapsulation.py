# 71. Program demonstrating encapsulation

class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # Private variable
    
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited: {amount}")
    
    def get_balance(self):
        return self.__balance

acc = BankAccount(1000)
acc.deposit(500)
print(f"Balance: {acc.get_balance()}")
# print(acc.__balance) # This would raise AttributeError

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
