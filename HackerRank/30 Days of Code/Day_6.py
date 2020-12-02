limit = int(input())

for i in range(limit):
    name = input()
    print(name[::2],name[1::2])
