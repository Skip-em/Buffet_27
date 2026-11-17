import random

l = int(input("how many nums do u want? "))
numbers = [random.randint(1, 10) for x in range(l - 1)]

for num in numbers:
    print(num, end=", ")
print(num)
