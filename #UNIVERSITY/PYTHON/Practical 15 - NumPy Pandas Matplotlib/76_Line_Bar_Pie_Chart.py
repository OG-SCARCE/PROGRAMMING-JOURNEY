# 76. Program to plot line graph, bar chart, pie chart

import matplotlib.pyplot as plt

# Line Graph
x = [1, 2, 3, 4]
y = [10, 20, 25, 30]
plt.figure()
plt.plot(x, y)
plt.title("Line Graph")
plt.show()

# Bar Chart
categories = ['A', 'B', 'C']
values = [10, 15, 7]
plt.figure()
plt.bar(categories, values)
plt.title("Bar Chart")
plt.show()

# Pie Chart
sizes = [30, 20, 50]
plt.figure()
plt.pie(sizes, labels=categories, autopct='%1.1f%%')
plt.title("Pie Chart")
plt.show()

print(
    "Name : Aman Patel\n"
    "Admission Number : 24SCSE1260003\n"
    "Batch : P2"
)
