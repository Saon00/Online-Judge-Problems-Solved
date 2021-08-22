t = int(input())
line = input()
zCount = line.count('z')
nCount = line.count('n')

for i in range(nCount):
    print(1, end=" ")
for i in range(zCount):
    print(0, end=" ")
print()

# https://codeforces.com/problemset/problem/1220/A
