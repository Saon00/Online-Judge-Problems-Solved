t = int(input())
x = 0
while t > 0:
    line = input()
    if (line[1] == '+'):
        x = x + 1
    else:
        x = x - 1

    t = t - 1

print(x)

# https://codeforces.com/problemset/problem/282/A
