# 79. Library Management System: Use inheritance for books and members.

class LibraryMember:
    def __init__(self, member_id, name):
        self.member_id = member_id
        self.name = name
    
    def display_member(self):
        print(f"Member ID: {self.member_id}, Name: {self.name}")

class Book(LibraryMember):
    def __init__(self, member_id, name, book_title):
        super().__init__(member_id, name)
        self.book_title = book_title
    
    def display_details(self):
        super().display_member()
        print(f"Borrowed Book: {self.book_title}")

b = Book(101, "David", "Python Programming")
b.display_details()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
