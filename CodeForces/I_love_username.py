n = int(input())
num = list(map(int, input().split()))
c = 0
miN = maX = num[0]
for i in range(1, n):
    if miN > num[i]:
        miN = num[i]
        c += 1
    elif maX < num[i]:
        maX = num[i]
        c += 1

print(c)


# https://codeforces.com/problemset/problem/155/A
