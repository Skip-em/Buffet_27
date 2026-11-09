g = int(input( "Enter a year u wanna check!"))

y = g%4

if y == 0:
    print(str(g) + " is a leap year")
else:
    print("not a leap year")

