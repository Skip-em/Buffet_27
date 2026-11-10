num = int(input("please enter a number: "))

y = 0

for x in range (1, (num)):
    print(x , end="+")
    y= y+x
    
y=y+num
print(num)
print("the sum of your num from 1 to " + str(num) + " equals: "+ str(y))