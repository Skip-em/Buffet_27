symbol = input("what symbol would you like to use? ")
width = int(input("wuts the width of your box? "))
height = int(input("wuts the height of your box? "))
print()

for i in range(0,height):
  print(symbol * width)