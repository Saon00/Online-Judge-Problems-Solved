grid = []
size = int(input())
for i in range(size):
    grid.append([int(x) for x in input().split()])

a = b = 0
for i in range(size):
    a += grid[i][i]
    b += grid[i][size - i - 1]

print(abs(a - b))
