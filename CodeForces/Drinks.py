t = int(input())
line = list(map(int, input().split()))
n = 0
for i in line:
    n += i / 100

print("{:.12f}".format((n / t) * 100))

# https://codeforces.com/problemset/problem/200/B
