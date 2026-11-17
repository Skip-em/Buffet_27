l = int(input("please enter line lenght: "))
d = input("enter direction | v for verticle and h for horizontal")

if d == "v":
    for x in range(0, l):
        print("*")
elif d == "h":
    for x in range(0, l):
        print("*", end="")
else:
    print("Invalid direction. Please enter 'v' or 'h'.")