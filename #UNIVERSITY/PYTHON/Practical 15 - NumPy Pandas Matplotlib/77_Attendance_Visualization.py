# 77. Attendance Visualization: Plot attendance using Matplotlib.

import matplotlib.pyplot as plt

students = ['Alice', 'Bob', 'Charlie', 'David', 'Eva']
attendance = [90, 85, 70, 95, 80]

plt.figure(figsize=(8, 5))
plt.bar(students, attendance, color='skyblue')
plt.xlabel('Students')
plt.ylabel('Attendance (%)')
plt.title('Student Attendance')
plt.ylim(0, 100)
plt.show()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
