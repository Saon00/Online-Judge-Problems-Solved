name = input()
newList = []

for i in name:
    if i not in newList:
        newList.append(i)

if (len(newList) % 2 == 0):
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")


# https://codeforces.com/problemset/problem/236/A
