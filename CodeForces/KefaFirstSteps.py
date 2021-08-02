t = int(input())
line = list(map(int, input().split()))
maxLine = []
c = 0
for i in range(t - 1):
    if line[i + 1] >= line[i]:
        c += 1
    else:
        maxLine.append(c)
        c = 0
maxLine.append(c)
print(max(maxLine) + 1)

# https://codeforces.com/problemset/problem/580/A

"""  Java Solution
https://codeforces.com/problemset/status/580/problem/A
"""
