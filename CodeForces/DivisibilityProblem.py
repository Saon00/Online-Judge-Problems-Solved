t = int(input())
while (t > 0):
    a, b = map(int, input().split())
    if a % b == 0:
        print(0)
    else:
        print(b - a % b)
    t -= 1
    
# https://codeforces.com/problemset/problem/1328/A

"""  Time limit exceeds

t = int(input())
c = 0

while (t > 0):
    a, b = map(int, input().split())
    while True:
        if a % b == 0:
            print(c)
            break
        else:
            a += 1
            c += 1
    c = 0
    t -= 1
"""
