n1 = int(input("Please enter a number: "))
op = input("Please enter a operation: ")
n2 = int(input("Please enter a second number: "))

if(op == "-"):
    ans= n1-n2
    print(str(n1) + " - "+ str(n2) + " = " + str(ans))

elif(op == "+"):
    ans= n1+n2 
    print(str(n1)+ " + "+str(n2) + " = " + str(ans))

elif(op == "*"):
    ans= n1*n2 
    print(str(n1)+ " * "+ str(n2) + " = " + str(ans))

elif(op == "/"):
    ans= n1/n2 
    print(str(n1)+ " / "+ str(n2) + " = " + str(ans))
else:
    print("operation unkown")
