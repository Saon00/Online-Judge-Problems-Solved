n = int(input())
levels = []
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a.pop(0)
b.pop(0)
levels = list(set(a + b))
print("I become the guy." if len(levels) == n else "Oh, my keyboard!")

# https://codeforces.com/problemset/problem/469/A
