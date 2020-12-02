list = []
unique = []
n = input()
arr = (map(int,input().split()))
for i in arr:
    list.append(i)

for j in list:
    if j not in unique:
        unique.append(j)

n = sorted(unique)
print(n[-2])
