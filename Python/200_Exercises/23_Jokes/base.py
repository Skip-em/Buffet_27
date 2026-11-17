import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()


ans = input("Do you want a single or two part joke? (answer 1 or 2): ")
num = int(input("how many jokes do you want?"))
print("--------------------------------")

for x in range(0,num):

    joke = requests.get("https://v2.jokeapi.dev/joke/Any?explicit&type=single").json()
    joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,explicit&type=twopart").json()

    if ans == "1":
        print(joke["joke"])
        print("--------------------------------")
    elif ans == "2":
        print(joke2Part["setup"] + "  " + joke2Part["delivery"])
        print("--------------------------------")
    else:
        print("did not understand")


